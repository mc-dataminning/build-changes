import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqn extends die {
   public static final MapCodec<dqn> a = b(dqn::new);
   public static final dwa b = dvz.B;

   @Override
   public MapCodec<dqn> a() {
      return a;
   }

   public dqn(dvi.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dvj a(dfb $$0, jh $$1, dvj $$2, com $$3) {
      if (!$$0.y_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arn $$0, jh $$1, det $$2) {
      ckw $$3 = new ckw($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b());
      int $$4 = $$3.o();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dfb $$0, jh $$1) {
      a($$0, $$1, null);
   }

   private static void a(dfb $$0, jh $$1, @Nullable bva $$2) {
      if (!$$0.C) {
         ckw $$3 = new ckw($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dC(), $$3.dE(), $$3.dI(), awl.zC, awm.e, 1.0F, 1.0F);
         $$0.a($$2, eag.I, $$1);
      }
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if (!$$0.a(cwf.ot) && !$$0.a(cwf.tY)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dig.a.m(), 11);
         cvx $$7 = $$0.h();
         if ($$0.a(cwf.ot)) {
            $$0.a(1, $$4, bva.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awv.c.b($$7));
         return bsd.a;
      }
   }

   @Override
   protected void a(dfb $$0, dvj $$1, ezj $$2, cpg $$3) {
      if (!$$0.C) {
         jh $$4 = $$2.b();
         bue $$5 = $$3.s();
         if ($$3.bZ() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bva ? (bva)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(det $$0) {
      return false;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }
}
