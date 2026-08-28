import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cpq {
   protected static final ImmutableList<? extends chs<? extends chr<? super cpp>>> a = ImmutableList.of(chs.c, chs.d);
   protected static final ImmutableList<? extends cgl<?>> b = ImmutableList.of(cgl.g, cgl.h, cgl.k, cgl.l, cgl.m, cgl.o, cgl.n, cgl.F, cgl.u, cgl.p, cgl.q);

   static void a(byj<cpp> $$0) {
      $$0.a(ctd.a, 0, ImmutableList.of(new cbu<cpp>(0.8F) {
         protected boolean a(arq $$0, cpp $$1) {
            return $$1.n() && super.a($$0, (bxj)$$1);
         }
      }, new cag(45, 90), new cak()));
   }

   static void b(byj<cpp> $$0) {
      $$0.a(
         ctd.b,
         10,
         ImmutableList.of(
            cbm.a(($$0x, $$1) -> $$1.gB(), ($$0x, $$1) -> $$1.eb().c(cgl.l)),
            cba.a(8.0F, btr.a(30, 60)),
            new cax(ImmutableList.of(Pair.of(cas.a(0.3F), 2), Pair.of(cbh.a(0.3F, 3), 2), Pair.of(new bzk(30, 60), 1)))
         )
      );
   }

   static void a(cpp $$0, byj<cpp> $$1) {
      $$1.a(ctd.k, 10, ImmutableList.of(cbf.a(1.0F), cah.a(cpp::n, 40), cbp.a(($$1x, $$2) -> !a($$0, $$2))), ImmutableSet.of(Pair.of(cgl.p, cgm.a)));
   }

   private static boolean a(cpp $$0, bxj $$1) {
      Optional<List<crj>> $$2 = $$0.eb().c(cgl.m);
      return $$2.<Boolean>map($$1x -> {
         if ($$1 instanceof crj $$2x && $$1x.contains($$2x)) {
            return true;
         }

         return false;
      }).orElse(false);
   }

   public static byj.b<cpp> a() {
      return byj.a(b, a);
   }

   public static byj<cpp> b(cpp $$0, byj<cpp> $$1) {
      a($$1);
      b($$1);
      a($$0, $$1);
      $$1.a(ImmutableSet.of(ctd.a));
      $$1.b(ctd.b);
      $$1.f();
      return $$1;
   }

   public static void a(cpp $$0) {
      if (!$$0.n()) {
         $$0.eb().f();
      } else {
         $$0.eb().a(ImmutableList.of(ctd.k, ctd.b));
      }
   }
}
