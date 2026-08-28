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

public class css {
   private static final Logger a = LogUtils.getLogger();
   private final csu b;
   private final Map<alz, csr> c;
   private final cst d;

   css(csu $$0, cst $$1, Map<alz, csr> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cst $$0) {
      return $$0.a(this.d);
   }

   public cst a() {
      return this.d;
   }

   public cst a(Iterable<alz> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cst a(csr... $$0) {
      return cst.a(this.b, Arrays.asList($$0));
   }

   public cst a(Iterable<alz> $$0, Consumer<alz> $$1) {
      Set<csr> $$2 = Sets.newIdentityHashSet();

      for (alz $$3 : $$0) {
         csr $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cst.a(this.b, $$2);
   }

   public Set<alz> b(cst $$0) {
      Set<alz> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cst> b() {
      return alz.a.listOf().comapFlatMap($$0 -> {
         Set<alz> $$1 = new HashSet<>();
         cst $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final csu a;
      private int b;
      private final Map<alz, csr> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new csu($$0);
      }

      public csr a(String $$0) {
         return this.a(alz.b($$0));
      }

      public csr a(alz $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            csr $$1 = new csr(this.a, this.b++);
            csr $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public css a() {
         cst $$0 = cst.a(this.a, this.c.values());
         return new css(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
