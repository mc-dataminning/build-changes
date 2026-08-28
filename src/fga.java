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

public class fga extends avs {
   private static final Logger c = LogUtils.getLogger();
   private Map<fgw, List<fse>> d = ImmutableMap.of();
   private List<fse> e = ImmutableList.of();

   public void a(Iterable<czb<?>> $$0, ka $$1) {
      Map<fgw, List<List<czb<?>>>> $$2 = a($$0);
      Map<fgw, List<fse>> $$3 = Maps.newHashMap();
      Builder<fse> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fse($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fgw.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fgw, List<List<czb<?>>>> a(Iterable<czb<?>> $$0) {
      Map<fgw, List<List<czb<?>>>> $$1 = Maps.newHashMap();
      Table<fgw, String, List<czb<?>>> $$2 = HashBasedTable.create();

      for (czb<?> $$3 : $$0) {
         cyz<?> $$4 = $$3.b();
         if (!$$4.as_() && !$$4.i()) {
            fgw $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<czb<?>> $$7 = (List<czb<?>>)$$2.get($$5, $$6);
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

   private static fgw g(czb<?> $$0) {
      cyz<?> $$1 = $$0.b();
      if ($$1 instanceof cyq $$2) {
         return switch ($$2.d()) {
            case a -> fgw.b;
            case c -> fgw.d;
            case b -> fgw.c;
            case d -> fgw.e;
         };
      } else {
         czf<?> $$3 = $$1.e();
         if ($$1 instanceof cyh $$4) {
            cyn $$5 = $$4.f();
            if ($$3 == czf.b) {
               return switch ($$5) {
                  case b -> fgw.h;
                  case a -> fgw.g;
                  case c -> fgw.i;
               };
            }

            if ($$3 == czf.c) {
               return $$5 == cyn.b ? fgw.k : fgw.l;
            }

            if ($$3 == czf.d) {
               return fgw.n;
            }

            if ($$3 == czf.e) {
               return fgw.q;
            }
         }

         if ($$3 == czf.f) {
            return fgw.o;
         } else if ($$3 == czf.g) {
            return fgw.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lt.q.b($$1.e())), LogUtils.defer($$0::a));
            return fgw.r;
         }
      }
   }

   public List<fse> b() {
      return this.e;
   }

   public List<fse> a(fgw $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
