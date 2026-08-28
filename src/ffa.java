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

public class ffa extends avi {
   private static final Logger c = LogUtils.getLogger();
   private Map<ffv, List<frc>> d = ImmutableMap.of();
   private List<frc> e = ImmutableList.of();

   public void a(Iterable<cyi<?>> $$0, jx $$1) {
      Map<ffv, List<List<cyi<?>>>> $$2 = a($$0);
      Map<ffv, List<frc>> $$3 = Maps.newHashMap();
      Builder<frc> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new frc($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      ffv.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<ffv, List<List<cyi<?>>>> a(Iterable<cyi<?>> $$0) {
      Map<ffv, List<List<cyi<?>>>> $$1 = Maps.newHashMap();
      Table<ffv, String, List<cyi<?>>> $$2 = HashBasedTable.create();

      for (cyi<?> $$3 : $$0) {
         cyg<?> $$4 = $$3.b();
         if (!$$4.ao_() && !$$4.i()) {
            ffv $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cyi<?>> $$7 = (List<cyi<?>>)$$2.get($$5, $$6);
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

   private static ffv g(cyi<?> $$0) {
      cyg<?> $$1 = $$0.b();
      if ($$1 instanceof cxx $$2) {
         return switch ($$2.d()) {
            case a -> ffv.b;
            case c -> ffv.d;
            case b -> ffv.c;
            case d -> ffv.e;
         };
      } else {
         cym<?> $$3 = $$1.e();
         if ($$1 instanceof cxo $$4) {
            cxu $$5 = $$4.f();
            if ($$3 == cym.b) {
               return switch ($$5) {
                  case b -> ffv.h;
                  case a -> ffv.g;
                  case c -> ffv.i;
               };
            }

            if ($$3 == cym.c) {
               return $$5 == cxu.b ? ffv.k : ffv.l;
            }

            if ($$3 == cym.d) {
               return ffv.n;
            }

            if ($$3 == cym.e) {
               return ffv.q;
            }
         }

         if ($$3 == cym.f) {
            return ffv.o;
         } else if ($$3 == cym.g) {
            return ffv.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lq.q.b($$1.e())), LogUtils.defer($$0::a));
            return ffv.r;
         }
      }
   }

   public List<frc> b() {
      return this.e;
   }

   public List<frc> a(ffv $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
