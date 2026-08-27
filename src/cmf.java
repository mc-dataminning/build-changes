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

public class cmf {
   private static final Logger a = LogUtils.getLogger();
   private final cmh b;
   private final Map<ajt, cme> c;
   private final cmg d;

   cmf(cmh $$0, cmg $$1, Map<ajt, cme> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cmg $$0) {
      return $$0.a(this.d);
   }

   public cmg a() {
      return this.d;
   }

   public cmg a(Iterable<ajt> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cmg a(cme... $$0) {
      return cmg.a(this.b, Arrays.asList($$0));
   }

   public cmg a(Iterable<ajt> $$0, Consumer<ajt> $$1) {
      Set<cme> $$2 = Sets.newIdentityHashSet();

      for (ajt $$3 : $$0) {
         cme $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cmg.a(this.b, $$2);
   }

   public Set<ajt> b(cmg $$0) {
      Set<ajt> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cmg> b() {
      return ajt.a.listOf().comapFlatMap($$0 -> {
         Set<ajt> $$1 = new HashSet<>();
         cmg $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cmh a;
      private int b;
      private final Map<ajt, cme> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cmh($$0);
      }

      public cme a(String $$0) {
         return this.a(new ajt("minecraft", $$0));
      }

      public cme a(ajt $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cme $$1 = new cme(this.a, this.b++);
            cme $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cmf a() {
         cmg $$0 = cmg.a(this.a, this.c.values());
         return new cmf(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
