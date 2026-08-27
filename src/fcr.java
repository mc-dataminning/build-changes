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

public class fcr extends avf {
   private static final Logger c = LogUtils.getLogger();
   private Map<fdn, List<fov>> d = ImmutableMap.of();
   private List<fov> e = ImmutableList.of();

   public void a(Iterable<cxf<?>> $$0, jk $$1) {
      Map<fdn, List<List<cxf<?>>>> $$2 = a($$0);
      Map<fdn, List<fov>> $$3 = Maps.newHashMap();
      Builder<fov> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fov($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fdn.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fdn, List<List<cxf<?>>>> a(Iterable<cxf<?>> $$0) {
      Map<fdn, List<List<cxf<?>>>> $$1 = Maps.newHashMap();
      Table<fdn, String, List<cxf<?>>> $$2 = HashBasedTable.create();

      for (cxf<?> $$3 : $$0) {
         cxd<?> $$4 = $$3.b();
         if (!$$4.an_() && !$$4.i()) {
            fdn $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cxf<?>> $$7 = (List<cxf<?>>)$$2.get($$5, $$6);
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

   private static fdn g(cxf<?> $$0) {
      cxd<?> $$1 = $$0.b();
      if ($$1 instanceof cwu $$2) {
         return switch ($$2.d()) {
            case a -> fdn.b;
            case c -> fdn.d;
            case b -> fdn.c;
            case d -> fdn.e;
         };
      } else {
         cxi<?> $$3 = $$1.e();
         if ($$1 instanceof cwm $$4) {
            cws $$5 = $$4.f();
            if ($$3 == cxi.b) {
               return switch ($$5) {
                  case b -> fdn.h;
                  case a -> fdn.g;
                  case c -> fdn.i;
               };
            }

            if ($$3 == cxi.c) {
               return $$5 == cws.b ? fdn.k : fdn.l;
            }

            if ($$3 == cxi.d) {
               return fdn.n;
            }

            if ($$3 == cxi.e) {
               return fdn.q;
            }
         }

         if ($$3 == cxi.f) {
            return fdn.o;
         } else if ($$3 == cxi.g) {
            return fdn.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> ld.s.b($$1.e())), LogUtils.defer($$0::a));
            return fdn.r;
         }
      }
   }

   public List<fov> b() {
      return this.e;
   }

   public List<fov> a(fdn $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
