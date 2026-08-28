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

public class crp {
   private static final Logger a = LogUtils.getLogger();
   private final crr b;
   private final Map<alj, cro> c;
   private final crq d;

   crp(crr $$0, crq $$1, Map<alj, cro> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(crq $$0) {
      return $$0.a(this.d);
   }

   public crq a() {
      return this.d;
   }

   public crq a(Iterable<alj> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public crq a(cro... $$0) {
      return crq.a(this.b, Arrays.asList($$0));
   }

   public crq a(Iterable<alj> $$0, Consumer<alj> $$1) {
      Set<cro> $$2 = Sets.newIdentityHashSet();

      for (alj $$3 : $$0) {
         cro $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return crq.a(this.b, $$2);
   }

   public Set<alj> b(crq $$0) {
      Set<alj> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<crq> b() {
      return alj.a.listOf().comapFlatMap($$0 -> {
         Set<alj> $$1 = new HashSet<>();
         crq $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final crr a;
      private int b;
      private final Map<alj, cro> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new crr($$0);
      }

      public cro a(String $$0) {
         return this.a(alj.b($$0));
      }

      public cro a(alj $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cro $$1 = new cro(this.a, this.b++);
            cro $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public crp a() {
         crq $$0 = crq.a(this.a, this.c.values());
         return new crp(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
