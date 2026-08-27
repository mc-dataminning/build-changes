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

public class ewu extends atn {
   private static final Logger c = LogUtils.getLogger();
   private Map<exq, List<fiw>> d = ImmutableMap.of();
   private List<fiw> e = ImmutableList.of();

   public void a(Iterable<csd<?>> $$0, iw $$1) {
      Map<exq, List<List<csd<?>>>> $$2 = a($$0);
      Map<exq, List<fiw>> $$3 = Maps.newHashMap();
      Builder<fiw> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fiw($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      exq.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<exq, List<List<csd<?>>>> a(Iterable<csd<?>> $$0) {
      Map<exq, List<List<csd<?>>>> $$1 = Maps.newHashMap();
      Table<exq, String, List<csd<?>>> $$2 = HashBasedTable.create();

      for (csd<?> $$3 : $$0) {
         csb<?> $$4 = $$3.b();
         if (!$$4.as_() && !$$4.i()) {
            exq $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<csd<?>> $$7 = (List<csd<?>>)$$2.get($$5, $$6);
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

   private static exq g(csd<?> $$0) {
      csb<?> $$1 = $$0.b();
      if ($$1 instanceof crs $$2) {
         return switch ($$2.d()) {
            case a -> exq.b;
            case c -> exq.d;
            case b -> exq.c;
            case d -> exq.e;
         };
      } else {
         csg<?> $$3 = $$1.e();
         if ($$1 instanceof crk $$4) {
            crq $$5 = $$4.f();
            if ($$3 == csg.b) {
               return switch ($$5) {
                  case b -> exq.h;
                  case a -> exq.g;
                  case c -> exq.i;
               };
            }

            if ($$3 == csg.c) {
               return $$5 == crq.b ? exq.k : exq.l;
            }

            if ($$3 == csg.d) {
               return exq.n;
            }

            if ($$3 == csg.e) {
               return exq.q;
            }
         }

         if ($$3 == csg.f) {
            return exq.o;
         } else if ($$3 == csg.g) {
            return exq.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> kf.s.b($$1.e())), LogUtils.defer($$0::a));
            return exq.r;
         }
      }
   }

   public List<fiw> b() {
      return this.e;
   }

   public List<fiw> a(exq $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
