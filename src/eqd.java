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

public class eqd extends apc {
   private static final Logger c = LogUtils.getLogger();
   private Map<eqz, List<fbv>> d = ImmutableMap.of();
   private List<fbv> e = ImmutableList.of();

   public void a(Iterable<cmf<?>> $$0, hu $$1) {
      Map<eqz, List<List<cmf<?>>>> $$2 = a($$0);
      Map<eqz, List<fbv>> $$3 = Maps.newHashMap();
      Builder<fbv> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fbv($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      eqz.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<eqz, List<List<cmf<?>>>> a(Iterable<cmf<?>> $$0) {
      Map<eqz, List<List<cmf<?>>>> $$1 = Maps.newHashMap();
      Table<eqz, String, List<cmf<?>>> $$2 = HashBasedTable.create();

      for (cmf<?> $$3 : $$0) {
         cme<?> $$4 = $$3.b();
         if (!$$4.ah_() && !$$4.i()) {
            eqz $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cmf<?>> $$7 = (List<cmf<?>>)$$2.get($$5, $$6);
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

   private static eqz g(cmf<?> $$0) {
      cme<?> $$1 = $$0.b();
      if ($$1 instanceof clu $$2) {
         return switch ($$2.d()) {
            case a -> eqz.b;
            case c -> eqz.d;
            case b -> eqz.c;
            case d -> eqz.e;
         };
      } else {
         cmi<?> $$3 = $$1.e();
         if ($$1 instanceof clm $$4) {
            cls $$5 = $$4.f();
            if ($$3 == cmi.b) {
               return switch ($$5) {
                  case b -> eqz.h;
                  case a -> eqz.g;
                  case c -> eqz.i;
               };
            }

            if ($$3 == cmi.c) {
               return $$5 == cls.b ? eqz.k : eqz.l;
            }

            if ($$3 == cmi.d) {
               return eqz.n;
            }

            if ($$3 == cmi.e) {
               return eqz.q;
            }
         }

         if ($$3 == cmi.f) {
            return eqz.o;
         } else if ($$3 == cmi.g) {
            return eqz.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> jd.t.b($$1.e())), LogUtils.defer($$0::a));
            return eqz.r;
         }
      }
   }

   public List<fbv> b() {
      return this.e;
   }

   public List<fbv> a(eqz $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
