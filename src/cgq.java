import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cgq extends cgk implements bvd, bvm<cgq.a> {
   private static final akh<String> bY = akl.a(cgq.class, akj.e);
   private static final int bZ = 1024;
   private static final String ca = "stew_effects";
   @Nullable
   private cyx cc;
   @Nullable
   private UUID cd;

   public cgq(bty<? extends cgq> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(jf $$0, dem $$1) {
      return $$1.a_($$0.e()).a(dho.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bty<cgq> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.a_($$3.e()).a(awv.cb) && a($$1, $$3);
   }

   @Override
   public void a(arj $$0, bum $$1) {
      UUID $$2 = $$1.cD();
      if (!$$2.equals(this.cd)) {
         this.a(this.t() == cgq.a.a ? cgq.a.b : cgq.a.a);
         this.cd = $$2;
         this.a(awg.oP, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bY, cgq.a.a.d);
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if ($$2.a(cvw.ou) && !this.p_()) {
         boolean $$3 = false;
         cvs $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cvs(cvw.vY);
            $$4.b(ks.M, this.cc);
            this.cc = null;
         } else {
            $$4 = new cvs(cvw.ps);
         }

         cvs $$6 = cvv.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awf $$7;
         if ($$3) {
            $$7 = awg.oS;
         } else {
            $$7 = awg.oR;
         }

         this.a($$7, 1.0F, 1.0F);
         return brs.a;
      } else if ($$2.a(cvw.rW) && this.a()) {
         this.a(awh.h);
         this.a(dzp.M, $$0);
         if (!this.dS().B) {
            $$2.a(1, $$0, d($$1));
         }

         return brs.a;
      } else if (this.t() == cgq.a.b && $$2.a(axe.O)) {
         if (this.cc != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dS().a(lo.ae, this.dx() + this.af.j() / 2.0, this.e(0.5), this.dD() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }
         } else {
            Optional<cyx> $$10 = this.m($$2);
            if ($$10.isEmpty()) {
               return brs.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dS().a(lo.p, this.dx() + this.af.j() / 2.0, this.e(0.5), this.dD() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }

            this.cc = $$10.get();
            this.a(awg.oQ, 2.0F, 1.0F);
         }

         return brs.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awh $$0) {
      this.dS().a(null, this, awg.oT, $$0, 1.0F, 1.0F);
      if (!this.dS().x_()) {
         cgk $$1 = bty.w.a(this.dS(), btx.i);
         if ($$1 != null) {
            ((arj)this.dS()).a(lo.w, this.dx(), this.e(0.5), this.dD(), 1, 0.0, 0.0, 0.0, 0.0);
            this.as();
            $$1.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
            $$1.x(this.eB());
            $$1.aT = this.aT;
            if (this.ak()) {
               $$1.b(this.al());
               $$1.p(this.cI());
            }

            if (this.fX()) {
               $$1.fW();
            }

            $$1.n(this.cz());
            this.dS().b($$1);
            this.a(eth.aN, $$0x -> {
               for (int $$1x = 0; $$1x < $$0x.K(); $$1x++) {
                  this.dS().b(new ckh(this.dS(), this.dx(), this.e(1.0), this.dD(), $$0x.c(1)));
               }
            });
         }
      }
   }

   @Override
   public boolean a() {
      return this.bI() && !this.p_();
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.cc != null) {
         cyx.c.encodeStart(uu.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a(cgq.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cyx.c.parse(uu.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<cyx> m(cvs $$0) {
      dpp $$1 = dpp.a($$0.h());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cgq.a $$0) {
      this.am.a(bY, $$0.d);
   }

   public cgq.a t() {
      return cgq.a.a(this.am.a(bY));
   }

   @Nullable
   public cgq c(arj $$0, btk $$1) {
      cgq $$2 = bty.as.a($$0, btx.e);
      if ($$2 != null) {
         $$2.a(this.a((cgq)$$1));
      }

      return $$2;
   }

   private cgq.a a(cgq $$0) {
      cgq.a $$1 = this.t();
      cgq.a $$2 = $$0.t();
      cgq.a $$3;
      if ($$1 == $$2 && this.af.a(1024) == 0) {
         $$3 = $$1 == cgq.a.b ? cgq.a.a : cgq.a.b;
      } else {
         $$3 = this.af.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bab {
      a("red", dho.cg.n()),
      b("brown", dho.cf.n());

      public static final bab.a<cgq.a> c = bab.a(cgq.a::values);
      final String d;
      private final dus e;

      private a(final String $$0, final dus $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dus a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cgq.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
