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

public class csm {
   private static final Logger a = LogUtils.getLogger();
   private final cso b;
   private final Map<aku, csl> c;
   private final csn d;

   csm(cso $$0, csn $$1, Map<aku, csl> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(csn $$0) {
      return $$0.a(this.d);
   }

   public csn a() {
      return this.d;
   }

   public csn a(Iterable<aku> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public csn a(csl... $$0) {
      return csn.a(this.b, Arrays.asList($$0));
   }

   public csn a(Iterable<aku> $$0, Consumer<aku> $$1) {
      Set<csl> $$2 = Sets.newIdentityHashSet();

      for (aku $$3 : $$0) {
         csl $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return csn.a(this.b, $$2);
   }

   public Set<aku> b(csn $$0) {
      Set<aku> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<csn> b() {
      return aku.a.listOf().comapFlatMap($$0 -> {
         Set<aku> $$1 = new HashSet<>();
         csn $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cso a;
      private int b;
      private final Map<aku, csl> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cso($$0);
      }

      public csl a(String $$0) {
         return this.a(aku.b($$0));
      }

      public csl a(aku $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            csl $$1 = new csl(this.a, this.b++);
            csl $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public csm a() {
         csn $$0 = csn.a(this.a, this.c.values());
         return new csm(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
