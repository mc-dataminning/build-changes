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

public class cpk {
   private static final Logger a = LogUtils.getLogger();
   private final cpm b;
   private final Map<alf, cpj> c;
   private final cpl d;

   cpk(cpm $$0, cpl $$1, Map<alf, cpj> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cpl $$0) {
      return $$0.a(this.d);
   }

   public cpl a() {
      return this.d;
   }

   public cpl a(Iterable<alf> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cpl a(cpj... $$0) {
      return cpl.a(this.b, Arrays.asList($$0));
   }

   public cpl a(Iterable<alf> $$0, Consumer<alf> $$1) {
      Set<cpj> $$2 = Sets.newIdentityHashSet();

      for (alf $$3 : $$0) {
         cpj $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cpl.a(this.b, $$2);
   }

   public Set<alf> b(cpl $$0) {
      Set<alf> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cpl> b() {
      return alf.a.listOf().comapFlatMap($$0 -> {
         Set<alf> $$1 = new HashSet<>();
         cpl $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cpm a;
      private int b;
      private final Map<alf, cpj> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cpm($$0);
      }

      public cpj a(String $$0) {
         return this.a(new alf("minecraft", $$0));
      }

      public cpj a(alf $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cpj $$1 = new cpj(this.a, this.b++);
            cpj $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cpk a() {
         cpl $$0 = cpl.a(this.a, this.c.values());
         return new cpk(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
