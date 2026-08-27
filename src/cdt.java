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

public class cdt {
   private static final Logger a = LogUtils.getLogger();
   private final cdv b;
   private final Map<aer, cds> c;
   private final cdu d;

   cdt(cdv $$0, cdu $$1, Map<aer, cds> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cdu $$0) {
      return $$0.a(this.d);
   }

   public cdu a() {
      return this.d;
   }

   public cdu a(Iterable<aer> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cdu a(cds... $$0) {
      return cdu.a(this.b, Arrays.asList($$0));
   }

   public cdu a(Iterable<aer> $$0, Consumer<aer> $$1) {
      Set<cds> $$2 = Sets.newIdentityHashSet();

      for (aer $$3 : $$0) {
         cds $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cdu.a(this.b, $$2);
   }

   public Set<aer> b(cdu $$0) {
      Set<aer> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cdu> b() {
      return aer.a.listOf().comapFlatMap($$0 -> {
         Set<aer> $$1 = new HashSet<>();
         cdu $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cdv a;
      private int b;
      private final Map<aer, cds> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cdv($$0);
      }

      public cds a(String $$0) {
         return this.a(new aer("minecraft", $$0));
      }

      public cds a(aer $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cds $$1 = new cds(this.a, this.b++);
            cds $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cdt a() {
         cdu $$0 = cdu.a(this.a, this.c.values());
         return new cdt(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
