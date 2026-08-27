import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public class ese extends aqq {
   private static final Logger c = LogUtils.getLogger();
   private Map<eta, List<fdz>> d = ImmutableMap.of();
   private List<fdz> e = ImmutableList.of();

   public void a(Iterable<coh<?>> $$0, ip $$1) {
      Map<eta, List<List<coh<?>>>> $$2 = a($$0);
      Map<eta, List<fdz>> $$3 = Maps.newHashMap();
      Builder<fdz> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fdz($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      eta.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<eta, List<List<coh<?>>>> a(Iterable<coh<?>> $$0) {
      Map<eta, List<List<coh<?>>>> $$1 = Maps.newHashMap();
      Table<eta, String, List<coh<?>>> $$2 = HashBasedTable.create();

      for (coh<?> $$3 : $$0) {
         cof<?> $$4 = $$3.b();
         if (!$$4.ap_() && !$$4.i()) {
            eta $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<coh<?>> $$7 = (List<coh<?>>)$$2.get($$5, $$6);
               if ($$7 == null) {
                  $$7 = Lists.newArrayList();
                  $$2.put($$5, $$6, $$7);
                  $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add($$7);
               }

               $$7.add($$3);
            }
         }
      }

      return $$1;
   }

   private static eta g(coh<?> $$0) {
      cof<?> $$1 = $$0.b();
      if ($$1 instanceof cnv $$2) {
         return switch ($$2.d()) {
            case a -> eta.b;
            case c -> eta.d;
            case b -> eta.c;
            case d -> eta.e;
         };
      } else {
         cok<?> $$3 = $$1.e();
         if ($$1 instanceof cnn $$4) {
            cnt $$5 = $$4.f();
            if ($$3 == cok.b) {
               return switch ($$5) {
                  case b -> eta.h;
                  case a -> eta.g;
                  case c -> eta.i;
               };
            }

            if ($$3 == cok.c) {
               return $$5 == cnt.b ? eta.k : eta.l;
            }

            if ($$3 == cok.d) {
               return eta.n;
            }

            if ($$3 == cok.e) {
               return eta.q;
            }
         }

         if ($$3 == cok.f) {
            return eta.o;
         } else if ($$3 == cok.g) {
            return eta.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> jy.t.b($$1.e())), LogUtils.defer($$0::a));
            return eta.r;
         }
      }
   }

   public List<fdz> b() {
      return this.e;
   }

   public List<fdz> a(eta $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
