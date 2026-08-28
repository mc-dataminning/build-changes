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

public class cpm {
   private static final Logger a = LogUtils.getLogger();
   private final cpo b;
   private final Map<alf, cpl> c;
   private final cpn d;

   cpm(cpo $$0, cpn $$1, Map<alf, cpl> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cpn $$0) {
      return $$0.a(this.d);
   }

   public cpn a() {
      return this.d;
   }

   public cpn a(Iterable<alf> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cpn a(cpl... $$0) {
      return cpn.a(this.b, Arrays.asList($$0));
   }

   public cpn a(Iterable<alf> $$0, Consumer<alf> $$1) {
      Set<cpl> $$2 = Sets.newIdentityHashSet();

      for (alf $$3 : $$0) {
         cpl $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cpn.a(this.b, $$2);
   }

   public Set<alf> b(cpn $$0) {
      Set<alf> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cpn> b() {
      return alf.a.listOf().comapFlatMap($$0 -> {
         Set<alf> $$1 = new HashSet<>();
         cpn $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cpo a;
      private int b;
      private final Map<alf, cpl> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cpo($$0);
      }

      public cpl a(String $$0) {
         return this.a(new alf("minecraft", $$0));
      }

      public cpl a(alf $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cpl $$1 = new cpl(this.a, this.b++);
            cpl $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cpm a() {
         cpn $$0 = cpn.a(this.a, this.c.values());
         return new cpm(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
