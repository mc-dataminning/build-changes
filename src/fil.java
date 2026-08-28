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

public class fil extends awn {
   private static final Logger c = LogUtils.getLogger();
   private Map<fjh, List<fus>> d = ImmutableMap.of();
   private List<fus> e = ImmutableList.of();

   public void a(Iterable<dal<?>> $$0, kd $$1) {
      Map<fjh, List<List<dal<?>>>> $$2 = a($$0);
      Map<fjh, List<fus>> $$3 = Maps.newHashMap();
      Builder<fus> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fus($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fjh.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fjh, List<List<dal<?>>>> a(Iterable<dal<?>> $$0) {
      Map<fjh, List<List<dal<?>>>> $$1 = Maps.newHashMap();
      Table<fjh, String, List<dal<?>>> $$2 = HashBasedTable.create();

      for (dal<?> $$3 : $$0) {
         daj<?> $$4 = $$3.b();
         if (!$$4.aq_() && !$$4.a().c()) {
            fjh $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<dal<?>> $$7 = (List<dal<?>>)$$2.get($$5, $$6);
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

   private static fjh g(dal<?> $$0) {
      daj<?> $$1 = $$0.b();
      if ($$1 instanceof czz $$2) {
         return switch ($$2.d()) {
            case a -> fjh.b;
            case c -> fjh.d;
            case b -> fjh.c;
            case d -> fjh.e;
         };
      } else {
         dap<?> $$3 = $$1.e();
         if ($$1 instanceof czq $$4) {
            czw $$5 = $$4.f();
            if ($$3 == dap.b) {
               return switch ($$5) {
                  case b -> fjh.h;
                  case a -> fjh.g;
                  case c -> fjh.i;
               };
            }

            if ($$3 == dap.c) {
               return $$5 == czw.b ? fjh.k : fjh.l;
            }

            if ($$3 == dap.d) {
               return fjh.n;
            }

            if ($$3 == dap.e) {
               return fjh.q;
            }
         }

         if ($$3 == dap.f) {
            return fjh.o;
         } else if ($$3 == dap.g) {
            return fjh.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lx.q.b($$1.e())), LogUtils.defer($$0::a));
            return fjh.r;
         }
      }
   }

   public List<fus> b() {
      return this.e;
   }

   public List<fus> a(fjh $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
