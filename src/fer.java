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

public class fer extends awc {
   private static final Logger c = LogUtils.getLogger();
   private Map<ffm, List<fqt>> d = ImmutableMap.of();
   private List<fqt> e = ImmutableList.of();

   public void a(Iterable<cyw<?>> $$0, jw $$1) {
      Map<ffm, List<List<cyw<?>>>> $$2 = a($$0);
      Map<ffm, List<fqt>> $$3 = Maps.newHashMap();
      Builder<fqt> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fqt($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      ffm.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<ffm, List<List<cyw<?>>>> a(Iterable<cyw<?>> $$0) {
      Map<ffm, List<List<cyw<?>>>> $$1 = Maps.newHashMap();
      Table<ffm, String, List<cyw<?>>> $$2 = HashBasedTable.create();

      for (cyw<?> $$3 : $$0) {
         cyu<?> $$4 = $$3.b();
         if (!$$4.an_() && !$$4.i()) {
            ffm $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cyw<?>> $$7 = (List<cyw<?>>)$$2.get($$5, $$6);
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

   private static ffm g(cyw<?> $$0) {
      cyu<?> $$1 = $$0.b();
      if ($$1 instanceof cyl $$2) {
         return switch ($$2.d()) {
            case a -> ffm.b;
            case c -> ffm.d;
            case b -> ffm.c;
            case d -> ffm.e;
         };
      } else {
         cyz<?> $$3 = $$1.e();
         if ($$1 instanceof cyd $$4) {
            cyj $$5 = $$4.f();
            if ($$3 == cyz.b) {
               return switch ($$5) {
                  case b -> ffm.h;
                  case a -> ffm.g;
                  case c -> ffm.i;
               };
            }

            if ($$3 == cyz.c) {
               return $$5 == cyj.b ? ffm.k : ffm.l;
            }

            if ($$3 == cyz.d) {
               return ffm.n;
            }

            if ($$3 == cyz.e) {
               return ffm.q;
            }
         }

         if ($$3 == cyz.f) {
            return ffm.o;
         } else if ($$3 == cyz.g) {
            return ffm.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lp.s.b($$1.e())), LogUtils.defer($$0::a));
            return ffm.r;
         }
      }
   }

   public List<fqt> b() {
      return this.e;
   }

   public List<fqt> a(ffm $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
