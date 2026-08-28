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

public class fit extends awo {
   private static final Logger c = LogUtils.getLogger();
   private Map<fjp, List<fva>> d = ImmutableMap.of();
   private List<fva> e = ImmutableList.of();

   public void a(Iterable<dar<?>> $$0, ke $$1) {
      Map<fjp, List<List<dar<?>>>> $$2 = a($$0);
      Map<fjp, List<fva>> $$3 = Maps.newHashMap();
      Builder<fva> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fva($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fjp.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fjp, List<List<dar<?>>>> a(Iterable<dar<?>> $$0) {
      Map<fjp, List<List<dar<?>>>> $$1 = Maps.newHashMap();
      Table<fjp, String, List<dar<?>>> $$2 = HashBasedTable.create();

      for (dar<?> $$3 : $$0) {
         dap<?> $$4 = $$3.b();
         if (!$$4.ap_() && !$$4.a().c()) {
            fjp $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<dar<?>> $$7 = (List<dar<?>>)$$2.get($$5, $$6);
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

   private static fjp g(dar<?> $$0) {
      dap<?> $$1 = $$0.b();
      if ($$1 instanceof daf $$2) {
         return switch ($$2.d()) {
            case a -> fjp.b;
            case c -> fjp.d;
            case b -> fjp.c;
            case d -> fjp.e;
         };
      } else {
         dav<?> $$3 = $$1.e();
         if ($$1 instanceof czw $$4) {
            dac $$5 = $$4.f();
            if ($$3 == dav.b) {
               return switch ($$5) {
                  case b -> fjp.h;
                  case a -> fjp.g;
                  case c -> fjp.i;
               };
            }

            if ($$3 == dav.c) {
               return $$5 == dac.b ? fjp.k : fjp.l;
            }

            if ($$3 == dav.d) {
               return fjp.n;
            }

            if ($$3 == dav.e) {
               return fjp.q;
            }
         }

         if ($$3 == dav.f) {
            return fjp.o;
         } else if ($$3 == dav.g) {
            return fjp.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> ly.q.b($$1.e())), LogUtils.defer($$0::a));
            return fjp.r;
         }
      }
   }

   public List<fva> b() {
      return this.e;
   }

   public List<fva> a(fjp $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
