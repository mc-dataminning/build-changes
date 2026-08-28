import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnm extends die {
   public static final MapCodec<dnm> a = b(dnm::new);
   public static final dwh<dwk> b = dvz.bf;
   public static final dwa c = dvz.w;
   public static final dwj d = dvz.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dnm> a() {
      return a;
   }

   public dnm(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwk.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dvj b(dfc $$0, jh $$1, dvj $$2) {
      dwk $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dwk $$4 = $$0.a_($$1.e()).E();
         dwk $$5 = $$4.e() ? dwk.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dvj a(czs $$0) {
      return this.b($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      boolean $$6 = $$1.o() == jm.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bue $$0, dvj $$1, dfb $$2, jh $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, eag.H, $$3);
      }
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      return (bsd)($$0.a(axj.bw) && $$6.c() == jm.b ? bsd.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awv.ag);
      }

      return bsd.a;
   }

   @Override
   protected void a_(dvj $$0, dfb $$1, jh $$2, com $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awv.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dvj $$0, dfb $$1, jh $$2, int $$3, int $$4) {
      dwk $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lr.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jq<awk> $$10;
      if ($$5.d()) {
         ali $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jq.a(awk.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awm.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private ali a(dfb $$0, jh $$1) {
      return $$0.c_($$1.d()) instanceof dua $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c, d);
   }
}
