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

public class euv extends arv {
   private static final Logger c = LogUtils.getLogger();
   private Map<evr, List<fgt>> d = ImmutableMap.of();
   private List<fgt> e = ImmutableList.of();

   public void a(Iterable<cqe<?>> $$0, iu $$1) {
      Map<evr, List<List<cqe<?>>>> $$2 = a($$0);
      Map<evr, List<fgt>> $$3 = Maps.newHashMap();
      Builder<fgt> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fgt($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      evr.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<evr, List<List<cqe<?>>>> a(Iterable<cqe<?>> $$0) {
      Map<evr, List<List<cqe<?>>>> $$1 = Maps.newHashMap();
      Table<evr, String, List<cqe<?>>> $$2 = HashBasedTable.create();

      for (cqe<?> $$3 : $$0) {
         cqc<?> $$4 = $$3.b();
         if (!$$4.aq_() && !$$4.i()) {
            evr $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cqe<?>> $$7 = (List<cqe<?>>)$$2.get($$5, $$6);
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

   private static evr g(cqe<?> $$0) {
      cqc<?> $$1 = $$0.b();
      if ($$1 instanceof cpt $$2) {
         return switch ($$2.d()) {
            case a -> evr.b;
            case c -> evr.d;
            case b -> evr.c;
            case d -> evr.e;
         };
      } else {
         cqh<?> $$3 = $$1.e();
         if ($$1 instanceof cpl $$4) {
            cpr $$5 = $$4.f();
            if ($$3 == cqh.b) {
               return switch ($$5) {
                  case b -> evr.h;
                  case a -> evr.g;
                  case c -> evr.i;
               };
            }

            if ($$3 == cqh.c) {
               return $$5 == cpr.b ? evr.k : evr.l;
            }

            if ($$3 == cqh.d) {
               return evr.n;
            }

            if ($$3 == cqh.e) {
               return evr.q;
            }
         }

         if ($$3 == cqh.f) {
            return evr.o;
         } else if ($$3 == cqh.g) {
            return evr.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> kd.s.b($$1.e())), LogUtils.defer($$0::a));
            return evr.r;
         }
      }
   }

   public List<fgt> b() {
      return this.e;
   }

   public List<fgt> a(evr $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
