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

public class ffw extends avs {
   private static final Logger c = LogUtils.getLogger();
   private Map<fgs, List<fsj>> d = ImmutableMap.of();
   private List<fsj> e = ImmutableList.of();

   public void a(Iterable<czc<?>> $$0, jo $$1) {
      Map<fgs, List<List<czc<?>>>> $$2 = a($$0);
      Map<fgs, List<fsj>> $$3 = Maps.newHashMap();
      Builder<fsj> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fsj($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fgs.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fgs, List<List<czc<?>>>> a(Iterable<czc<?>> $$0) {
      Map<fgs, List<List<czc<?>>>> $$1 = Maps.newHashMap();
      Table<fgs, String, List<czc<?>>> $$2 = HashBasedTable.create();

      for (czc<?> $$3 : $$0) {
         cza<?> $$4 = $$3.b();
         if (!$$4.an_() && !$$4.i()) {
            fgs $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<czc<?>> $$7 = (List<czc<?>>)$$2.get($$5, $$6);
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

   private static fgs g(czc<?> $$0) {
      cza<?> $$1 = $$0.b();
      if ($$1 instanceof cyp $$2) {
         return switch ($$2.d()) {
            case a -> fgs.b;
            case c -> fgs.d;
            case b -> fgs.c;
            case d -> fgs.e;
         };
      } else {
         czf<?> $$3 = $$1.e();
         if ($$1 instanceof cyh $$4) {
            cyn $$5 = $$4.f();
            if ($$3 == czf.b) {
               return switch ($$5) {
                  case b -> fgs.h;
                  case a -> fgs.g;
                  case c -> fgs.i;
               };
            }

            if ($$3 == czf.c) {
               return $$5 == cyn.b ? fgs.k : fgs.l;
            }

            if ($$3 == czf.d) {
               return fgs.n;
            }

            if ($$3 == czf.e) {
               return fgs.q;
            }
         }

         if ($$3 == czf.f) {
            return fgs.o;
         } else if ($$3 == czf.g) {
            return fgs.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lh.s.b($$1.e())), LogUtils.defer($$0::a));
            return fgs.r;
         }
      }
   }

   public List<fsj> b() {
      return this.e;
   }

   public List<fsj> a(fgs $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
