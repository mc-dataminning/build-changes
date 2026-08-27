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

public class eqc extends apj {
   private static final Logger c = LogUtils.getLogger();
   private Map<eqy, List<fbv>> d = ImmutableMap.of();
   private List<fbv> e = ImmutableList.of();

   public void a(Iterable<cmq<?>> $$0, hr $$1) {
      Map<eqy, List<List<cmq<?>>>> $$2 = a($$0);
      Map<eqy, List<fbv>> $$3 = Maps.newHashMap();
      Builder<fbv> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fbv($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      eqy.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<eqy, List<List<cmq<?>>>> a(Iterable<cmq<?>> $$0) {
      Map<eqy, List<List<cmq<?>>>> $$1 = Maps.newHashMap();
      Table<eqy, String, List<cmq<?>>> $$2 = HashBasedTable.create();

      for (cmq<?> $$3 : $$0) {
         cmp<?> $$4 = $$3.b();
         if (!$$4.am_() && !$$4.i()) {
            eqy $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cmq<?>> $$7 = (List<cmq<?>>)$$2.get($$5, $$6);
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

   private static eqy g(cmq<?> $$0) {
      cmp<?> $$1 = $$0.b();
      if ($$1 instanceof cmf $$2) {
         return switch ($$2.d()) {
            case a -> eqy.b;
            case c -> eqy.d;
            case b -> eqy.c;
            case d -> eqy.e;
         };
      } else {
         cmt<?> $$3 = $$1.e();
         if ($$1 instanceof clx $$4) {
            cmd $$5 = $$4.f();
            if ($$3 == cmt.b) {
               return switch ($$5) {
                  case b -> eqy.h;
                  case a -> eqy.g;
                  case c -> eqy.i;
               };
            }

            if ($$3 == cmt.c) {
               return $$5 == cmd.b ? eqy.k : eqy.l;
            }

            if ($$3 == cmt.d) {
               return eqy.n;
            }

            if ($$3 == cmt.e) {
               return eqy.q;
            }
         }

         if ($$3 == cmt.f) {
            return eqy.o;
         } else if ($$3 == cmt.g) {
            return eqy.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> jb.t.b($$1.e())), LogUtils.defer($$0::a));
            return eqy.r;
         }
      }
   }

   public List<fbv> b() {
      return this.e;
   }

   public List<fbv> a(eqy $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
