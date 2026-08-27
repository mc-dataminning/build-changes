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

public class cdu {
   private static final Logger a = LogUtils.getLogger();
   private final cdw b;
   private final Map<aer, cdt> c;
   private final cdv d;

   cdu(cdw $$0, cdv $$1, Map<aer, cdt> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cdv $$0) {
      return $$0.a(this.d);
   }

   public cdv a() {
      return this.d;
   }

   public cdv a(Iterable<aer> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cdv a(cdt... $$0) {
      return cdv.a(this.b, Arrays.asList($$0));
   }

   public cdv a(Iterable<aer> $$0, Consumer<aer> $$1) {
      Set<cdt> $$2 = Sets.newIdentityHashSet();

      for (aer $$3 : $$0) {
         cdt $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cdv.a(this.b, $$2);
   }

   public Set<aer> b(cdv $$0) {
      Set<aer> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cdv> b() {
      return aer.a.listOf().comapFlatMap($$0 -> {
         Set<aer> $$1 = new HashSet<>();
         cdv $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cdw a;
      private int b;
      private final Map<aer, cdt> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cdw($$0);
      }

      public cdt a(String $$0) {
         return this.a(new aer("minecraft", $$0));
      }

      public cdt a(aer $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cdt $$1 = new cdt(this.a, this.b++);
            cdt $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cdu a() {
         cdv $$0 = cdv.a(this.a, this.c.values());
         return new cdu(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
