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

public class cuv {
   private static final Logger a = LogUtils.getLogger();
   private final cux b;
   private final Map<alg, cuu> c;
   private final cuw d;

   cuv(cux $$0, cuw $$1, Map<alg, cuu> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cuw $$0) {
      return $$0.a(this.d);
   }

   public cuw a() {
      return this.d;
   }

   public cuw a(Iterable<alg> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cuw a(cuu... $$0) {
      return cuw.a(this.b, Arrays.asList($$0));
   }

   public cuw a(Iterable<alg> $$0, Consumer<alg> $$1) {
      Set<cuu> $$2 = Sets.newIdentityHashSet();

      for (alg $$3 : $$0) {
         cuu $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cuw.a(this.b, $$2);
   }

   public Set<alg> b(cuw $$0) {
      Set<alg> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cuw> b() {
      return alg.a.listOf().comapFlatMap($$0 -> {
         Set<alg> $$1 = new HashSet<>();
         cuw $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cux a;
      private int b;
      private final Map<alg, cuu> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cux($$0);
      }

      public cuu a(String $$0) {
         return this.a(alg.b($$0));
      }

      public cuu a(alg $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cuu $$1 = new cuu(this.a, this.b++);
            cuu $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cuv a() {
         cuw $$0 = cuw.a(this.a, this.c.values());
         return new cuv(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
