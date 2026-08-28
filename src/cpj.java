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

public class cpj {
   private static final Logger a = LogUtils.getLogger();
   private final cpl b;
   private final Map<ale, cpi> c;
   private final cpk d;

   cpj(cpl $$0, cpk $$1, Map<ale, cpi> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cpk $$0) {
      return $$0.a(this.d);
   }

   public cpk a() {
      return this.d;
   }

   public cpk a(Iterable<ale> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cpk a(cpi... $$0) {
      return cpk.a(this.b, Arrays.asList($$0));
   }

   public cpk a(Iterable<ale> $$0, Consumer<ale> $$1) {
      Set<cpi> $$2 = Sets.newIdentityHashSet();

      for (ale $$3 : $$0) {
         cpi $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cpk.a(this.b, $$2);
   }

   public Set<ale> b(cpk $$0) {
      Set<ale> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cpk> b() {
      return ale.a.listOf().comapFlatMap($$0 -> {
         Set<ale> $$1 = new HashSet<>();
         cpk $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cpl a;
      private int b;
      private final Map<ale, cpi> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cpl($$0);
      }

      public cpi a(String $$0) {
         return this.a(new ale("minecraft", $$0));
      }

      public cpi a(ale $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cpi $$1 = new cpi(this.a, this.b++);
            cpi $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cpj a() {
         cpk $$0 = cpk.a(this.a, this.c.values());
         return new cpj(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
