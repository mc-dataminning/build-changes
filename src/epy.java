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

public class epy extends aoz {
   private static final Logger c = LogUtils.getLogger();
   private Map<equ, List<fbq>> d = ImmutableMap.of();
   private List<fbq> e = ImmutableList.of();

   public void a(Iterable<cma<?>> $$0, hs $$1) {
      Map<equ, List<List<cma<?>>>> $$2 = a($$0);
      Map<equ, List<fbq>> $$3 = Maps.newHashMap();
      Builder<fbq> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fbq($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      equ.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<equ, List<List<cma<?>>>> a(Iterable<cma<?>> $$0) {
      Map<equ, List<List<cma<?>>>> $$1 = Maps.newHashMap();
      Table<equ, String, List<cma<?>>> $$2 = HashBasedTable.create();

      for (cma<?> $$3 : $$0) {
         if (!$$3.ah_() && !$$3.j()) {
            equ $$4 = g($$3);
            String $$5 = $$3.c();
            if ($$5.isEmpty()) {
               $$1.computeIfAbsent($$4, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cma<?>> $$6 = (List<cma<?>>)$$2.get($$4, $$5);
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

   private static equ g(cma<?> $$0) {
      if ($$0 instanceof clr $$1) {
         return switch ($$1.d()) {
            case a -> equ.b;
            case c -> equ.d;
            case b -> equ.c;
            case d -> equ.e;
         };
      } else {
         cmd<?> $$2 = $$0.f();
         if ($$0 instanceof clj $$3) {
            clp $$4 = $$3.g();
            if ($$2 == cmd.b) {
               return switch ($$4) {
                  case b -> equ.h;
                  case a -> equ.g;
                  case c -> equ.i;
               };
            }

            if ($$2 == cmd.c) {
               return $$4 == clp.b ? equ.k : equ.l;
            }

            if ($$2 == cmd.d) {
               return equ.n;
            }

            if ($$2 == cmd.e) {
               return equ.q;
            }
         }

         if ($$2 == cmd.f) {
            return equ.o;
         } else if ($$2 == cmd.g) {
            return equ.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> jb.t.b($$0.f())), LogUtils.defer($$0::e));
            return equ.r;
         }
      }
   }

   public List<fbq> b() {
      return this.e;
   }

   public List<fbq> a(equ $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
