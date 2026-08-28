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

public class csn {
   private static final Logger a = LogUtils.getLogger();
   private final csp b;
   private final Map<alz, csm> c;
   private final cso d;

   csn(csp $$0, cso $$1, Map<alz, csm> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cso $$0) {
      return $$0.a(this.d);
   }

   public cso a() {
      return this.d;
   }

   public cso a(Iterable<alz> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cso a(csm... $$0) {
      return cso.a(this.b, Arrays.asList($$0));
   }

   public cso a(Iterable<alz> $$0, Consumer<alz> $$1) {
      Set<csm> $$2 = Sets.newIdentityHashSet();

      for (alz $$3 : $$0) {
         csm $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cso.a(this.b, $$2);
   }

   public Set<alz> b(cso $$0) {
      Set<alz> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cso> b() {
      return alz.a.listOf().comapFlatMap($$0 -> {
         Set<alz> $$1 = new HashSet<>();
         cso $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final csp a;
      private int b;
      private final Map<alz, csm> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new csp($$0);
      }

      public csm a(String $$0) {
         return this.a(alz.b($$0));
      }

      public csm a(alz $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            csm $$1 = new csm(this.a, this.b++);
            csm $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public csn a() {
         cso $$0 = cso.a(this.a, this.c.values());
         return new csn(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
