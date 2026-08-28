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

public class fia extends awj {
   private static final Logger c = LogUtils.getLogger();
   private Map<fiw, List<fuh>> d = ImmutableMap.of();
   private List<fuh> e = ImmutableList.of();

   public void a(Iterable<dam<?>> $$0, kc $$1) {
      Map<fiw, List<List<dam<?>>>> $$2 = a($$0);
      Map<fiw, List<fuh>> $$3 = Maps.newHashMap();
      Builder<fuh> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fuh($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fiw.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fiw, List<List<dam<?>>>> a(Iterable<dam<?>> $$0) {
      Map<fiw, List<List<dam<?>>>> $$1 = Maps.newHashMap();
      Table<fiw, String, List<dam<?>>> $$2 = HashBasedTable.create();

      for (dam<?> $$3 : $$0) {
         dak<?> $$4 = $$3.b();
         if (!$$4.aq_() && !$$4.a().c()) {
            fiw $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<dam<?>> $$7 = (List<dam<?>>)$$2.get($$5, $$6);
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

   private static fiw g(dam<?> $$0) {
      dak<?> $$1 = $$0.b();
      if ($$1 instanceof daa $$2) {
         return switch ($$2.d()) {
            case a -> fiw.b;
            case c -> fiw.d;
            case b -> fiw.c;
            case d -> fiw.e;
         };
      } else {
         daq<?> $$3 = $$1.e();
         if ($$1 instanceof czr $$4) {
            czx $$5 = $$4.f();
            if ($$3 == daq.b) {
               return switch ($$5) {
                  case b -> fiw.h;
                  case a -> fiw.g;
                  case c -> fiw.i;
               };
            }

            if ($$3 == daq.c) {
               return $$5 == czx.b ? fiw.k : fiw.l;
            }

            if ($$3 == daq.d) {
               return fiw.n;
            }

            if ($$3 == daq.e) {
               return fiw.q;
            }
         }

         if ($$3 == daq.f) {
            return fiw.o;
         } else if ($$3 == daq.g) {
            return fiw.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lv.q.b($$1.e())), LogUtils.defer($$0::a));
            return fiw.r;
         }
      }
   }

   public List<fuh> b() {
      return this.e;
   }

   public List<fuh> a(fiw $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
