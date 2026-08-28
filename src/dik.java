import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dik extends die implements dil {
   public static final MapCodec<dik> a = b(dik::new);
   public static final dwa b = dvz.e;
   private static final int c = 5;

   @Override
   public MapCodec<dik> a() {
      return a;
   }

   public dik(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      dvj $$4 = $$1.a_($$2.d());
      if ($$4.l()) {
         $$3.l($$0.c(b));
         if (!$$1.C) {
            arn $$5 = (arn)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(lr.am, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(lr.d, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected erk b_(dvj $$0) {
      return erl.c.a(false);
   }

   public static void b(dfc $$0, jh $$1, dvj $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dfc $$0, jh $$1, dvj $$2, dvj $$3) {
      if (o($$2)) {
         dvj $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         jh.a $$5 = $$1.k().c(jm.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jm.b);
         }
      }
   }

   private static boolean o(dvj $$0) {
      return $$0.a(dig.nd) || $$0.a(dig.G) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dvj q(dvj $$0) {
      if ($$0.a(dig.nd)) {
         return $$0;
      } else if ($$0.a(dig.dW)) {
         return dig.nd.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dig.kJ) ? dig.nd.m().b(b, Boolean.valueOf(true)) : dig.G.m();
      }
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lr.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awl.da, awm.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lr.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lr.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awl.cY, awm.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      $$3.a($$4, erl.c, erl.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == jm.a || $$1 == jm.b && !$$2.a(dig.nd) && o($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      dvj $$3 = $$1.a_($$2.e());
      return $$3.a(dig.nd) || $$3.a(dig.kJ) || $$3.a(dig.dW);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return fae.a();
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.a;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   public cwb a(@Nullable com $$0, dfc $$1, jh $$2, dvj $$3) {
      $$1.a($$2, dig.a.m(), 11);
      return new cwb(cwf.qA);
   }

   @Override
   public Optional<awk> at_() {
      return erl.c.j();
   }
}
