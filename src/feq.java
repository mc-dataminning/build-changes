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

public class feq extends awc {
   private static final Logger c = LogUtils.getLogger();
   private Map<ffl, List<fqs>> d = ImmutableMap.of();
   private List<fqs> e = ImmutableList.of();

   public void a(Iterable<cyv<?>> $$0, jw $$1) {
      Map<ffl, List<List<cyv<?>>>> $$2 = a($$0);
      Map<ffl, List<fqs>> $$3 = Maps.newHashMap();
      Builder<fqs> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fqs($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      ffl.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<ffl, List<List<cyv<?>>>> a(Iterable<cyv<?>> $$0) {
      Map<ffl, List<List<cyv<?>>>> $$1 = Maps.newHashMap();
      Table<ffl, String, List<cyv<?>>> $$2 = HashBasedTable.create();

      for (cyv<?> $$3 : $$0) {
         cyt<?> $$4 = $$3.b();
         if (!$$4.ao_() && !$$4.i()) {
            ffl $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cyv<?>> $$7 = (List<cyv<?>>)$$2.get($$5, $$6);
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

   private static ffl g(cyv<?> $$0) {
      cyt<?> $$1 = $$0.b();
      if ($$1 instanceof cyk $$2) {
         return switch ($$2.d()) {
            case a -> ffl.b;
            case c -> ffl.d;
            case b -> ffl.c;
            case d -> ffl.e;
         };
      } else {
         cyy<?> $$3 = $$1.e();
         if ($$1 instanceof cyc $$4) {
            cyi $$5 = $$4.f();
            if ($$3 == cyy.b) {
               return switch ($$5) {
                  case b -> ffl.h;
                  case a -> ffl.g;
                  case c -> ffl.i;
               };
            }

            if ($$3 == cyy.c) {
               return $$5 == cyi.b ? ffl.k : ffl.l;
            }

            if ($$3 == cyy.d) {
               return ffl.n;
            }

            if ($$3 == cyy.e) {
               return ffl.q;
            }
         }

         if ($$3 == cyy.f) {
            return ffl.o;
         } else if ($$3 == cyy.g) {
            return ffl.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lp.s.b($$1.e())), LogUtils.defer($$0::a));
            return ffl.r;
         }
      }
   }

   public List<fqs> b() {
      return this.e;
   }

   public List<fqs> a(ffl $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
