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

public class fes extends awd {
   private static final Logger c = LogUtils.getLogger();
   private Map<ffn, List<fqu>> d = ImmutableMap.of();
   private List<fqu> e = ImmutableList.of();

   public void a(Iterable<cyx<?>> $$0, jw $$1) {
      Map<ffn, List<List<cyx<?>>>> $$2 = a($$0);
      Map<ffn, List<fqu>> $$3 = Maps.newHashMap();
      Builder<fqu> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fqu($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      ffn.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<ffn, List<List<cyx<?>>>> a(Iterable<cyx<?>> $$0) {
      Map<ffn, List<List<cyx<?>>>> $$1 = Maps.newHashMap();
      Table<ffn, String, List<cyx<?>>> $$2 = HashBasedTable.create();

      for (cyx<?> $$3 : $$0) {
         cyv<?> $$4 = $$3.b();
         if (!$$4.an_() && !$$4.i()) {
            ffn $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cyx<?>> $$7 = (List<cyx<?>>)$$2.get($$5, $$6);
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

   private static ffn g(cyx<?> $$0) {
      cyv<?> $$1 = $$0.b();
      if ($$1 instanceof cym $$2) {
         return switch ($$2.d()) {
            case a -> ffn.b;
            case c -> ffn.d;
            case b -> ffn.c;
            case d -> ffn.e;
         };
      } else {
         cza<?> $$3 = $$1.e();
         if ($$1 instanceof cye $$4) {
            cyk $$5 = $$4.f();
            if ($$3 == cza.b) {
               return switch ($$5) {
                  case b -> ffn.h;
                  case a -> ffn.g;
                  case c -> ffn.i;
               };
            }

            if ($$3 == cza.c) {
               return $$5 == cyk.b ? ffn.k : ffn.l;
            }

            if ($$3 == cza.d) {
               return ffn.n;
            }

            if ($$3 == cza.e) {
               return ffn.q;
            }
         }

         if ($$3 == cza.f) {
            return ffn.o;
         } else if ($$3 == cza.g) {
            return ffn.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lp.s.b($$1.e())), LogUtils.defer($$0::a));
            return ffn.r;
         }
      }
   }

   public List<fqu> b() {
      return this.e;
   }

   public List<fqu> a(ffn $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
