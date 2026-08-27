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

public class cnt {
   private static final Logger a = LogUtils.getLogger();
   private final cnv b;
   private final Map<akh, cns> c;
   private final cnu d;

   cnt(cnv $$0, cnu $$1, Map<akh, cns> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cnu $$0) {
      return $$0.a(this.d);
   }

   public cnu a() {
      return this.d;
   }

   public cnu a(Iterable<akh> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cnu a(cns... $$0) {
      return cnu.a(this.b, Arrays.asList($$0));
   }

   public cnu a(Iterable<akh> $$0, Consumer<akh> $$1) {
      Set<cns> $$2 = Sets.newIdentityHashSet();

      for (akh $$3 : $$0) {
         cns $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cnu.a(this.b, $$2);
   }

   public Set<akh> b(cnu $$0) {
      Set<akh> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cnu> b() {
      return akh.a.listOf().comapFlatMap($$0 -> {
         Set<akh> $$1 = new HashSet<>();
         cnu $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cnv a;
      private int b;
      private final Map<akh, cns> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cnv($$0);
      }

      public cns a(String $$0) {
         return this.a(new akh("minecraft", $$0));
      }

      public cns a(akh $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cns $$1 = new cns(this.a, this.b++);
            cns $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cnt a() {
         cnu $$0 = cnu.a(this.a, this.c.values());
         return new cnt(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
