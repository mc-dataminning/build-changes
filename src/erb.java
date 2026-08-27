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

public class erb extends aqg {
   private static final Logger c = LogUtils.getLogger();
   private Map<erx, List<fcu>> d = ImmutableMap.of();
   private List<fcu> e = ImmutableList.of();

   public void a(Iterable<cno<?>> $$0, ip $$1) {
      Map<erx, List<List<cno<?>>>> $$2 = a($$0);
      Map<erx, List<fcu>> $$3 = Maps.newHashMap();
      Builder<fcu> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fcu($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      erx.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<erx, List<List<cno<?>>>> a(Iterable<cno<?>> $$0) {
      Map<erx, List<List<cno<?>>>> $$1 = Maps.newHashMap();
      Table<erx, String, List<cno<?>>> $$2 = HashBasedTable.create();

      for (cno<?> $$3 : $$0) {
         cnn<?> $$4 = $$3.b();
         if (!$$4.ap_() && !$$4.i()) {
            erx $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cno<?>> $$7 = (List<cno<?>>)$$2.get($$5, $$6);
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

   private static erx g(cno<?> $$0) {
      cnn<?> $$1 = $$0.b();
      if ($$1 instanceof cnd $$2) {
         return switch ($$2.d()) {
            case a -> erx.b;
            case c -> erx.d;
            case b -> erx.c;
            case d -> erx.e;
         };
      } else {
         cnr<?> $$3 = $$1.e();
         if ($$1 instanceof cmv $$4) {
            cnb $$5 = $$4.f();
            if ($$3 == cnr.b) {
               return switch ($$5) {
                  case b -> erx.h;
                  case a -> erx.g;
                  case c -> erx.i;
               };
            }

            if ($$3 == cnr.c) {
               return $$5 == cnb.b ? erx.k : erx.l;
            }

            if ($$3 == cnr.d) {
               return erx.n;
            }

            if ($$3 == cnr.e) {
               return erx.q;
            }
         }

         if ($$3 == cnr.f) {
            return erx.o;
         } else if ($$3 == cnr.g) {
            return erx.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> jy.t.b($$1.e())), LogUtils.defer($$0::a));
            return erx.r;
         }
      }
   }

   public List<fcu> b() {
      return this.e;
   }

   public List<fcu> a(erx $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
