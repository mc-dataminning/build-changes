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

public class clg {
   private static final Logger a = LogUtils.getLogger();
   private final cli b;
   private final Map<ajh, clf> c;
   private final clh d;

   clg(cli $$0, clh $$1, Map<ajh, clf> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(clh $$0) {
      return $$0.a(this.d);
   }

   public clh a() {
      return this.d;
   }

   public clh a(Iterable<ajh> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public clh a(clf... $$0) {
      return clh.a(this.b, Arrays.asList($$0));
   }

   public clh a(Iterable<ajh> $$0, Consumer<ajh> $$1) {
      Set<clf> $$2 = Sets.newIdentityHashSet();

      for (ajh $$3 : $$0) {
         clf $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return clh.a(this.b, $$2);
   }

   public Set<ajh> b(clh $$0) {
      Set<ajh> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<clh> b() {
      return ajh.a.listOf().comapFlatMap($$0 -> {
         Set<ajh> $$1 = new HashSet<>();
         clh $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cli a;
      private int b;
      private final Map<ajh, clf> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cli($$0);
      }

      public clf a(String $$0) {
         return this.a(new ajh("minecraft", $$0));
      }

      public clf a(ajh $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            clf $$1 = new clf(this.a, this.b++);
            clf $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public clg a() {
         clh $$0 = clh.a(this.a, this.c.values());
         return new clg(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
