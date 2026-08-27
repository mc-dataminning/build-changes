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

public class eun extends arp {
   private static final Logger c = LogUtils.getLogger();
   private Map<evj, List<fgl>> d = ImmutableMap.of();
   private List<fgl> e = ImmutableList.of();

   public void a(Iterable<cpx<?>> $$0, iu $$1) {
      Map<evj, List<List<cpx<?>>>> $$2 = a($$0);
      Map<evj, List<fgl>> $$3 = Maps.newHashMap();
      Builder<fgl> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fgl($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      evj.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<evj, List<List<cpx<?>>>> a(Iterable<cpx<?>> $$0) {
      Map<evj, List<List<cpx<?>>>> $$1 = Maps.newHashMap();
      Table<evj, String, List<cpx<?>>> $$2 = HashBasedTable.create();

      for (cpx<?> $$3 : $$0) {
         cpv<?> $$4 = $$3.b();
         if (!$$4.aq_() && !$$4.i()) {
            evj $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cpx<?>> $$7 = (List<cpx<?>>)$$2.get($$5, $$6);
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

   private static evj g(cpx<?> $$0) {
      cpv<?> $$1 = $$0.b();
      if ($$1 instanceof cpm $$2) {
         return switch ($$2.d()) {
            case a -> evj.b;
            case c -> evj.d;
            case b -> evj.c;
            case d -> evj.e;
         };
      } else {
         cqa<?> $$3 = $$1.e();
         if ($$1 instanceof cpe $$4) {
            cpk $$5 = $$4.f();
            if ($$3 == cqa.b) {
               return switch ($$5) {
                  case b -> evj.h;
                  case a -> evj.g;
                  case c -> evj.i;
               };
            }

            if ($$3 == cqa.c) {
               return $$5 == cpk.b ? evj.k : evj.l;
            }

            if ($$3 == cqa.d) {
               return evj.n;
            }

            if ($$3 == cqa.e) {
               return evj.q;
            }
         }

         if ($$3 == cqa.f) {
            return evj.o;
         } else if ($$3 == cqa.g) {
            return evj.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> kd.s.b($$1.e())), LogUtils.defer($$0::a));
            return evj.r;
         }
      }
   }

   public List<fgl> b() {
      return this.e;
   }

   public List<fgl> a(evj $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
