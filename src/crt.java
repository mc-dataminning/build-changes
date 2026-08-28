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

public class crt {
   private static final Logger a = LogUtils.getLogger();
   private final crv b;
   private final Map<akv, crs> c;
   private final cru d;

   crt(crv $$0, cru $$1, Map<akv, crs> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cru $$0) {
      return $$0.a(this.d);
   }

   public cru a() {
      return this.d;
   }

   public cru a(Iterable<akv> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cru a(crs... $$0) {
      return cru.a(this.b, Arrays.asList($$0));
   }

   public cru a(Iterable<akv> $$0, Consumer<akv> $$1) {
      Set<crs> $$2 = Sets.newIdentityHashSet();

      for (akv $$3 : $$0) {
         crs $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cru.a(this.b, $$2);
   }

   public Set<akv> b(cru $$0) {
      Set<akv> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cru> b() {
      return akv.a.listOf().comapFlatMap($$0 -> {
         Set<akv> $$1 = new HashSet<>();
         cru $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final crv a;
      private int b;
      private final Map<akv, crs> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new crv($$0);
      }

      public crs a(String $$0) {
         return this.a(akv.b($$0));
      }

      public crs a(akv $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            crs $$1 = new crs(this.a, this.b++);
            crs $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public crt a() {
         cru $$0 = cru.a(this.a, this.c.values());
         return new crt(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
