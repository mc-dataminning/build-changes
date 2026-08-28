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

public class fhm extends awg {
   private static final Logger c = LogUtils.getLogger();
   private Map<fii, List<ftt>> d = ImmutableMap.of();
   private List<ftt> e = ImmutableList.of();

   public void a(Iterable<czv<?>> $$0, kb $$1) {
      Map<fii, List<List<czv<?>>>> $$2 = a($$0);
      Map<fii, List<ftt>> $$3 = Maps.newHashMap();
      Builder<ftt> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new ftt($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fii.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fii, List<List<czv<?>>>> a(Iterable<czv<?>> $$0) {
      Map<fii, List<List<czv<?>>>> $$1 = Maps.newHashMap();
      Table<fii, String, List<czv<?>>> $$2 = HashBasedTable.create();

      for (czv<?> $$3 : $$0) {
         czt<?> $$4 = $$3.b();
         if (!$$4.ar_() && !$$4.a().c()) {
            fii $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<czv<?>> $$7 = (List<czv<?>>)$$2.get($$5, $$6);
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

   private static fii g(czv<?> $$0) {
      czt<?> $$1 = $$0.b();
      if ($$1 instanceof czj $$2) {
         return switch ($$2.d()) {
            case a -> fii.b;
            case c -> fii.d;
            case b -> fii.c;
            case d -> fii.e;
         };
      } else {
         czz<?> $$3 = $$1.e();
         if ($$1 instanceof cza $$4) {
            czg $$5 = $$4.f();
            if ($$3 == czz.b) {
               return switch ($$5) {
                  case b -> fii.h;
                  case a -> fii.g;
                  case c -> fii.i;
               };
            }

            if ($$3 == czz.c) {
               return $$5 == czg.b ? fii.k : fii.l;
            }

            if ($$3 == czz.d) {
               return fii.n;
            }

            if ($$3 == czz.e) {
               return fii.q;
            }
         }

         if ($$3 == czz.f) {
            return fii.o;
         } else if ($$3 == czz.g) {
            return fii.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lu.q.b($$1.e())), LogUtils.defer($$0::a));
            return fii.r;
         }
      }
   }

   public List<ftt> b() {
      return this.e;
   }

   public List<ftt> a(fii $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
