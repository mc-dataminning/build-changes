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

public class exx extends ats {
   private static final Logger c = LogUtils.getLogger();
   private Map<eyt, List<fjz>> d = ImmutableMap.of();
   private List<fjz> e = ImmutableList.of();

   public void a(Iterable<csu<?>> $$0, iy $$1) {
      Map<eyt, List<List<csu<?>>>> $$2 = a($$0);
      Map<eyt, List<fjz>> $$3 = Maps.newHashMap();
      Builder<fjz> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fjz($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      eyt.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<eyt, List<List<csu<?>>>> a(Iterable<csu<?>> $$0) {
      Map<eyt, List<List<csu<?>>>> $$1 = Maps.newHashMap();
      Table<eyt, String, List<csu<?>>> $$2 = HashBasedTable.create();

      for (csu<?> $$3 : $$0) {
         css<?> $$4 = $$3.b();
         if (!$$4.ar_() && !$$4.i()) {
            eyt $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<csu<?>> $$7 = (List<csu<?>>)$$2.get($$5, $$6);
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

   private static eyt g(csu<?> $$0) {
      css<?> $$1 = $$0.b();
      if ($$1 instanceof csj $$2) {
         return switch ($$2.d()) {
            case a -> eyt.b;
            case c -> eyt.d;
            case b -> eyt.c;
            case d -> eyt.e;
         };
      } else {
         csx<?> $$3 = $$1.e();
         if ($$1 instanceof csb $$4) {
            csh $$5 = $$4.f();
            if ($$3 == csx.b) {
               return switch ($$5) {
                  case b -> eyt.h;
                  case a -> eyt.g;
                  case c -> eyt.i;
               };
            }

            if ($$3 == csx.c) {
               return $$5 == csh.b ? eyt.k : eyt.l;
            }

            if ($$3 == csx.d) {
               return eyt.n;
            }

            if ($$3 == csx.e) {
               return eyt.q;
            }
         }

         if ($$3 == csx.f) {
            return eyt.o;
         } else if ($$3 == csx.g) {
            return eyt.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> kh.s.b($$1.e())), LogUtils.defer($$0::a));
            return eyt.r;
         }
      }
   }

   public List<fjz> b() {
      return this.e;
   }

   public List<fjz> a(eyt $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
