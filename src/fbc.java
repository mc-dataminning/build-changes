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

public class fbc extends aup {
   private static final Logger c = LogUtils.getLogger();
   private Map<fby, List<fnf>> d = ImmutableMap.of();
   private List<fnf> e = ImmutableList.of();

   public void a(Iterable<cvl<?>> $$0, iz $$1) {
      Map<fby, List<List<cvl<?>>>> $$2 = a($$0);
      Map<fby, List<fnf>> $$3 = Maps.newHashMap();
      Builder<fnf> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fnf($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fby.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fby, List<List<cvl<?>>>> a(Iterable<cvl<?>> $$0) {
      Map<fby, List<List<cvl<?>>>> $$1 = Maps.newHashMap();
      Table<fby, String, List<cvl<?>>> $$2 = HashBasedTable.create();

      for (cvl<?> $$3 : $$0) {
         cvj<?> $$4 = $$3.b();
         if (!$$4.ao_() && !$$4.i()) {
            fby $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cvl<?>> $$7 = (List<cvl<?>>)$$2.get($$5, $$6);
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

   private static fby g(cvl<?> $$0) {
      cvj<?> $$1 = $$0.b();
      if ($$1 instanceof cva $$2) {
         return switch ($$2.d()) {
            case a -> fby.b;
            case c -> fby.d;
            case b -> fby.c;
            case d -> fby.e;
         };
      } else {
         cvo<?> $$3 = $$1.e();
         if ($$1 instanceof cus $$4) {
            cuy $$5 = $$4.f();
            if ($$3 == cvo.b) {
               return switch ($$5) {
                  case b -> fby.h;
                  case a -> fby.g;
                  case c -> fby.i;
               };
            }

            if ($$3 == cvo.c) {
               return $$5 == cuy.b ? fby.k : fby.l;
            }

            if ($$3 == cvo.d) {
               return fby.n;
            }

            if ($$3 == cvo.e) {
               return fby.q;
            }
         }

         if ($$3 == cvo.f) {
            return fby.o;
         } else if ($$3 == cvo.g) {
            return fby.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> kr.s.b($$1.e())), LogUtils.defer($$0::a));
            return fby.r;
         }
      }
   }

   public List<fnf> b() {
      return this.e;
   }

   public List<fnf> a(fby $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
