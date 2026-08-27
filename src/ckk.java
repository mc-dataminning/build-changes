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

public class ckk {
   private static final Logger a = LogUtils.getLogger();
   private final ckm b;
   private final Map<ajc, ckj> c;
   private final ckl d;

   ckk(ckm $$0, ckl $$1, Map<ajc, ckj> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(ckl $$0) {
      return $$0.a(this.d);
   }

   public ckl a() {
      return this.d;
   }

   public ckl a(Iterable<ajc> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public ckl a(ckj... $$0) {
      return ckl.a(this.b, Arrays.asList($$0));
   }

   public ckl a(Iterable<ajc> $$0, Consumer<ajc> $$1) {
      Set<ckj> $$2 = Sets.newIdentityHashSet();

      for (ajc $$3 : $$0) {
         ckj $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return ckl.a(this.b, $$2);
   }

   public Set<ajc> b(ckl $$0) {
      Set<ajc> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<ckl> b() {
      return ajc.a.listOf().comapFlatMap($$0 -> {
         Set<ajc> $$1 = new HashSet<>();
         ckl $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final ckm a;
      private int b;
      private final Map<ajc, ckj> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new ckm($$0);
      }

      public ckj a(String $$0) {
         return this.a(new ajc("minecraft", $$0));
      }

      public ckj a(ajc $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            ckj $$1 = new ckj(this.a, this.b++);
            ckj $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public ckk a() {
         ckl $$0 = ckl.a(this.a, this.c.values());
         return new ckk(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
