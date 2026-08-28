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

public class fen extends avz {
   private static final Logger c = LogUtils.getLogger();
   private Map<ffi, List<fqp>> d = ImmutableMap.of();
   private List<fqp> e = ImmutableList.of();

   public void a(Iterable<cys<?>> $$0, jw $$1) {
      Map<ffi, List<List<cys<?>>>> $$2 = a($$0);
      Map<ffi, List<fqp>> $$3 = Maps.newHashMap();
      Builder<fqp> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fqp($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      ffi.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<ffi, List<List<cys<?>>>> a(Iterable<cys<?>> $$0) {
      Map<ffi, List<List<cys<?>>>> $$1 = Maps.newHashMap();
      Table<ffi, String, List<cys<?>>> $$2 = HashBasedTable.create();

      for (cys<?> $$3 : $$0) {
         cyq<?> $$4 = $$3.b();
         if (!$$4.ao_() && !$$4.i()) {
            ffi $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cys<?>> $$7 = (List<cys<?>>)$$2.get($$5, $$6);
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

   private static ffi g(cys<?> $$0) {
      cyq<?> $$1 = $$0.b();
      if ($$1 instanceof cyh $$2) {
         return switch ($$2.d()) {
            case a -> ffi.b;
            case c -> ffi.d;
            case b -> ffi.c;
            case d -> ffi.e;
         };
      } else {
         cyv<?> $$3 = $$1.e();
         if ($$1 instanceof cxz $$4) {
            cyf $$5 = $$4.f();
            if ($$3 == cyv.b) {
               return switch ($$5) {
                  case b -> ffi.h;
                  case a -> ffi.g;
                  case c -> ffi.i;
               };
            }

            if ($$3 == cyv.c) {
               return $$5 == cyf.b ? ffi.k : ffi.l;
            }

            if ($$3 == cyv.d) {
               return ffi.n;
            }

            if ($$3 == cyv.e) {
               return ffi.q;
            }
         }

         if ($$3 == cyv.f) {
            return ffi.o;
         } else if ($$3 == cyv.g) {
            return ffi.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lp.s.b($$1.e())), LogUtils.defer($$0::a));
            return ffi.r;
         }
      }
   }

   public List<fqp> b() {
      return this.e;
   }

   public List<fqp> a(ffi $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
