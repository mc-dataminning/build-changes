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

public class eqa extends aox {
   private static final Logger c = LogUtils.getLogger();
   private Map<eqw, List<fbl>> d = ImmutableMap.of();
   private List<fbl> e = ImmutableList.of();

   public void a(Iterable<clz<?>> $$0, ht $$1) {
      Map<eqw, List<List<clz<?>>>> $$2 = a($$0);
      Map<eqw, List<fbl>> $$3 = Maps.newHashMap();
      Builder<fbl> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fbl($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      eqw.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<eqw, List<List<clz<?>>>> a(Iterable<clz<?>> $$0) {
      Map<eqw, List<List<clz<?>>>> $$1 = Maps.newHashMap();
      Table<eqw, String, List<clz<?>>> $$2 = HashBasedTable.create();

      for (clz<?> $$3 : $$0) {
         if (!$$3.ai_() && !$$3.j()) {
            eqw $$4 = g($$3);
            String $$5 = $$3.c();
            if ($$5.isEmpty()) {
               $$1.computeIfAbsent($$4, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<clz<?>> $$6 = (List<clz<?>>)$$2.get($$4, $$5);
               if ($$6 == null) {
                  $$6 = Lists.newArrayList();
                  $$2.put($$4, $$5, $$6);
                  $$1.computeIfAbsent($$4, $$0x -> Lists.newArrayList()).add($$6);
               }

               $$6.add($$3);
            }
         }
      }

      return $$1;
   }

   private static eqw g(clz<?> $$0) {
      if ($$0 instanceof clq $$1) {
         return switch ($$1.d()) {
            case a -> eqw.b;
            case c -> eqw.d;
            case b -> eqw.c;
            case d -> eqw.e;
         };
      } else {
         cmc<?> $$2 = $$0.f();
         if ($$0 instanceof cli $$3) {
            clo $$4 = $$3.g();
            if ($$2 == cmc.b) {
               return switch ($$4) {
                  case b -> eqw.h;
                  case a -> eqw.g;
                  case c -> eqw.i;
               };
            }

            if ($$2 == cmc.c) {
               return $$4 == clo.b ? eqw.k : eqw.l;
            }

            if ($$2 == cmc.d) {
               return eqw.n;
            }

            if ($$2 == cmc.e) {
               return eqw.q;
            }
         }

         if ($$2 == cmc.f) {
            return eqw.o;
         } else if ($$2 == cmc.g) {
            return eqw.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> jc.t.b($$0.f())), LogUtils.defer($$0::e));
            return eqw.r;
         }
      }
   }

   public List<fbl> b() {
      return this.e;
   }

   public List<fbl> a(eqw $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
