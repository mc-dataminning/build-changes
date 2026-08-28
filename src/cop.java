import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cop {
   protected static final ImmutableList<? extends cha<? extends cgz<? super coo>>> a = ImmutableList.of(cha.c, cha.d);
   protected static final ImmutableList<? extends cft<?>> b = ImmutableList.of(cft.g, cft.h, cft.k, cft.l, cft.m, cft.o, cft.n, cft.F, cft.u, cft.p, cft.q);

   static void a(bxr<coo> $$0) {
      $$0.a(crz.a, 0, ImmutableList.of(new cbc<coo>(0.8F) {
         protected boolean a(arn $$0, coo $$1) {
            return $$1.n() && super.a($$0, (bwr)$$1);
         }
      }, new bzo(45, 90), new bzs()));
   }

   static void b(bxr<coo> $$0) {
      $$0.a(
         crz.b,
         10,
         ImmutableList.of(
            cau.a(($$0x, $$1) -> $$1.gy(), ($$0x, $$1) -> $$1.eb().c(cft.l)),
            cai.a(8.0F, btb.a(30, 60)),
            new caf(ImmutableList.of(Pair.of(caa.a(0.3F), 2), Pair.of(cap.a(0.3F, 3), 2), Pair.of(new bys(30, 60), 1)))
         )
      );
   }

   static void a(coo $$0, bxr<coo> $$1) {
      $$1.a(crz.k, 10, ImmutableList.of(can.a(1.0F), bzp.a(coo::n, 40), cax.a(($$1x, $$2) -> !a($$0, $$2))), ImmutableSet.of(Pair.of(cft.p, cfu.a)));
   }

   private static boolean a(coo $$0, bwr $$1) {
      Optional<List<cqi>> $$2 = $$0.eb().c(cft.m);
      return $$2.<Boolean>map($$1x -> {
         if ($$1 instanceof cqi $$2x && $$1x.contains($$2x)) {
            return true;
         }

         return false;
      }).orElse(false);
   }

   public static bxr.b<coo> a() {
      return bxr.a(b, a);
   }

   public static bxr<coo> b(coo $$0, bxr<coo> $$1) {
      a($$1);
      b($$1);
      a($$0, $$1);
      $$1.a(ImmutableSet.of(crz.a));
      $$1.b(crz.b);
      $$1.f();
      return $$1;
   }

   public static void a(coo $$0) {
      if (!$$0.n()) {
         $$0.eb().f();
      } else {
         $$0.eb().a(ImmutableList.of(crz.k, crz.b));
      }
   }
}
