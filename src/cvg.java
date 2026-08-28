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

public class cvg {
   private static final Logger a = LogUtils.getLogger();
   private final cvi b;
   private final Map<ali, cvf> c;
   private final cvh d;

   cvg(cvi $$0, cvh $$1, Map<ali, cvf> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cvh $$0) {
      return $$0.a(this.d);
   }

   public cvh a() {
      return this.d;
   }

   public cvh a(Iterable<ali> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cvh a(cvf... $$0) {
      return cvh.a(this.b, Arrays.asList($$0));
   }

   public cvh a(Iterable<ali> $$0, Consumer<ali> $$1) {
      Set<cvf> $$2 = Sets.newIdentityHashSet();

      for (ali $$3 : $$0) {
         cvf $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cvh.a(this.b, $$2);
   }

   public Set<ali> b(cvh $$0) {
      Set<ali> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cvh> b() {
      return ali.a.listOf().comapFlatMap($$0 -> {
         Set<ali> $$1 = new HashSet<>();
         cvh $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cvi a;
      private int b;
      private final Map<ali, cvf> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cvi($$0);
      }

      public cvf a(String $$0) {
         return this.a(ali.b($$0));
      }

      public cvf a(ali $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cvf $$1 = new cvf(this.a, this.b++);
            cvf $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cvg a() {
         cvh $$0 = cvh.a(this.a, this.c.values());
         return new cvg(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
