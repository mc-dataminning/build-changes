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

public class esv extends aqy {
   private static final Logger c = LogUtils.getLogger();
   private Map<etr, List<fer>> d = ImmutableMap.of();
   private List<fer> e = ImmutableList.of();

   public void a(Iterable<cov<?>> $$0, it $$1) {
      Map<etr, List<List<cov<?>>>> $$2 = a($$0);
      Map<etr, List<fer>> $$3 = Maps.newHashMap();
      Builder<fer> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fer($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      etr.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<etr, List<List<cov<?>>>> a(Iterable<cov<?>> $$0) {
      Map<etr, List<List<cov<?>>>> $$1 = Maps.newHashMap();
      Table<etr, String, List<cov<?>>> $$2 = HashBasedTable.create();

      for (cov<?> $$3 : $$0) {
         cot<?> $$4 = $$3.b();
         if (!$$4.ar_() && !$$4.i()) {
            etr $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cov<?>> $$7 = (List<cov<?>>)$$2.get($$5, $$6);
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

   private static etr g(cov<?> $$0) {
      cot<?> $$1 = $$0.b();
      if ($$1 instanceof coi $$2) {
         return switch ($$2.d()) {
            case a -> etr.b;
            case c -> etr.d;
            case b -> etr.c;
            case d -> etr.e;
         };
      } else {
         coy<?> $$3 = $$1.e();
         if ($$1 instanceof coa $$4) {
            cog $$5 = $$4.f();
            if ($$3 == coy.b) {
               return switch ($$5) {
                  case b -> etr.h;
                  case a -> etr.g;
                  case c -> etr.i;
               };
            }

            if ($$3 == coy.c) {
               return $$5 == cog.b ? etr.k : etr.l;
            }

            if ($$3 == coy.d) {
               return etr.n;
            }

            if ($$3 == coy.e) {
               return etr.q;
            }
         }

         if ($$3 == coy.f) {
            return etr.o;
         } else if ($$3 == coy.g) {
            return etr.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> kc.t.b($$1.e())), LogUtils.defer($$0::a));
            return etr.r;
         }
      }
   }

   public List<fer> b() {
      return this.e;
   }

   public List<fer> a(etr $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
