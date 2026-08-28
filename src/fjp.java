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

public class fjp extends awq {
   private static final Logger c = LogUtils.getLogger();
   private Map<fkl, List<fvx>> d = ImmutableMap.of();
   private List<fvx> e = ImmutableList.of();

   public void a(Iterable<dbc<?>> $$0, ke $$1) {
      Map<fkl, List<List<dbc<?>>>> $$2 = a($$0);
      Map<fkl, List<fvx>> $$3 = Maps.newHashMap();
      Builder<fvx> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fvx($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fkl.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fkl, List<List<dbc<?>>>> a(Iterable<dbc<?>> $$0) {
      Map<fkl, List<List<dbc<?>>>> $$1 = Maps.newHashMap();
      Table<fkl, String, List<dbc<?>>> $$2 = HashBasedTable.create();

      for (dbc<?> $$3 : $$0) {
         dba<?> $$4 = $$3.b();
         if (!$$4.ao_() && !$$4.a().c()) {
            fkl $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<dbc<?>> $$7 = (List<dbc<?>>)$$2.get($$5, $$6);
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

   private static fkl g(dbc<?> $$0) {
      dba<?> $$1 = $$0.b();
      if ($$1 instanceof daq $$2) {
         return switch ($$2.d()) {
            case a -> fkl.b;
            case c -> fkl.d;
            case b -> fkl.c;
            case d -> fkl.e;
         };
      } else {
         dbg<?> $$3 = $$1.e();
         if ($$1 instanceof dah $$4) {
            dan $$5 = $$4.f();
            if ($$3 == dbg.b) {
               return switch ($$5) {
                  case b -> fkl.h;
                  case a -> fkl.g;
                  case c -> fkl.i;
               };
            }

            if ($$3 == dbg.c) {
               return $$5 == dan.b ? fkl.k : fkl.l;
            }

            if ($$3 == dbg.d) {
               return fkl.n;
            }

            if ($$3 == dbg.e) {
               return fkl.q;
            }
         }

         if ($$3 == dbg.f) {
            return fkl.o;
         } else if ($$3 == dbg.g) {
            return fkl.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lz.q.b($$1.e())), LogUtils.defer($$0::a));
            return fkl.r;
         }
      }
   }

   public List<fvx> b() {
      return this.e;
   }

   public List<fvx> a(fkl $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
