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

public class ffg extends avk {
   private static final Logger c = LogUtils.getLogger();
   private Map<fgb, List<fri>> d = ImmutableMap.of();
   private List<fri> e = ImmutableList.of();

   public void a(Iterable<cyk<?>> $$0, jx $$1) {
      Map<fgb, List<List<cyk<?>>>> $$2 = a($$0);
      Map<fgb, List<fri>> $$3 = Maps.newHashMap();
      Builder<fri> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fri($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fgb.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fgb, List<List<cyk<?>>>> a(Iterable<cyk<?>> $$0) {
      Map<fgb, List<List<cyk<?>>>> $$1 = Maps.newHashMap();
      Table<fgb, String, List<cyk<?>>> $$2 = HashBasedTable.create();

      for (cyk<?> $$3 : $$0) {
         cyi<?> $$4 = $$3.b();
         if (!$$4.ao_() && !$$4.i()) {
            fgb $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cyk<?>> $$7 = (List<cyk<?>>)$$2.get($$5, $$6);
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

   private static fgb g(cyk<?> $$0) {
      cyi<?> $$1 = $$0.b();
      if ($$1 instanceof cxz $$2) {
         return switch ($$2.d()) {
            case a -> fgb.b;
            case c -> fgb.d;
            case b -> fgb.c;
            case d -> fgb.e;
         };
      } else {
         cyo<?> $$3 = $$1.e();
         if ($$1 instanceof cxq $$4) {
            cxw $$5 = $$4.f();
            if ($$3 == cyo.b) {
               return switch ($$5) {
                  case b -> fgb.h;
                  case a -> fgb.g;
                  case c -> fgb.i;
               };
            }

            if ($$3 == cyo.c) {
               return $$5 == cxw.b ? fgb.k : fgb.l;
            }

            if ($$3 == cyo.d) {
               return fgb.n;
            }

            if ($$3 == cyo.e) {
               return fgb.q;
            }
         }

         if ($$3 == cyo.f) {
            return fgb.o;
         } else if ($$3 == cyo.g) {
            return fgb.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lq.q.b($$1.e())), LogUtils.defer($$0::a));
            return fgb.r;
         }
      }
   }

   public List<fri> b() {
      return this.e;
   }

   public List<fri> a(fgb $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
