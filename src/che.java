import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class che extends cgy implements bvr, bwa<che.a> {
   private static final akl<String> bY = akp.a(che.class, akn.e);
   private static final int bZ = 1024;
   private static final String ca = "stew_effects";
   @Nullable
   private czc cc;
   @Nullable
   private UUID cd;

   public che(bul<? extends che> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(jh $$0, dfe $$1) {
      return $$1.a_($$0.e()).a(dig.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bul<che> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.a_($$3.e()).a(axa.cb) && a($$1, $$3);
   }

   @Override
   public void a(arn $$0, buz $$1) {
      UUID $$2 = $$1.cH();
      if (!$$2.equals(this.cd)) {
         this.a(this.t() == che.a.a ? che.a.b : che.a.a);
         this.cd = $$2;
         this.a(awl.oN, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bY, che.a.a.d);
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if ($$2.a(cwf.ou) && !this.p_()) {
         boolean $$3 = false;
         cwb $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cwb(cwf.vY);
            $$4.b(ku.R, this.cc);
            this.cc = null;
         } else {
            $$4 = new cwb(cwf.ps);
         }

         cwb $$6 = cwe.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awk $$7;
         if ($$3) {
            $$7 = awl.oQ;
         } else {
            $$7 = awl.oP;
         }

         this.a($$7, 1.0F, 1.0F);
         return bsd.a;
      } else if ($$2.a(cwf.rW) && this.a()) {
         this.a(awm.h, $$2);
         this.a(eag.M, $$0);
         if (!this.dX().C) {
            $$2.a(1, $$0, d($$1));
         }

         return bsd.a;
      } else if (this.t() == che.a.b && $$2.a(axj.O)) {
         if (this.cc != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dX().a(lr.ae, this.dC() + this.af.j() / 2.0, this.e(0.5), this.dI() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }
         } else {
            Optional<czc> $$10 = this.k($$2);
            if ($$10.isEmpty()) {
               return bsd.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dX().a(lr.p, this.dC() + this.af.j() / 2.0, this.e(0.5), this.dI() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }

            this.cc = $$10.get();
            this.a(awl.oO, 2.0F, 1.0F);
         }

         return bsd.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awm $$0, cwb $$1) {
      this.dX().a(null, this, awl.oR, $$0, 1.0F, 1.0F);
      if (!this.dX().y_()) {
         this.a(bul.w, btz.a(this, false, false), $$1x -> {
            ((arn)this.dX()).a(lr.w, this.dC(), this.e(0.5), this.dI(), 1, 0.0, 0.0, 0.0, 0.0);
            this.a(ety.aR, $$1, $$0xx -> {
               for (int $$1xx = 0; $$1xx < $$0xx.L(); $$1xx++) {
                  this.dX().b(new ckv(this.dX(), this.dC(), this.e(1.0), this.dI(), $$0xx.c(1)));
               }
            });
         });
      }
   }

   @Override
   public boolean a() {
      return this.bM() && !this.p_();
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.cc != null) {
         czc.c.encodeStart(uy.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(che.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         czc.c.parse(uy.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<czc> k(cwb $$0) {
      dqg $$1 = dqg.a($$0.h());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(che.a $$0) {
      this.am.a(bY, $$0.d);
   }

   public che.a t() {
      return che.a.a(this.am.a(bY));
   }

   @Nullable
   public che c(arn $$0, btv $$1) {
      che $$2 = bul.as.a($$0, buk.e);
      if ($$2 != null) {
         $$2.a(this.a((che)$$1));
      }

      return $$2;
   }

   private che.a a(che $$0) {
      che.a $$1 = this.t();
      che.a $$2 = $$0.t();
      che.a $$3;
      if ($$1 == $$2 && this.af.a(1024) == 0) {
         $$3 = $$1 == che.a.b ? che.a.a : che.a.b;
      } else {
         $$3 = this.af.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bag {
      a("red", dig.cg.m()),
      b("brown", dig.cf.m());

      public static final bag.a<che.a> c = bag.a(che.a::values);
      final String d;
      private final dvj e;

      private a(final String $$0, final dvj $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dvj a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static che.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
