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

public class epz extends aoz {
   private static final Logger c = LogUtils.getLogger();
   private Map<eqv, List<fbp>> d = ImmutableMap.of();
   private List<fbp> e = ImmutableList.of();

   public void a(Iterable<cmb<?>> $$0, hs $$1) {
      Map<eqv, List<List<cmb<?>>>> $$2 = a($$0);
      Map<eqv, List<fbp>> $$3 = Maps.newHashMap();
      Builder<fbp> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fbp($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      eqv.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<eqv, List<List<cmb<?>>>> a(Iterable<cmb<?>> $$0) {
      Map<eqv, List<List<cmb<?>>>> $$1 = Maps.newHashMap();
      Table<eqv, String, List<cmb<?>>> $$2 = HashBasedTable.create();

      for (cmb<?> $$3 : $$0) {
         if (!$$3.ai_() && !$$3.j()) {
            eqv $$4 = g($$3);
            String $$5 = $$3.c();
            if ($$5.isEmpty()) {
               $$1.computeIfAbsent($$4, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cmb<?>> $$6 = (List<cmb<?>>)$$2.get($$4, $$5);
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

   private static eqv g(cmb<?> $$0) {
      if ($$0 instanceof cls $$1) {
         return switch ($$1.d()) {
            case a -> eqv.b;
            case c -> eqv.d;
            case b -> eqv.c;
            case d -> eqv.e;
         };
      } else {
         cme<?> $$2 = $$0.f();
         if ($$0 instanceof clk $$3) {
            clq $$4 = $$3.g();
            if ($$2 == cme.b) {
               return switch ($$4) {
                  case b -> eqv.h;
                  case a -> eqv.g;
                  case c -> eqv.i;
               };
            }

            if ($$2 == cme.c) {
               return $$4 == clq.b ? eqv.k : eqv.l;
            }

            if ($$2 == cme.d) {
               return eqv.n;
            }

            if ($$2 == cme.e) {
               return eqv.q;
            }
         }

         if ($$2 == cme.f) {
            return eqv.o;
         } else if ($$2 == cme.g) {
            return eqv.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> jb.t.b($$0.f())), LogUtils.defer($$0::e));
            return eqv.r;
         }
      }
   }

   public List<fbp> b() {
      return this.e;
   }

   public List<fbp> a(eqv $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
