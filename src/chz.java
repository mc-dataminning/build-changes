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

public class chz {
   private static final Logger a = LogUtils.getLogger();
   private final cib b;
   private final Map<ahh, chy> c;
   private final cia d;

   chz(cib $$0, cia $$1, Map<ahh, chy> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cia $$0) {
      return $$0.a(this.d);
   }

   public cia a() {
      return this.d;
   }

   public cia a(Iterable<ahh> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cia a(chy... $$0) {
      return cia.a(this.b, Arrays.asList($$0));
   }

   public cia a(Iterable<ahh> $$0, Consumer<ahh> $$1) {
      Set<chy> $$2 = Sets.newIdentityHashSet();

      for (ahh $$3 : $$0) {
         chy $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cia.a(this.b, $$2);
   }

   public Set<ahh> b(cia $$0) {
      Set<ahh> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cia> b() {
      return ahh.a.listOf().comapFlatMap($$0 -> {
         Set<ahh> $$1 = new HashSet<>();
         cia $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cib a;
      private int b;
      private final Map<ahh, chy> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cib($$0);
      }

      public chy a(String $$0) {
         return this.a(new ahh("minecraft", $$0));
      }

      public chy a(ahh $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            chy $$1 = new chy(this.a, this.b++);
            chy $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public chz a() {
         cia $$0 = cia.a(this.a, this.c.values());
         return new chz(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
