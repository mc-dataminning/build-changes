import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cqe {
   protected static final ImmutableList<? extends cid<? extends cic<? super cqd>>> a = ImmutableList.of(cid.c, cid.d);
   protected static final ImmutableList<? extends cgw<?>> b = ImmutableList.of(cgw.g, cgw.h, cgw.k, cgw.l, cgw.m, cgw.o, cgw.n, cgw.F, cgw.u, cgw.p, cgw.q);

   static void a(byu<cqd> $$0) {
      $$0.a(ctr.a, 0, ImmutableList.of(new ccf<cqd>(0.8F) {
         protected boolean a(ars $$0, cqd $$1) {
            return $$1.n() && super.a($$0, (bxu)$$1);
         }
      }, new car(45, 90), new cav()));
   }

   static void b(byu<cqd> $$0) {
      $$0.a(
         ctr.b,
         10,
         ImmutableList.of(
            cbx.a(($$0x, $$1) -> $$1.gC(), ($$0x, $$1) -> $$1.ec().c(cgw.l)),
            cbl.a(8.0F, buc.a(30, 60)),
            new cbi(ImmutableList.of(Pair.of(cbd.a(0.3F), 2), Pair.of(cbs.a(0.3F, 3), 2), Pair.of(new bzv(30, 60), 1)))
         )
      );
   }

   static void a(cqd $$0, byu<cqd> $$1) {
      $$1.a(ctr.k, 10, ImmutableList.of(cbq.a(1.0F), cas.a(cqd::n, 40), cca.a(($$1x, $$2) -> !a($$0, $$2))), ImmutableSet.of(Pair.of(cgw.p, cgx.a)));
   }

   private static boolean a(cqd $$0, bxu $$1) {
      Optional<List<crx>> $$2 = $$0.ec().c(cgw.m);
      return $$2.<Boolean>map($$1x -> {
         if ($$1 instanceof crx $$2x && $$1x.contains($$2x)) {
            return true;
         }

         return false;
      }).orElse(false);
   }

   public static byu.b<cqd> a() {
      return byu.a(b, a);
   }

   public static byu<cqd> b(cqd $$0, byu<cqd> $$1) {
      a($$1);
      b($$1);
      a($$0, $$1);
      $$1.a(ImmutableSet.of(ctr.a));
      $$1.b(ctr.b);
      $$1.f();
      return $$1;
   }

   public static void a(cqd $$0) {
      if (!$$0.n()) {
         $$0.ec().f();
      } else {
         $$0.ec().a(ImmutableList.of(ctr.k, ctr.b));
      }
   }
}
