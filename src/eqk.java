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

public class eqk extends api {
   private static final Logger c = LogUtils.getLogger();
   private Map<erg, List<fcc>> d = ImmutableMap.of();
   private List<fcc> e = ImmutableList.of();

   public void a(Iterable<cmm<?>> $$0, hu $$1) {
      Map<erg, List<List<cmm<?>>>> $$2 = a($$0);
      Map<erg, List<fcc>> $$3 = Maps.newHashMap();
      Builder<fcc> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fcc($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      erg.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<erg, List<List<cmm<?>>>> a(Iterable<cmm<?>> $$0) {
      Map<erg, List<List<cmm<?>>>> $$1 = Maps.newHashMap();
      Table<erg, String, List<cmm<?>>> $$2 = HashBasedTable.create();

      for (cmm<?> $$3 : $$0) {
         cml<?> $$4 = $$3.b();
         if (!$$4.am_() && !$$4.i()) {
            erg $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cmm<?>> $$7 = (List<cmm<?>>)$$2.get($$5, $$6);
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

   private static erg g(cmm<?> $$0) {
      cml<?> $$1 = $$0.b();
      if ($$1 instanceof cmb $$2) {
         return switch ($$2.d()) {
            case a -> erg.b;
            case c -> erg.d;
            case b -> erg.c;
            case d -> erg.e;
         };
      } else {
         cmp<?> $$3 = $$1.e();
         if ($$1 instanceof clt $$4) {
            clz $$5 = $$4.f();
            if ($$3 == cmp.b) {
               return switch ($$5) {
                  case b -> erg.h;
                  case a -> erg.g;
                  case c -> erg.i;
               };
            }

            if ($$3 == cmp.c) {
               return $$5 == clz.b ? erg.k : erg.l;
            }

            if ($$3 == cmp.d) {
               return erg.n;
            }

            if ($$3 == cmp.e) {
               return erg.q;
            }
         }

         if ($$3 == cmp.f) {
            return erg.o;
         } else if ($$3 == cmp.g) {
            return erg.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> jd.t.b($$1.e())), LogUtils.defer($$0::a));
            return erg.r;
         }
      }
   }

   public List<fcc> b() {
      return this.e;
   }

   public List<fcc> a(erg $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
