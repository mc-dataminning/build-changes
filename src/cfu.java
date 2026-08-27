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

public class cfu {
   private static final Logger a = LogUtils.getLogger();
   private final cfw b;
   private final Map<agg, cft> c;
   private final cfv d;

   cfu(cfw $$0, cfv $$1, Map<agg, cft> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cfv $$0) {
      return $$0.a(this.d);
   }

   public cfv a() {
      return this.d;
   }

   public cfv a(Iterable<agg> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cfv a(cft... $$0) {
      return cfv.a(this.b, Arrays.asList($$0));
   }

   public cfv a(Iterable<agg> $$0, Consumer<agg> $$1) {
      Set<cft> $$2 = Sets.newIdentityHashSet();

      for (agg $$3 : $$0) {
         cft $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cfv.a(this.b, $$2);
   }

   public Set<agg> b(cfv $$0) {
      Set<agg> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cfv> b() {
      return agg.a.listOf().comapFlatMap($$0 -> {
         Set<agg> $$1 = new HashSet<>();
         cfv $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cfw a;
      private int b;
      private final Map<agg, cft> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cfw($$0);
      }

      public cft a(String $$0) {
         return this.a(new agg("minecraft", $$0));
      }

      public cft a(agg $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cft $$1 = new cft(this.a, this.b++);
            cft $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cfu a() {
         cfv $$0 = cfv.a(this.a, this.c.values());
         return new cfu(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
