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

public class fdm extends avk {
   private static final Logger c = LogUtils.getLogger();
   private Map<fei, List<fpq>> d = ImmutableMap.of();
   private List<fpq> e = ImmutableList.of();

   public void a(Iterable<cxw<?>> $$0, jl $$1) {
      Map<fei, List<List<cxw<?>>>> $$2 = a($$0);
      Map<fei, List<fpq>> $$3 = Maps.newHashMap();
      Builder<fpq> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fpq($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fei.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fei, List<List<cxw<?>>>> a(Iterable<cxw<?>> $$0) {
      Map<fei, List<List<cxw<?>>>> $$1 = Maps.newHashMap();
      Table<fei, String, List<cxw<?>>> $$2 = HashBasedTable.create();

      for (cxw<?> $$3 : $$0) {
         cxu<?> $$4 = $$3.b();
         if (!$$4.an_() && !$$4.i()) {
            fei $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cxw<?>> $$7 = (List<cxw<?>>)$$2.get($$5, $$6);
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

   private static fei g(cxw<?> $$0) {
      cxu<?> $$1 = $$0.b();
      if ($$1 instanceof cxl $$2) {
         return switch ($$2.d()) {
            case a -> fei.b;
            case c -> fei.d;
            case b -> fei.c;
            case d -> fei.e;
         };
      } else {
         cxz<?> $$3 = $$1.e();
         if ($$1 instanceof cxd $$4) {
            cxj $$5 = $$4.f();
            if ($$3 == cxz.b) {
               return switch ($$5) {
                  case b -> fei.h;
                  case a -> fei.g;
                  case c -> fei.i;
               };
            }

            if ($$3 == cxz.c) {
               return $$5 == cxj.b ? fei.k : fei.l;
            }

            if ($$3 == cxz.d) {
               return fei.n;
            }

            if ($$3 == cxz.e) {
               return fei.q;
            }
         }

         if ($$3 == cxz.f) {
            return fei.o;
         } else if ($$3 == cxz.g) {
            return fei.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> le.s.b($$1.e())), LogUtils.defer($$0::a));
            return fei.r;
         }
      }
   }

   public List<fpq> b() {
      return this.e;
   }

   public List<fpq> a(fei $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
