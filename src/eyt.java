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

public class eyt extends aub {
   private static final Logger c = LogUtils.getLogger();
   private Map<ezp, List<fkx>> d = ImmutableMap.of();
   private List<fkx> e = ImmutableList.of();

   public void a(Iterable<ctp<?>> $$0, iz $$1) {
      Map<ezp, List<List<ctp<?>>>> $$2 = a($$0);
      Map<ezp, List<fkx>> $$3 = Maps.newHashMap();
      Builder<fkx> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fkx($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      ezp.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<ezp, List<List<ctp<?>>>> a(Iterable<ctp<?>> $$0) {
      Map<ezp, List<List<ctp<?>>>> $$1 = Maps.newHashMap();
      Table<ezp, String, List<ctp<?>>> $$2 = HashBasedTable.create();

      for (ctp<?> $$3 : $$0) {
         ctn<?> $$4 = $$3.b();
         if (!$$4.aq_() && !$$4.i()) {
            ezp $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<ctp<?>> $$7 = (List<ctp<?>>)$$2.get($$5, $$6);
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

   private static ezp g(ctp<?> $$0) {
      ctn<?> $$1 = $$0.b();
      if ($$1 instanceof cte $$2) {
         return switch ($$2.d()) {
            case a -> ezp.b;
            case c -> ezp.d;
            case b -> ezp.c;
            case d -> ezp.e;
         };
      } else {
         cts<?> $$3 = $$1.e();
         if ($$1 instanceof csw $$4) {
            ctc $$5 = $$4.f();
            if ($$3 == cts.b) {
               return switch ($$5) {
                  case b -> ezp.h;
                  case a -> ezp.g;
                  case c -> ezp.i;
               };
            }

            if ($$3 == cts.c) {
               return $$5 == ctc.b ? ezp.k : ezp.l;
            }

            if ($$3 == cts.d) {
               return ezp.n;
            }

            if ($$3 == cts.e) {
               return ezp.q;
            }
         }

         if ($$3 == cts.f) {
            return ezp.o;
         } else if ($$3 == cts.g) {
            return ezp.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> ki.s.b($$1.e())), LogUtils.defer($$0::a));
            return ezp.r;
         }
      }
   }

   public List<fkx> b() {
      return this.e;
   }

   public List<fkx> a(ezp $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
