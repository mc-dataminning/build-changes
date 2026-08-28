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

public class ffu extends avr {
   private static final Logger c = LogUtils.getLogger();
   private Map<fgq, List<fry>> d = ImmutableMap.of();
   private List<fry> e = ImmutableList.of();

   public void a(Iterable<cyz<?>> $$0, ka $$1) {
      Map<fgq, List<List<cyz<?>>>> $$2 = a($$0);
      Map<fgq, List<fry>> $$3 = Maps.newHashMap();
      Builder<fry> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fry($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fgq.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fgq, List<List<cyz<?>>>> a(Iterable<cyz<?>> $$0) {
      Map<fgq, List<List<cyz<?>>>> $$1 = Maps.newHashMap();
      Table<fgq, String, List<cyz<?>>> $$2 = HashBasedTable.create();

      for (cyz<?> $$3 : $$0) {
         cyx<?> $$4 = $$3.b();
         if (!$$4.ao_() && !$$4.i()) {
            fgq $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cyz<?>> $$7 = (List<cyz<?>>)$$2.get($$5, $$6);
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

   private static fgq g(cyz<?> $$0) {
      cyx<?> $$1 = $$0.b();
      if ($$1 instanceof cyo $$2) {
         return switch ($$2.d()) {
            case a -> fgq.b;
            case c -> fgq.d;
            case b -> fgq.c;
            case d -> fgq.e;
         };
      } else {
         czd<?> $$3 = $$1.e();
         if ($$1 instanceof cyf $$4) {
            cyl $$5 = $$4.f();
            if ($$3 == czd.b) {
               return switch ($$5) {
                  case b -> fgq.h;
                  case a -> fgq.g;
                  case c -> fgq.i;
               };
            }

            if ($$3 == czd.c) {
               return $$5 == cyl.b ? fgq.k : fgq.l;
            }

            if ($$3 == czd.d) {
               return fgq.n;
            }

            if ($$3 == czd.e) {
               return fgq.q;
            }
         }

         if ($$3 == czd.f) {
            return fgq.o;
         } else if ($$3 == czd.g) {
            return fgq.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lt.q.b($$1.e())), LogUtils.defer($$0::a));
            return fgq.r;
         }
      }
   }

   public List<fry> b() {
      return this.e;
   }

   public List<fry> a(fgq $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
