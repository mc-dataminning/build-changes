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

public class cug {
   private static final Logger a = LogUtils.getLogger();
   private final cui b;
   private final Map<alg, cuf> c;
   private final cuh d;

   cug(cui $$0, cuh $$1, Map<alg, cuf> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cuh $$0) {
      return $$0.a(this.d);
   }

   public cuh a() {
      return this.d;
   }

   public cuh a(Iterable<alg> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cuh a(cuf... $$0) {
      return cuh.a(this.b, Arrays.asList($$0));
   }

   public cuh a(Iterable<alg> $$0, Consumer<alg> $$1) {
      Set<cuf> $$2 = Sets.newIdentityHashSet();

      for (alg $$3 : $$0) {
         cuf $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cuh.a(this.b, $$2);
   }

   public Set<alg> b(cuh $$0) {
      Set<alg> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cuh> b() {
      return alg.a.listOf().comapFlatMap($$0 -> {
         Set<alg> $$1 = new HashSet<>();
         cuh $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cui a;
      private int b;
      private final Map<alg, cuf> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cui($$0);
      }

      public cuf a(String $$0) {
         return this.a(alg.b($$0));
      }

      public cuf a(alg $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cuf $$1 = new cuf(this.a, this.b++);
            cuf $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cug a() {
         cuh $$0 = cuh.a(this.a, this.c.values());
         return new cug(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
