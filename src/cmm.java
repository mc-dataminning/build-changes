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

public class cmm {
   private static final Logger a = LogUtils.getLogger();
   private final cmo b;
   private final Map<ajv, cml> c;
   private final cmn d;

   cmm(cmo $$0, cmn $$1, Map<ajv, cml> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cmn $$0) {
      return $$0.a(this.d);
   }

   public cmn a() {
      return this.d;
   }

   public cmn a(Iterable<ajv> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cmn a(cml... $$0) {
      return cmn.a(this.b, Arrays.asList($$0));
   }

   public cmn a(Iterable<ajv> $$0, Consumer<ajv> $$1) {
      Set<cml> $$2 = Sets.newIdentityHashSet();

      for (ajv $$3 : $$0) {
         cml $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cmn.a(this.b, $$2);
   }

   public Set<ajv> b(cmn $$0) {
      Set<ajv> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cmn> b() {
      return ajv.a.listOf().comapFlatMap($$0 -> {
         Set<ajv> $$1 = new HashSet<>();
         cmn $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cmo a;
      private int b;
      private final Map<ajv, cml> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cmo($$0);
      }

      public cml a(String $$0) {
         return this.a(new ajv("minecraft", $$0));
      }

      public cml a(ajv $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cml $$1 = new cml(this.a, this.b++);
            cml $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cmm a() {
         cmn $$0 = cmn.a(this.a, this.c.values());
         return new cmm(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
