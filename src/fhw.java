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

public class fhw extends awh {
   private static final Logger c = LogUtils.getLogger();
   private Map<fis, List<fud>> d = ImmutableMap.of();
   private List<fud> e = ImmutableList.of();

   public void a(Iterable<daj<?>> $$0, kb $$1) {
      Map<fis, List<List<daj<?>>>> $$2 = a($$0);
      Map<fis, List<fud>> $$3 = Maps.newHashMap();
      Builder<fud> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fud($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fis.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fis, List<List<daj<?>>>> a(Iterable<daj<?>> $$0) {
      Map<fis, List<List<daj<?>>>> $$1 = Maps.newHashMap();
      Table<fis, String, List<daj<?>>> $$2 = HashBasedTable.create();

      for (daj<?> $$3 : $$0) {
         dah<?> $$4 = $$3.b();
         if (!$$4.ap_() && !$$4.a().c()) {
            fis $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<daj<?>> $$7 = (List<daj<?>>)$$2.get($$5, $$6);
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

   private static fis g(daj<?> $$0) {
      dah<?> $$1 = $$0.b();
      if ($$1 instanceof czx $$2) {
         return switch ($$2.d()) {
            case a -> fis.b;
            case c -> fis.d;
            case b -> fis.c;
            case d -> fis.e;
         };
      } else {
         dan<?> $$3 = $$1.e();
         if ($$1 instanceof czo $$4) {
            czu $$5 = $$4.f();
            if ($$3 == dan.b) {
               return switch ($$5) {
                  case b -> fis.h;
                  case a -> fis.g;
                  case c -> fis.i;
               };
            }

            if ($$3 == dan.c) {
               return $$5 == czu.b ? fis.k : fis.l;
            }

            if ($$3 == dan.d) {
               return fis.n;
            }

            if ($$3 == dan.e) {
               return fis.q;
            }
         }

         if ($$3 == dan.f) {
            return fis.o;
         } else if ($$3 == dan.g) {
            return fis.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lu.q.b($$1.e())), LogUtils.defer($$0::a));
            return fis.r;
         }
      }
   }

   public List<fud> b() {
      return this.e;
   }

   public List<fud> a(fis $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
