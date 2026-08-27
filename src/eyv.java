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

public class eyv extends aub {
   private static final Logger c = LogUtils.getLogger();
   private Map<ezr, List<fkz>> d = ImmutableMap.of();
   private List<fkz> e = ImmutableList.of();

   public void a(Iterable<ctr<?>> $$0, iz $$1) {
      Map<ezr, List<List<ctr<?>>>> $$2 = a($$0);
      Map<ezr, List<fkz>> $$3 = Maps.newHashMap();
      Builder<fkz> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fkz($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      ezr.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<ezr, List<List<ctr<?>>>> a(Iterable<ctr<?>> $$0) {
      Map<ezr, List<List<ctr<?>>>> $$1 = Maps.newHashMap();
      Table<ezr, String, List<ctr<?>>> $$2 = HashBasedTable.create();

      for (ctr<?> $$3 : $$0) {
         ctp<?> $$4 = $$3.b();
         if (!$$4.aq_() && !$$4.i()) {
            ezr $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<ctr<?>> $$7 = (List<ctr<?>>)$$2.get($$5, $$6);
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

   private static ezr g(ctr<?> $$0) {
      ctp<?> $$1 = $$0.b();
      if ($$1 instanceof ctg $$2) {
         return switch ($$2.d()) {
            case a -> ezr.b;
            case c -> ezr.d;
            case b -> ezr.c;
            case d -> ezr.e;
         };
      } else {
         ctu<?> $$3 = $$1.e();
         if ($$1 instanceof csy $$4) {
            cte $$5 = $$4.f();
            if ($$3 == ctu.b) {
               return switch ($$5) {
                  case b -> ezr.h;
                  case a -> ezr.g;
                  case c -> ezr.i;
               };
            }

            if ($$3 == ctu.c) {
               return $$5 == cte.b ? ezr.k : ezr.l;
            }

            if ($$3 == ctu.d) {
               return ezr.n;
            }

            if ($$3 == ctu.e) {
               return ezr.q;
            }
         }

         if ($$3 == ctu.f) {
            return ezr.o;
         } else if ($$3 == ctu.g) {
            return ezr.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> ki.s.b($$1.e())), LogUtils.defer($$0::a));
            return ezr.r;
         }
      }
   }

   public List<fkz> b() {
      return this.e;
   }

   public List<fkz> a(ezr $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
