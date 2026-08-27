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

public class ceh {
   private static final Logger a = LogUtils.getLogger();
   private final cej b;
   private final Map<aez, ceg> c;
   private final cei d;

   ceh(cej $$0, cei $$1, Map<aez, ceg> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cei $$0) {
      return $$0.a(this.d);
   }

   public cei a() {
      return this.d;
   }

   public cei a(Iterable<aez> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cei a(ceg... $$0) {
      return cei.a(this.b, Arrays.asList($$0));
   }

   public cei a(Iterable<aez> $$0, Consumer<aez> $$1) {
      Set<ceg> $$2 = Sets.newIdentityHashSet();

      for (aez $$3 : $$0) {
         ceg $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cei.a(this.b, $$2);
   }

   public Set<aez> b(cei $$0) {
      Set<aez> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cei> b() {
      return aez.a.listOf().comapFlatMap($$0 -> {
         Set<aez> $$1 = new HashSet<>();
         cei $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cej a;
      private int b;
      private final Map<aez, ceg> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cej($$0);
      }

      public ceg a(String $$0) {
         return this.a(new aez("minecraft", $$0));
      }

      public ceg a(aez $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            ceg $$1 = new ceg(this.a, this.b++);
            ceg $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public ceh a() {
         cei $$0 = cei.a(this.a, this.c.values());
         return new ceh(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
