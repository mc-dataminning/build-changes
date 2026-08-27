import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class chk {
   private static final Logger a = LogUtils.getLogger();
   private final chm b;
   private final Map<ahd, chj> c;
   private final chl d;

   chk(chm $$0, chl $$1, Map<ahd, chj> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(chl $$0) {
      return $$0.a(this.d);
   }

   public chl a() {
      return this.d;
   }

   public chl a(Iterable<ahd> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public chl a(chj... $$0) {
      return chl.a(this.b, Arrays.asList($$0));
   }

   public chl a(Iterable<ahd> $$0, Consumer<ahd> $$1) {
      Set<chj> $$2 = Sets.newIdentityHashSet();

      for (ahd $$3 : $$0) {
         chj $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return chl.a(this.b, $$2);
   }

   public Set<ahd> b(chl $$0) {
      Set<ahd> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<chl> b() {
      return ahd.a.listOf().comapFlatMap($$0 -> {
         Set<ahd> $$1 = new HashSet<>();
         chl $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final chm a;
      private int b;
      private final Map<ahd, chj> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new chm($$0);
      }

      public chj a(String $$0) {
         return this.a(new ahd("minecraft", $$0));
      }

      public chj a(ahd $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            chj $$1 = new chj(this.a, this.b++);
            chj $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public chk a() {
         chl $$0 = chl.a(this.a, this.c.values());
         return new chk(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
