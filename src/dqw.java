import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqw extends die {
   public static final MapCodec<dqw> a = b(dqw::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final fah g = die.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final fah h = die.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dwj e = dvz.aE;
   public static final dwj f = dvz.aD;

   @Override
   public MapCodec<dqw> a() {
      return a;
   }

   public dqw(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, bue $$3) {
      if (!$$3.cf()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfb $$0, dvj $$1, jh $$2, bue $$3, float $$4) {
      if (!($$3 instanceof cmk)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dfb $$0, dvj $$1, jh $$2, bue $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.C && $$0.A.a($$4) == 0 && $$1.a(dig.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dfb $$0, jh $$1, dvj $$2) {
      $$0.a(null, $$1, awl.Am, awm.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(eag.f, $$1, eag.a.a($$2));
         $$0.c(2001, $$1, die.j($$2));
      }
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, awl.An, awm.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(eag.c, $$2, eag.a.a($$0));
         } else {
            $$1.a(null, $$2, awl.Ao, awm.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(eag.f, $$2, eag.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, die.j($$0));
               chs $$6 = bul.bh.a($$1, buk.e);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.h($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(deg $$0, jh $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(deg $$0, jh $$1) {
      return $$0.a_($$1).a(axa.I);
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dfb $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(dfb $$0, com $$1, jh $$2, dvj $$3, @Nullable dsm $$4, cwb $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dvj $$0, czs $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dvj $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dfb $$0, bue $$1) {
      if ($$1 instanceof chs || $$1 instanceof cgl) {
         return false;
      } else {
         return !($$1 instanceof bva) ? false : $$1 instanceof com || $$0.ac().b(dex.c);
      }
   }
}
