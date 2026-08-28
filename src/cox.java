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

public class cox {
   private static final Logger a = LogUtils.getLogger();
   private final coz b;
   private final Map<akk, cow> c;
   private final coy d;

   cox(coz $$0, coy $$1, Map<akk, cow> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(coy $$0) {
      return $$0.a(this.d);
   }

   public coy a() {
      return this.d;
   }

   public coy a(Iterable<akk> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public coy a(cow... $$0) {
      return coy.a(this.b, Arrays.asList($$0));
   }

   public coy a(Iterable<akk> $$0, Consumer<akk> $$1) {
      Set<cow> $$2 = Sets.newIdentityHashSet();

      for (akk $$3 : $$0) {
         cow $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return coy.a(this.b, $$2);
   }

   public Set<akk> b(coy $$0) {
      Set<akk> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<coy> b() {
      return akk.a.listOf().comapFlatMap($$0 -> {
         Set<akk> $$1 = new HashSet<>();
         coy $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final coz a;
      private int b;
      private final Map<akk, cow> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new coz($$0);
      }

      public cow a(String $$0) {
         return this.a(new akk("minecraft", $$0));
      }

      public cow a(akk $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cow $$1 = new cow(this.a, this.b++);
            cow $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cox a() {
         coy $$0 = coy.a(this.a, this.c.values());
         return new cox(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
