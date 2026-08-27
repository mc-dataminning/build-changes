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

public class etx extends arf {
   private static final Logger c = LogUtils.getLogger();
   private Map<eut, List<ffu>> d = ImmutableMap.of();
   private List<ffu> e = ImmutableList.of();

   public void a(Iterable<cpn<?>> $$0, is $$1) {
      Map<eut, List<List<cpn<?>>>> $$2 = a($$0);
      Map<eut, List<ffu>> $$3 = Maps.newHashMap();
      Builder<ffu> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new ffu($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      eut.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<eut, List<List<cpn<?>>>> a(Iterable<cpn<?>> $$0) {
      Map<eut, List<List<cpn<?>>>> $$1 = Maps.newHashMap();
      Table<eut, String, List<cpn<?>>> $$2 = HashBasedTable.create();

      for (cpn<?> $$3 : $$0) {
         cpl<?> $$4 = $$3.b();
         if (!$$4.aq_() && !$$4.i()) {
            eut $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cpn<?>> $$7 = (List<cpn<?>>)$$2.get($$5, $$6);
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

   private static eut g(cpn<?> $$0) {
      cpl<?> $$1 = $$0.b();
      if ($$1 instanceof cpc $$2) {
         return switch ($$2.d()) {
            case a -> eut.b;
            case c -> eut.d;
            case b -> eut.c;
            case d -> eut.e;
         };
      } else {
         cpq<?> $$3 = $$1.e();
         if ($$1 instanceof cou $$4) {
            cpa $$5 = $$4.f();
            if ($$3 == cpq.b) {
               return switch ($$5) {
                  case b -> eut.h;
                  case a -> eut.g;
                  case c -> eut.i;
               };
            }

            if ($$3 == cpq.c) {
               return $$5 == cpa.b ? eut.k : eut.l;
            }

            if ($$3 == cpq.d) {
               return eut.n;
            }

            if ($$3 == cpq.e) {
               return eut.q;
            }
         }

         if ($$3 == cpq.f) {
            return eut.o;
         } else if ($$3 == cpq.g) {
            return eut.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> kb.s.b($$1.e())), LogUtils.defer($$0::a));
            return eut.r;
         }
      }
   }

   public List<ffu> b() {
      return this.e;
   }

   public List<ffu> a(eut $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
