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

public class cqz {
   private static final Logger a = LogUtils.getLogger();
   private final crb b;
   private final Map<alh, cqy> c;
   private final cra d;

   cqz(crb $$0, cra $$1, Map<alh, cqy> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cra $$0) {
      return $$0.a(this.d);
   }

   public cra a() {
      return this.d;
   }

   public cra a(Iterable<alh> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cra a(cqy... $$0) {
      return cra.a(this.b, Arrays.asList($$0));
   }

   public cra a(Iterable<alh> $$0, Consumer<alh> $$1) {
      Set<cqy> $$2 = Sets.newIdentityHashSet();

      for (alh $$3 : $$0) {
         cqy $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cra.a(this.b, $$2);
   }

   public Set<alh> b(cra $$0) {
      Set<alh> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cra> b() {
      return alh.a.listOf().comapFlatMap($$0 -> {
         Set<alh> $$1 = new HashSet<>();
         cra $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final crb a;
      private int b;
      private final Map<alh, cqy> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new crb($$0);
      }

      public cqy a(String $$0) {
         return this.a(alh.b($$0));
      }

      public cqy a(alh $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cqy $$1 = new cqy(this.a, this.b++);
            cqy $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cqz a() {
         cra $$0 = cra.a(this.a, this.c.values());
         return new cqz(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
