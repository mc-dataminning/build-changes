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

public class coi {
   private static final Logger a = LogUtils.getLogger();
   private final cok b;
   private final Map<akm, coh> c;
   private final coj d;

   coi(cok $$0, coj $$1, Map<akm, coh> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(coj $$0) {
      return $$0.a(this.d);
   }

   public coj a() {
      return this.d;
   }

   public coj a(Iterable<akm> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public coj a(coh... $$0) {
      return coj.a(this.b, Arrays.asList($$0));
   }

   public coj a(Iterable<akm> $$0, Consumer<akm> $$1) {
      Set<coh> $$2 = Sets.newIdentityHashSet();

      for (akm $$3 : $$0) {
         coh $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return coj.a(this.b, $$2);
   }

   public Set<akm> b(coj $$0) {
      Set<akm> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<coj> b() {
      return akm.a.listOf().comapFlatMap($$0 -> {
         Set<akm> $$1 = new HashSet<>();
         coj $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cok a;
      private int b;
      private final Map<akm, coh> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cok($$0);
      }

      public coh a(String $$0) {
         return this.a(new akm("minecraft", $$0));
      }

      public coh a(akm $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            coh $$1 = new coh(this.a, this.b++);
            coh $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public coi a() {
         coj $$0 = coj.a(this.a, this.c.values());
         return new coi(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
