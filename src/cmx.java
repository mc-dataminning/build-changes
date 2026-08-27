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

public class cmx {
   private static final Logger a = LogUtils.getLogger();
   private final cmz b;
   private final Map<akf, cmw> c;
   private final cmy d;

   cmx(cmz $$0, cmy $$1, Map<akf, cmw> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cmy $$0) {
      return $$0.a(this.d);
   }

   public cmy a() {
      return this.d;
   }

   public cmy a(Iterable<akf> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cmy a(cmw... $$0) {
      return cmy.a(this.b, Arrays.asList($$0));
   }

   public cmy a(Iterable<akf> $$0, Consumer<akf> $$1) {
      Set<cmw> $$2 = Sets.newIdentityHashSet();

      for (akf $$3 : $$0) {
         cmw $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cmy.a(this.b, $$2);
   }

   public Set<akf> b(cmy $$0) {
      Set<akf> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cmy> b() {
      return akf.a.listOf().comapFlatMap($$0 -> {
         Set<akf> $$1 = new HashSet<>();
         cmy $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cmz a;
      private int b;
      private final Map<akf, cmw> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cmz($$0);
      }

      public cmw a(String $$0) {
         return this.a(new akf("minecraft", $$0));
      }

      public cmw a(akf $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cmw $$1 = new cmw(this.a, this.b++);
            cmw $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cmx a() {
         cmy $$0 = cmy.a(this.a, this.c.values());
         return new cmx(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
