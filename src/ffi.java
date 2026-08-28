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

public class ffi extends avk {
   private static final Logger c = LogUtils.getLogger();
   private Map<fge, List<frk>> d = ImmutableMap.of();
   private List<frk> e = ImmutableList.of();

   public void a(Iterable<cyl<?>> $$0, jx $$1) {
      Map<fge, List<List<cyl<?>>>> $$2 = a($$0);
      Map<fge, List<frk>> $$3 = Maps.newHashMap();
      Builder<frk> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new frk($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fge.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fge, List<List<cyl<?>>>> a(Iterable<cyl<?>> $$0) {
      Map<fge, List<List<cyl<?>>>> $$1 = Maps.newHashMap();
      Table<fge, String, List<cyl<?>>> $$2 = HashBasedTable.create();

      for (cyl<?> $$3 : $$0) {
         cyj<?> $$4 = $$3.b();
         if (!$$4.ao_() && !$$4.i()) {
            fge $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cyl<?>> $$7 = (List<cyl<?>>)$$2.get($$5, $$6);
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

   private static fge g(cyl<?> $$0) {
      cyj<?> $$1 = $$0.b();
      if ($$1 instanceof cya $$2) {
         return switch ($$2.d()) {
            case a -> fge.b;
            case c -> fge.d;
            case b -> fge.c;
            case d -> fge.e;
         };
      } else {
         cyp<?> $$3 = $$1.e();
         if ($$1 instanceof cxr $$4) {
            cxx $$5 = $$4.f();
            if ($$3 == cyp.b) {
               return switch ($$5) {
                  case b -> fge.h;
                  case a -> fge.g;
                  case c -> fge.i;
               };
            }

            if ($$3 == cyp.c) {
               return $$5 == cxx.b ? fge.k : fge.l;
            }

            if ($$3 == cyp.d) {
               return fge.n;
            }

            if ($$3 == cyp.e) {
               return fge.q;
            }
         }

         if ($$3 == cyp.f) {
            return fge.o;
         } else if ($$3 == cyp.g) {
            return fge.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lq.q.b($$1.e())), LogUtils.defer($$0::a));
            return fge.r;
         }
      }
   }

   public List<frk> b() {
      return this.e;
   }

   public List<frk> a(fge $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
