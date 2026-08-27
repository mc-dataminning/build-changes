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

public class euu extends aru {
   private static final Logger c = LogUtils.getLogger();
   private Map<evq, List<fgs>> d = ImmutableMap.of();
   private List<fgs> e = ImmutableList.of();

   public void a(Iterable<cqd<?>> $$0, iu $$1) {
      Map<evq, List<List<cqd<?>>>> $$2 = a($$0);
      Map<evq, List<fgs>> $$3 = Maps.newHashMap();
      Builder<fgs> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fgs($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      evq.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<evq, List<List<cqd<?>>>> a(Iterable<cqd<?>> $$0) {
      Map<evq, List<List<cqd<?>>>> $$1 = Maps.newHashMap();
      Table<evq, String, List<cqd<?>>> $$2 = HashBasedTable.create();

      for (cqd<?> $$3 : $$0) {
         cqb<?> $$4 = $$3.b();
         if (!$$4.aq_() && !$$4.i()) {
            evq $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cqd<?>> $$7 = (List<cqd<?>>)$$2.get($$5, $$6);
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

   private static evq g(cqd<?> $$0) {
      cqb<?> $$1 = $$0.b();
      if ($$1 instanceof cps $$2) {
         return switch ($$2.d()) {
            case a -> evq.b;
            case c -> evq.d;
            case b -> evq.c;
            case d -> evq.e;
         };
      } else {
         cqg<?> $$3 = $$1.e();
         if ($$1 instanceof cpk $$4) {
            cpq $$5 = $$4.f();
            if ($$3 == cqg.b) {
               return switch ($$5) {
                  case b -> evq.h;
                  case a -> evq.g;
                  case c -> evq.i;
               };
            }

            if ($$3 == cqg.c) {
               return $$5 == cpq.b ? evq.k : evq.l;
            }

            if ($$3 == cqg.d) {
               return evq.n;
            }

            if ($$3 == cqg.e) {
               return evq.q;
            }
         }

         if ($$3 == cqg.f) {
            return evq.o;
         } else if ($$3 == cqg.g) {
            return evq.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> kd.s.b($$1.e())), LogUtils.defer($$0::a));
            return evq.r;
         }
      }
   }

   public List<fgs> b() {
      return this.e;
   }

   public List<fgs> a(evq $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
