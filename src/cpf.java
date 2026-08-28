import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cpf {
   protected static final ImmutableList<? extends chl<? extends chk<? super cpe>>> a = ImmutableList.of(chl.c, chl.d);
   protected static final ImmutableList<? extends cge<?>> b = ImmutableList.of(cge.g, cge.h, cge.k, cge.l, cge.m, cge.o, cge.n, cge.F, cge.u, cge.p, cge.q);

   static void a(byc<cpe> $$0) {
      $$0.a(csr.a, 0, ImmutableList.of(new cbn<cpe>(0.8F) {
         protected boolean a(arq $$0, cpe $$1) {
            return $$1.n() && super.a($$0, (bxc)$$1);
         }
      }, new bzz(45, 90), new cad()));
   }

   static void b(byc<cpe> $$0) {
      $$0.a(
         csr.b,
         10,
         ImmutableList.of(
            cbf.a(($$0x, $$1) -> $$1.gy(), ($$0x, $$1) -> $$1.eb().c(cge.l)),
            cat.a(8.0F, btm.a(30, 60)),
            new caq(ImmutableList.of(Pair.of(cal.a(0.3F), 2), Pair.of(cba.a(0.3F, 3), 2), Pair.of(new bzd(30, 60), 1)))
         )
      );
   }

   static void a(cpe $$0, byc<cpe> $$1) {
      $$1.a(csr.k, 10, ImmutableList.of(cay.a(1.0F), caa.a(cpe::n, 40), cbi.a(($$1x, $$2) -> !a($$0, $$2))), ImmutableSet.of(Pair.of(cge.p, cgf.a)));
   }

   private static boolean a(cpe $$0, bxc $$1) {
      Optional<List<cqy>> $$2 = $$0.eb().c(cge.m);
      return $$2.<Boolean>map($$1x -> {
         if ($$1 instanceof cqy $$2x && $$1x.contains($$2x)) {
            return true;
         }

         return false;
      }).orElse(false);
   }

   public static byc.b<cpe> a() {
      return byc.a(b, a);
   }

   public static byc<cpe> b(cpe $$0, byc<cpe> $$1) {
      a($$1);
      b($$1);
      a($$0, $$1);
      $$1.a(ImmutableSet.of(csr.a));
      $$1.b(csr.b);
      $$1.f();
      return $$1;
   }

   public static void a(cpe $$0) {
      if (!$$0.n()) {
         $$0.eb().f();
      } else {
         $$0.eb().a(ImmutableList.of(csr.k, csr.b));
      }
   }
}
