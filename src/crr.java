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

public class crr {
   private static final Logger a = LogUtils.getLogger();
   private final crt b;
   private final Map<akv, crq> c;
   private final crs d;

   crr(crt $$0, crs $$1, Map<akv, crq> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(crs $$0) {
      return $$0.a(this.d);
   }

   public crs a() {
      return this.d;
   }

   public crs a(Iterable<akv> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public crs a(crq... $$0) {
      return crs.a(this.b, Arrays.asList($$0));
   }

   public crs a(Iterable<akv> $$0, Consumer<akv> $$1) {
      Set<crq> $$2 = Sets.newIdentityHashSet();

      for (akv $$3 : $$0) {
         crq $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return crs.a(this.b, $$2);
   }

   public Set<akv> b(crs $$0) {
      Set<akv> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<crs> b() {
      return akv.a.listOf().comapFlatMap($$0 -> {
         Set<akv> $$1 = new HashSet<>();
         crs $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final crt a;
      private int b;
      private final Map<akv, crq> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new crt($$0);
      }

      public crq a(String $$0) {
         return this.a(akv.b($$0));
      }

      public crq a(akv $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            crq $$1 = new crq(this.a, this.b++);
            crq $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public crr a() {
         crs $$0 = crs.a(this.a, this.c.values());
         return new crr(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
