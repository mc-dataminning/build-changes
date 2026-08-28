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

public class feu extends awd {
   private static final Logger c = LogUtils.getLogger();
   private Map<ffp, List<fqw>> d = ImmutableMap.of();
   private List<fqw> e = ImmutableList.of();

   public void a(Iterable<cyz<?>> $$0, jw $$1) {
      Map<ffp, List<List<cyz<?>>>> $$2 = a($$0);
      Map<ffp, List<fqw>> $$3 = Maps.newHashMap();
      Builder<fqw> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fqw($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      ffp.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<ffp, List<List<cyz<?>>>> a(Iterable<cyz<?>> $$0) {
      Map<ffp, List<List<cyz<?>>>> $$1 = Maps.newHashMap();
      Table<ffp, String, List<cyz<?>>> $$2 = HashBasedTable.create();

      for (cyz<?> $$3 : $$0) {
         cyx<?> $$4 = $$3.b();
         if (!$$4.an_() && !$$4.i()) {
            ffp $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cyz<?>> $$7 = (List<cyz<?>>)$$2.get($$5, $$6);
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

   private static ffp g(cyz<?> $$0) {
      cyx<?> $$1 = $$0.b();
      if ($$1 instanceof cyo $$2) {
         return switch ($$2.d()) {
            case a -> ffp.b;
            case c -> ffp.d;
            case b -> ffp.c;
            case d -> ffp.e;
         };
      } else {
         czc<?> $$3 = $$1.e();
         if ($$1 instanceof cyg $$4) {
            cym $$5 = $$4.f();
            if ($$3 == czc.b) {
               return switch ($$5) {
                  case b -> ffp.h;
                  case a -> ffp.g;
                  case c -> ffp.i;
               };
            }

            if ($$3 == czc.c) {
               return $$5 == cym.b ? ffp.k : ffp.l;
            }

            if ($$3 == czc.d) {
               return ffp.n;
            }

            if ($$3 == czc.e) {
               return ffp.q;
            }
         }

         if ($$3 == czc.f) {
            return ffp.o;
         } else if ($$3 == czc.g) {
            return ffp.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lp.s.b($$1.e())), LogUtils.defer($$0::a));
            return ffp.r;
         }
      }
   }

   public List<fqw> b() {
      return this.e;
   }

   public List<fqw> a(ffp $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
