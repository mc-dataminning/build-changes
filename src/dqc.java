import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqc extends dhq implements dll {
   public static final MapCodec<dqc> a = b(dqc::new);
   public static final dwh<dwt> b = dvz.bj;

   @Override
   public MapCodec<dqc> a() {
      return a;
   }

   protected dqc(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwt.b));
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dud($$0, $$1);
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      dsm $$5 = $$1.c_($$2);
      if ($$5 instanceof dud) {
         return (bsd)(((dud)$$5).a($$3) ? bsd.a : bsd.e);
      } else {
         return bsd.e;
      }
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, @Nullable bva $$3, cwb $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dsm $$5 = $$0.c_($$1);
            if ($$5 instanceof dud) {
               ((dud)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if ($$1 instanceof arn) {
         if ($$1.c_($$2) instanceof dud $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((arn)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(arn $$0, dud $$1) {
      switch ($$1.v()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.B();
         case d:
      }
   }
}
