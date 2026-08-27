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

public class eqi extends apg {
   private static final Logger c = LogUtils.getLogger();
   private Map<ere, List<fca>> d = ImmutableMap.of();
   private List<fca> e = ImmutableList.of();

   public void a(Iterable<cmk<?>> $$0, hr $$1) {
      Map<ere, List<List<cmk<?>>>> $$2 = a($$0);
      Map<ere, List<fca>> $$3 = Maps.newHashMap();
      Builder<fca> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fca($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      ere.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<ere, List<List<cmk<?>>>> a(Iterable<cmk<?>> $$0) {
      Map<ere, List<List<cmk<?>>>> $$1 = Maps.newHashMap();
      Table<ere, String, List<cmk<?>>> $$2 = HashBasedTable.create();

      for (cmk<?> $$3 : $$0) {
         cmj<?> $$4 = $$3.b();
         if (!$$4.am_() && !$$4.i()) {
            ere $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cmk<?>> $$7 = (List<cmk<?>>)$$2.get($$5, $$6);
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

   private static ere g(cmk<?> $$0) {
      cmj<?> $$1 = $$0.b();
      if ($$1 instanceof clz $$2) {
         return switch ($$2.d()) {
            case a -> ere.b;
            case c -> ere.d;
            case b -> ere.c;
            case d -> ere.e;
         };
      } else {
         cmn<?> $$3 = $$1.e();
         if ($$1 instanceof clr $$4) {
            clx $$5 = $$4.f();
            if ($$3 == cmn.b) {
               return switch ($$5) {
                  case b -> ere.h;
                  case a -> ere.g;
                  case c -> ere.i;
               };
            }

            if ($$3 == cmn.c) {
               return $$5 == clx.b ? ere.k : ere.l;
            }

            if ($$3 == cmn.d) {
               return ere.n;
            }

            if ($$3 == cmn.e) {
               return ere.q;
            }
         }

         if ($$3 == cmn.f) {
            return ere.o;
         } else if ($$3 == cmn.g) {
            return ere.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> jb.t.b($$1.e())), LogUtils.defer($$0::a));
            return ere.r;
         }
      }
   }

   public List<fca> b() {
      return this.e;
   }

   public List<fca> a(ere $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
