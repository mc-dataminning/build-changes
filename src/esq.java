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

public class esq extends aqu {
   private static final Logger c = LogUtils.getLogger();
   private Map<etm, List<fem>> d = ImmutableMap.of();
   private List<fem> e = ImmutableList.of();

   public void a(Iterable<coq<?>> $$0, ip $$1) {
      Map<etm, List<List<coq<?>>>> $$2 = a($$0);
      Map<etm, List<fem>> $$3 = Maps.newHashMap();
      Builder<fem> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fem($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      etm.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<etm, List<List<coq<?>>>> a(Iterable<coq<?>> $$0) {
      Map<etm, List<List<coq<?>>>> $$1 = Maps.newHashMap();
      Table<etm, String, List<coq<?>>> $$2 = HashBasedTable.create();

      for (coq<?> $$3 : $$0) {
         coo<?> $$4 = $$3.b();
         if (!$$4.ap_() && !$$4.i()) {
            etm $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<coq<?>> $$7 = (List<coq<?>>)$$2.get($$5, $$6);
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

   private static etm g(coq<?> $$0) {
      coo<?> $$1 = $$0.b();
      if ($$1 instanceof cod $$2) {
         return switch ($$2.d()) {
            case a -> etm.b;
            case c -> etm.d;
            case b -> etm.c;
            case d -> etm.e;
         };
      } else {
         cot<?> $$3 = $$1.e();
         if ($$1 instanceof cnv $$4) {
            cob $$5 = $$4.f();
            if ($$3 == cot.b) {
               return switch ($$5) {
                  case b -> etm.h;
                  case a -> etm.g;
                  case c -> etm.i;
               };
            }

            if ($$3 == cot.c) {
               return $$5 == cob.b ? etm.k : etm.l;
            }

            if ($$3 == cot.d) {
               return etm.n;
            }

            if ($$3 == cot.e) {
               return etm.q;
            }
         }

         if ($$3 == cot.f) {
            return etm.o;
         } else if ($$3 == cot.g) {
            return etm.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> jy.t.b($$1.e())), LogUtils.defer($$0::a));
            return etm.r;
         }
      }
   }

   public List<fem> b() {
      return this.e;
   }

   public List<fem> a(etm $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
