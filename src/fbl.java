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

public class fbl extends aur {
   private static final Logger c = LogUtils.getLogger();
   private Map<fch, List<fno>> d = ImmutableMap.of();
   private List<fno> e = ImmutableList.of();

   public void a(Iterable<cvu<?>> $$0, jb $$1) {
      Map<fch, List<List<cvu<?>>>> $$2 = a($$0);
      Map<fch, List<fno>> $$3 = Maps.newHashMap();
      Builder<fno> $$4 = ImmutableList.builder();
      $$2.forEach(($$3x, $$4x) -> $$3.put($$3x, $$4x.stream().map($$1xx -> new fno($$1, $$1xx)).peek($$4::add).collect(ImmutableList.toImmutableList())));
      fch.w
         .forEach(
            ($$1x, $$2x) -> $$3.put(
                  $$1x, $$2x.stream().flatMap($$1xx -> $$3.getOrDefault($$1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               )
         );
      this.d = ImmutableMap.copyOf($$3);
      this.e = $$4.build();
   }

   private static Map<fch, List<List<cvu<?>>>> a(Iterable<cvu<?>> $$0) {
      Map<fch, List<List<cvu<?>>>> $$1 = Maps.newHashMap();
      Table<fch, String, List<cvu<?>>> $$2 = HashBasedTable.create();

      for (cvu<?> $$3 : $$0) {
         cvs<?> $$4 = $$3.b();
         if (!$$4.an_() && !$$4.i()) {
            fch $$5 = g($$3);
            String $$6 = $$4.c();
            if ($$6.isEmpty()) {
               $$1.computeIfAbsent($$5, $$0x -> Lists.newArrayList()).add(ImmutableList.of($$3));
            } else {
               List<cvu<?>> $$7 = (List<cvu<?>>)$$2.get($$5, $$6);
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

   private static fch g(cvu<?> $$0) {
      cvs<?> $$1 = $$0.b();
      if ($$1 instanceof cvj $$2) {
         return switch ($$2.d()) {
            case a -> fch.b;
            case c -> fch.d;
            case b -> fch.c;
            case d -> fch.e;
         };
      } else {
         cvx<?> $$3 = $$1.e();
         if ($$1 instanceof cvb $$4) {
            cvh $$5 = $$4.f();
            if ($$3 == cvx.b) {
               return switch ($$5) {
                  case b -> fch.h;
                  case a -> fch.g;
                  case c -> fch.i;
               };
            }

            if ($$3 == cvx.c) {
               return $$5 == cvh.b ? fch.k : fch.l;
            }

            if ($$3 == cvx.d) {
               return fch.n;
            }

            if ($$3 == cvx.e) {
               return fch.q;
            }
         }

         if ($$3 == cvx.f) {
            return fch.o;
         } else if ($$3 == cvx.g) {
            return fch.p;
         } else {
            c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> kt.s.b($$1.e())), LogUtils.defer($$0::a));
            return fch.r;
         }
      }
   }

   public List<fno> b() {
      return this.e;
   }

   public List<fno> a(fch $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
