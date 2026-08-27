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

public class cds {
   private static final Logger a = LogUtils.getLogger();
   private final cdu b;
   private final Map<aep, cdr> c;
   private final cdt d;

   cds(cdu $$0, cdt $$1, Map<aep, cdr> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cdt $$0) {
      return $$0.a(this.d);
   }

   public cdt a() {
      return this.d;
   }

   public cdt a(Iterable<aep> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cdt a(cdr... $$0) {
      return cdt.a(this.b, Arrays.asList($$0));
   }

   public cdt a(Iterable<aep> $$0, Consumer<aep> $$1) {
      Set<cdr> $$2 = Sets.newIdentityHashSet();

      for (aep $$3 : $$0) {
         cdr $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cdt.a(this.b, $$2);
   }

   public Set<aep> b(cdt $$0) {
      Set<aep> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cdt> b() {
      return aep.a.listOf().comapFlatMap($$0 -> {
         Set<aep> $$1 = new HashSet<>();
         cdt $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cdu a;
      private int b;
      private final Map<aep, cdr> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cdu($$0);
      }

      public cdr a(String $$0) {
         return this.a(new aep("minecraft", $$0));
      }

      public cdr a(aep $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cdr $$1 = new cdr(this.a, this.b++);
            cdr $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cds a() {
         cdt $$0 = cdt.a(this.a, this.c.values());
         return new cds(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
