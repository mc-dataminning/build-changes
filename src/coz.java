import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class coz {
   protected static final ImmutableList<? extends chi<? extends chh<? super coy>>> a = ImmutableList.of(chi.c, chi.d);
   protected static final ImmutableList<? extends cgb<?>> b = ImmutableList.of(cgb.g, cgb.h, cgb.k, cgb.l, cgb.m, cgb.o, cgb.n, cgb.F, cgb.u, cgb.p, cgb.q);

   static void a(bxz<coy> $$0) {
      $$0.a(csl.a, 0, ImmutableList.of(new cbk<coy>(0.8F) {
         protected boolean a(aro $$0, coy $$1) {
            return $$1.n() && super.a($$0, (bwz)$$1);
         }
      }, new bzw(45, 90), new caa()));
   }

   static void b(bxz<coy> $$0) {
      $$0.a(
         csl.b,
         10,
         ImmutableList.of(
            cbc.a(($$0x, $$1) -> $$1.gy(), ($$0x, $$1) -> $$1.eb().c(cgb.l)),
            caq.a(8.0F, btj.a(30, 60)),
            new can(ImmutableList.of(Pair.of(cai.a(0.3F), 2), Pair.of(cax.a(0.3F, 3), 2), Pair.of(new bza(30, 60), 1)))
         )
      );
   }

   static void a(coy $$0, bxz<coy> $$1) {
      $$1.a(csl.k, 10, ImmutableList.of(cav.a(1.0F), bzx.a(coy::n, 40), cbf.a(($$1x, $$2) -> !a($$0, $$2))), ImmutableSet.of(Pair.of(cgb.p, cgc.a)));
   }

   private static boolean a(coy $$0, bwz $$1) {
      Optional<List<cqs>> $$2 = $$0.eb().c(cgb.m);
      return $$2.<Boolean>map($$1x -> {
         if ($$1 instanceof cqs $$2x && $$1x.contains($$2x)) {
            return true;
         }

         return false;
      }).orElse(false);
   }

   public static bxz.b<coy> a() {
      return bxz.a(b, a);
   }

   public static bxz<coy> b(coy $$0, bxz<coy> $$1) {
      a($$1);
      b($$1);
      a($$0, $$1);
      $$1.a(ImmutableSet.of(csl.a));
      $$1.b(csl.b);
      $$1.f();
      return $$1;
   }

   public static void a(coy $$0) {
      if (!$$0.n()) {
         $$0.eb().f();
      } else {
         $$0.eb().a(ImmutableList.of(csl.k, csl.b));
      }
   }
}
