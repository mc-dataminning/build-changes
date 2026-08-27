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

public class fdo extends avl {
   private static final Logger c = LogUtils.getLogger();
   private Map<fej, List<fpq>> d = ImmutableMap.of();
   private List<fpq> e = ImmutableList.of();

   public void a(Iterable<cxy<?>> $$0, jl $$1) {
      Map<fej, List<List<cxy<?>>>> $$2 = a($$0);
      Map<fej, List<fpq>> $$3 = Maps.newHashMap();
      Builder<fpq> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fpq($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fej.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fej, List<List<cxy<?>>>> a(Iterable<cxy<?>> $$0) {
      Map<fej, List<List<cxy<?>>>> $$1 = Maps.newHashMap();
      Table<fej, String, List<cxy<?>>> $$2 = HashBasedTable.create();

      for (cxy<?> $$3 : $$0) {
         cxw<?> $$4 = $$3.b();
         if (!$$4.ao_() && !$$4.i()) {
            fej $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cxy<?>> $$7 = (List<cxy<?>>)$$2.get($$5, $$6);
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

   private static fej g(cxy<?> $$0) {
      cxw<?> $$1 = $$0.b();
      if ($$1 instanceof cxn $$2) {
         return switch ($$2.d()) {
            case a -> fej.b;
            case c -> fej.d;
            case b -> fej.c;
            case d -> fej.e;
         };
      } else {
         cyb<?> $$3 = $$1.e();
         if ($$1 instanceof cxf $$4) {
            cxl $$5 = $$4.f();
            if ($$3 == cyb.b) {
               return switch ($$5) {
                  case b -> fej.h;
                  case a -> fej.g;
                  case c -> fej.i;
               };
            }

            if ($$3 == cyb.c) {
               return $$5 == cxl.b ? fej.k : fej.l;
            }

            if ($$3 == cyb.d) {
               return fej.n;
            }

            if ($$3 == cyb.e) {
               return fej.q;
            }
         }

         if ($$3 == cyb.f) {
            return fej.o;
         } else if ($$3 == cyb.g) {
            return fej.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> le.s.b($$1.e())), LogUtils.defer($$0::a));
            return fej.r;
         }
      }
   }

   public List<fpq> b() {
      return this.e;
   }

   public List<fpq> a(fej $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
