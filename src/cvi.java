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

public class cvi {
   private static final Logger a = LogUtils.getLogger();
   private final cvk b;
   private final Map<alk, cvh> c;
   private final cvj d;

   cvi(cvk $$0, cvj $$1, Map<alk, cvh> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cvj $$0) {
      return $$0.a(this.d);
   }

   public cvj a() {
      return this.d;
   }

   public cvj a(Iterable<alk> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cvj a(cvh... $$0) {
      return cvj.a(this.b, Arrays.asList($$0));
   }

   public cvj a(Iterable<alk> $$0, Consumer<alk> $$1) {
      Set<cvh> $$2 = Sets.newIdentityHashSet();

      for (alk $$3 : $$0) {
         cvh $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cvj.a(this.b, $$2);
   }

   public Set<alk> b(cvj $$0) {
      Set<alk> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cvj> b() {
      return alk.a.listOf().comapFlatMap($$0 -> {
         Set<alk> $$1 = new HashSet<>();
         cvj $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cvk a;
      private int b;
      private final Map<alk, cvh> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cvk($$0);
      }

      public cvh a(String $$0) {
         return this.a(alk.b($$0));
      }

      public cvh a(alk $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cvh $$1 = new cvh(this.a, this.b++);
            cvh $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cvi a() {
         cvj $$0 = cvj.a(this.a, this.c.values());
         return new cvi(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
