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

public class cff {
   private static final Logger a = LogUtils.getLogger();
   private final cfh b;
   private final Map<afw, cfe> c;
   private final cfg d;

   cff(cfh $$0, cfg $$1, Map<afw, cfe> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cfg $$0) {
      return $$0.a(this.d);
   }

   public cfg a() {
      return this.d;
   }

   public cfg a(Iterable<afw> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cfg a(cfe... $$0) {
      return cfg.a(this.b, Arrays.asList($$0));
   }

   public cfg a(Iterable<afw> $$0, Consumer<afw> $$1) {
      Set<cfe> $$2 = Sets.newIdentityHashSet();

      for (afw $$3 : $$0) {
         cfe $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cfg.a(this.b, $$2);
   }

   public Set<afw> b(cfg $$0) {
      Set<afw> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cfg> b() {
      return afw.a.listOf().comapFlatMap($$0 -> {
         Set<afw> $$1 = new HashSet<>();
         cfg $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cfh a;
      private int b;
      private final Map<afw, cfe> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cfh($$0);
      }

      public cfe a(String $$0) {
         return this.a(new afw("minecraft", $$0));
      }

      public cfe a(afw $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cfe $$1 = new cfe(this.a, this.b++);
            cfe $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cff a() {
         cfg $$0 = cfg.a(this.a, this.c.values());
         return new cff(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
