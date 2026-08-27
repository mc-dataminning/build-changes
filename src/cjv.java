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

public class cjv {
   private static final Logger a = LogUtils.getLogger();
   private final cjx b;
   private final Map<aiy, cju> c;
   private final cjw d;

   cjv(cjx $$0, cjw $$1, Map<aiy, cju> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cjw $$0) {
      return $$0.a(this.d);
   }

   public cjw a() {
      return this.d;
   }

   public cjw a(Iterable<aiy> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cjw a(cju... $$0) {
      return cjw.a(this.b, Arrays.asList($$0));
   }

   public cjw a(Iterable<aiy> $$0, Consumer<aiy> $$1) {
      Set<cju> $$2 = Sets.newIdentityHashSet();

      for (aiy $$3 : $$0) {
         cju $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cjw.a(this.b, $$2);
   }

   public Set<aiy> b(cjw $$0) {
      Set<aiy> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cjw> b() {
      return aiy.a.listOf().comapFlatMap($$0 -> {
         Set<aiy> $$1 = new HashSet<>();
         cjw $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cjx a;
      private int b;
      private final Map<aiy, cju> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cjx($$0);
      }

      public cju a(String $$0) {
         return this.a(new aiy("minecraft", $$0));
      }

      public cju a(aiy $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cju $$1 = new cju(this.a, this.b++);
            cju $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cjv a() {
         cjw $$0 = cjw.a(this.a, this.c.values());
         return new cjv(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
