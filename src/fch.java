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

public class fch extends avc {
   private static final Logger c = LogUtils.getLogger();
   private Map<fdd, List<fok>> d = ImmutableMap.of();
   private List<fok> e = ImmutableList.of();

   public void a(Iterable<cwi<?>> $$0, jj $$1) {
      Map<fdd, List<List<cwi<?>>>> $$2 = a($$0);
      Map<fdd, List<fok>> $$3 = Maps.newHashMap();
      Builder<fok> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fok($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fdd.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fdd, List<List<cwi<?>>>> a(Iterable<cwi<?>> $$0) {
      Map<fdd, List<List<cwi<?>>>> $$1 = Maps.newHashMap();
      Table<fdd, String, List<cwi<?>>> $$2 = HashBasedTable.create();

      for (cwi<?> $$3 : $$0) {
         cwg<?> $$4 = $$3.b();
         if (!$$4.an_() && !$$4.i()) {
            fdd $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cwi<?>> $$7 = (List<cwi<?>>)$$2.get($$5, $$6);
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

   private static fdd g(cwi<?> $$0) {
      cwg<?> $$1 = $$0.b();
      if ($$1 instanceof cvx $$2) {
         return switch ($$2.d()) {
            case a -> fdd.b;
            case c -> fdd.d;
            case b -> fdd.c;
            case d -> fdd.e;
         };
      } else {
         cwl<?> $$3 = $$1.e();
         if ($$1 instanceof cvp $$4) {
            cvv $$5 = $$4.f();
            if ($$3 == cwl.b) {
               return switch ($$5) {
                  case b -> fdd.h;
                  case a -> fdd.g;
                  case c -> fdd.i;
               };
            }

            if ($$3 == cwl.c) {
               return $$5 == cvv.b ? fdd.k : fdd.l;
            }

            if ($$3 == cwl.d) {
               return fdd.n;
            }

            if ($$3 == cwl.e) {
               return fdd.q;
            }
         }

         if ($$3 == cwl.f) {
            return fdd.o;
         } else if ($$3 == cwl.g) {
            return fdd.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lc.s.b($$1.e())), LogUtils.defer($$0::a));
            return fdd.r;
         }
      }
   }

   public List<fok> b() {
      return this.e;
   }

   public List<fok> a(fdd $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
