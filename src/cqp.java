import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cqp {
   protected static final ImmutableList<? extends cio<? extends cin<? super cqo>>> a = ImmutableList.of(cio.c, cio.d);
   protected static final ImmutableList<? extends chh<?>> b = ImmutableList.of(chh.g, chh.h, chh.k, chh.l, chh.m, chh.o, chh.n, chh.F, chh.u, chh.p, chh.q);

   static void a(bzf<cqo> $$0) {
      $$0.a(cuc.a, 0, ImmutableList.of(new ccq<cqo>(0.8F) {
         protected boolean a(asb $$0, cqo $$1) {
            return $$1.u() && super.a($$0, (byf)$$1);
         }
      }, new cbc(45, 90), new cbg()));
   }

   static void b(bzf<cqo> $$0) {
      $$0.a(
         cuc.b,
         10,
         ImmutableList.of(
            cci.a(($$0x, $$1) -> $$1.gF(), ($$0x, $$1) -> $$1.ec().c(chh.l)),
            cbw.a(8.0F, bun.a(30, 60)),
            new cbt(ImmutableList.of(Pair.of(cbo.a(0.3F), 2), Pair.of(ccd.a(0.3F, 3), 2), Pair.of(new cag(30, 60), 1)))
         )
      );
   }

   static void a(cqo $$0, bzf<cqo> $$1) {
      $$1.a(cuc.k, 10, ImmutableList.of(ccb.a(1.0F), cbd.a(cqo::u, 40), ccl.a(($$1x, $$2) -> !a($$0, $$2))), ImmutableSet.of(Pair.of(chh.p, chi.a)));
   }

   private static boolean a(cqo $$0, byf $$1) {
      Optional<List<csi>> $$2 = $$0.ec().c(chh.m);
      return $$2.<Boolean>map($$1x -> {
         if ($$1 instanceof csi $$2x && $$1x.contains($$2x)) {
            return true;
         }

         return false;
      }).orElse(false);
   }

   public static bzf.b<cqo> a() {
      return bzf.a(b, a);
   }

   public static bzf<cqo> b(cqo $$0, bzf<cqo> $$1) {
      a($$1);
      b($$1);
      a($$0, $$1);
      $$1.a(ImmutableSet.of(cuc.a));
      $$1.b(cuc.b);
      $$1.f();
      return $$1;
   }

   public static void a(cqo $$0) {
      if (!$$0.u()) {
         $$0.ec().f();
      } else {
         $$0.ec().a(ImmutableList.of(cuc.k, cuc.b));
      }
   }
}
