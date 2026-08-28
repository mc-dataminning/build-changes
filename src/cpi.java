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

public class cpi {
   private static final Logger a = LogUtils.getLogger();
   private final cpk b;
   private final Map<ale, cph> c;
   private final cpj d;

   cpi(cpk $$0, cpj $$1, Map<ale, cph> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cpj $$0) {
      return $$0.a(this.d);
   }

   public cpj a() {
      return this.d;
   }

   public cpj a(Iterable<ale> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cpj a(cph... $$0) {
      return cpj.a(this.b, Arrays.asList($$0));
   }

   public cpj a(Iterable<ale> $$0, Consumer<ale> $$1) {
      Set<cph> $$2 = Sets.newIdentityHashSet();

      for (ale $$3 : $$0) {
         cph $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cpj.a(this.b, $$2);
   }

   public Set<ale> b(cpj $$0) {
      Set<ale> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cpj> b() {
      return ale.a.listOf().comapFlatMap($$0 -> {
         Set<ale> $$1 = new HashSet<>();
         cpj $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cpk a;
      private int b;
      private final Map<ale, cph> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cpk($$0);
      }

      public cph a(String $$0) {
         return this.a(new ale("minecraft", $$0));
      }

      public cph a(ale $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cph $$1 = new cph(this.a, this.b++);
            cph $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cpi a() {
         cpj $$0 = cpj.a(this.a, this.c.values());
         return new cpi(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
