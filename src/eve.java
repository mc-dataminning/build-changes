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

public class eve extends arw {
   private static final Logger c = LogUtils.getLogger();
   private Map<ewa, List<fhe>> d = ImmutableMap.of();
   private List<fhe> e = ImmutableList.of();

   public void a(Iterable<cqm<?>> $$0, iu $$1) {
      Map<ewa, List<List<cqm<?>>>> $$2 = a($$0);
      Map<ewa, List<fhe>> $$3 = Maps.newHashMap();
      Builder<fhe> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fhe($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      ewa.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<ewa, List<List<cqm<?>>>> a(Iterable<cqm<?>> $$0) {
      Map<ewa, List<List<cqm<?>>>> $$1 = Maps.newHashMap();
      Table<ewa, String, List<cqm<?>>> $$2 = HashBasedTable.create();

      for (cqm<?> $$3 : $$0) {
         cqk<?> $$4 = $$3.b();
         if (!$$4.as_() && !$$4.i()) {
            ewa $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cqm<?>> $$7 = (List<cqm<?>>)$$2.get($$5, $$6);
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

   private static ewa g(cqm<?> $$0) {
      cqk<?> $$1 = $$0.b();
      if ($$1 instanceof cqb $$2) {
         return switch ($$2.d()) {
            case a -> ewa.b;
            case c -> ewa.d;
            case b -> ewa.c;
            case d -> ewa.e;
         };
      } else {
         cqp<?> $$3 = $$1.e();
         if ($$1 instanceof cpt $$4) {
            cpz $$5 = $$4.f();
            if ($$3 == cqp.b) {
               return switch ($$5) {
                  case b -> ewa.h;
                  case a -> ewa.g;
                  case c -> ewa.i;
               };
            }

            if ($$3 == cqp.c) {
               return $$5 == cpz.b ? ewa.k : ewa.l;
            }

            if ($$3 == cqp.d) {
               return ewa.n;
            }

            if ($$3 == cqp.e) {
               return ewa.q;
            }
         }

         if ($$3 == cqp.f) {
            return ewa.o;
         } else if ($$3 == cqp.g) {
            return ewa.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> kd.s.b($$1.e())), LogUtils.defer($$0::a));
            return ewa.r;
         }
      }
   }

   public List<fhe> b() {
      return this.e;
   }

   public List<fhe> a(ewa $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
