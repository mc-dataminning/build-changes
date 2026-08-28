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

public class fji extends awr {
   private static final Logger c = LogUtils.getLogger();
   private Map<fke, List<fvp>> d = ImmutableMap.of();
   private List<fvp> e = ImmutableList.of();

   public void a(Iterable<dav<?>> $$0, ke $$1) {
      Map<fke, List<List<dav<?>>>> $$2 = a($$0);
      Map<fke, List<fvp>> $$3 = Maps.newHashMap();
      Builder<fvp> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fvp($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fke.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fke, List<List<dav<?>>>> a(Iterable<dav<?>> $$0) {
      Map<fke, List<List<dav<?>>>> $$1 = Maps.newHashMap();
      Table<fke, String, List<dav<?>>> $$2 = HashBasedTable.create();

      for (dav<?> $$3 : $$0) {
         dat<?> $$4 = $$3.b();
         if (!$$4.ap_() && !$$4.a().c()) {
            fke $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<dav<?>> $$7 = (List<dav<?>>)$$2.get($$5, $$6);
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

   private static fke g(dav<?> $$0) {
      dat<?> $$1 = $$0.b();
      if ($$1 instanceof daj $$2) {
         return switch ($$2.d()) {
            case a -> fke.b;
            case c -> fke.d;
            case b -> fke.c;
            case d -> fke.e;
         };
      } else {
         daz<?> $$3 = $$1.e();
         if ($$1 instanceof daa $$4) {
            dag $$5 = $$4.f();
            if ($$3 == daz.b) {
               return switch ($$5) {
                  case b -> fke.h;
                  case a -> fke.g;
                  case c -> fke.i;
               };
            }

            if ($$3 == daz.c) {
               return $$5 == dag.b ? fke.k : fke.l;
            }

            if ($$3 == daz.d) {
               return fke.n;
            }

            if ($$3 == daz.e) {
               return fke.q;
            }
         }

         if ($$3 == daz.f) {
            return fke.o;
         } else if ($$3 == daz.g) {
            return fke.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> lz.q.b($$1.e())), LogUtils.defer($$0::a));
            return fke.r;
         }
      }
   }

   public List<fvp> b() {
      return this.e;
   }

   public List<fvp> a(fke $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
