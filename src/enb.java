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

public class enb extends amk {
   private static final Logger c = LogUtils.getLogger();
   private Map<enw, List<eyg>> d = ImmutableMap.of();
   private List<eyg> e = ImmutableList.of();

   public void a(Iterable<cjc<?>> $$0, hs $$1) {
      Map<enw, List<List<cjc<?>>>> $$2 = a($$0);
      Map<enw, List<eyg>> $$3 = Maps.newHashMap();
      Builder<eyg> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new eyg($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      enw.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<enw, List<List<cjc<?>>>> a(Iterable<cjc<?>> $$0) {
      Map<enw, List<List<cjc<?>>>> $$1 = Maps.newHashMap();
      Table<enw, String, List<cjc<?>>> $$2 = HashBasedTable.create();

      for (cjc<?> $$3 : $$0) {
         if (!$$3.ai_() && !$$3.j()) {
            enw $$4 = g($$3);
            String $$5 = $$3.c();
            if ($$5.isEmpty()) {
               $$1.computeIfAbsent($$4, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cjc<?>> $$6 = (List<cjc<?>>)$$2.get($$4, $$5);
               if ($$6 == null) {
                  $$6 = Lists.newArrayList();
                  $$2.put($$4, $$5, $$6);
                  $$1.computeIfAbsent($$4, $$0x -> Lists.newArrayList()).add($$6);
               }

               $$6.add($$3);
            }
         }
      }

      return $$1;
   }

   private static enw g(cjc<?> $$0) {
      if ($$0 instanceof cit $$1) {
         return switch ($$1.d()) {
            case a -> enw.b;
            case c -> enw.d;
            case b -> enw.c;
            case d -> enw.e;
         };
      } else {
         cjf<?> $$2 = $$0.f();
         if ($$0 instanceof cil $$3) {
            cir $$4 = $$3.g();
            if ($$2 == cjf.b) {
               return switch ($$4) {
                  case b -> enw.h;
                  case a -> enw.g;
                  case c -> enw.i;
               };
            }

            if ($$2 == cjf.c) {
               return $$4 == cir.b ? enw.k : enw.l;
            }

            if ($$2 == cjf.d) {
               return enw.n;
            }

            if ($$2 == cjf.e) {
               return enw.q;
            }
         }

         if ($$2 == cjf.f) {
            return enw.o;
         } else if ($$2 == cjf.g) {
            return enw.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> jb.t.b($$0.f())), LogUtils.defer($$0::e));
            return enw.r;
         }
      }
   }

   public List<eyg> b() {
      return this.e;
   }

   public List<eyg> a(enw $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
