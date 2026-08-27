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

public class coo {
   private static final Logger a = LogUtils.getLogger();
   private final coq b;
   private final Map<akt, com> c;
   private final cop d;

   coo(coq $$0, cop $$1, Map<akt, com> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cop $$0) {
      return $$0.a(this.d);
   }

   public cop a() {
      return this.d;
   }

   public cop a(Iterable<akt> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cop a(com... $$0) {
      return cop.a(this.b, Arrays.asList($$0));
   }

   public cop a(Iterable<akt> $$0, Consumer<akt> $$1) {
      Set<com> $$2 = Sets.newIdentityHashSet();

      for (akt $$3 : $$0) {
         com $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cop.a(this.b, $$2);
   }

   public Set<akt> b(cop $$0) {
      Set<akt> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cop> b() {
      return akt.a.listOf().comapFlatMap($$0 -> {
         Set<akt> $$1 = new HashSet<>();
         cop $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final coq a;
      private int b;
      private final Map<akt, com> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new coq($$0);
      }

      public com a(String $$0) {
         return this.a(new akt("minecraft", $$0));
      }

      public com a(akt $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            com $$1 = new com(this.a, this.b++);
            com $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public coo a() {
         cop $$0 = cop.a(this.a, this.c.values());
         return new coo(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
