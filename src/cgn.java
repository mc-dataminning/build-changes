import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cgn extends cgh implements bva, bvj<cgn.a> {
   private static final akg<String> bY = akk.a(cgn.class, aki.e);
   private static final int bZ = 1024;
   private static final String ca = "stew_effects";
   @Nullable
   private cyu cc;
   @Nullable
   private UUID cd;

   public cgn(btv<? extends cgn> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(je $$0, dej $$1) {
      return $$1.a_($$0.e()).a(dhl.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(btv<cgn> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$1.a_($$3.e()).a(awt.cb) && a($$1, $$3);
   }

   @Override
   public void a(arh $$0, buj $$1) {
      UUID $$2 = $$1.cD();
      if (!$$2.equals(this.cd)) {
         this.a(this.t() == cgn.a.a ? cgn.a.b : cgn.a.a);
         this.cd = $$2;
         this.a(awe.oP, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bY, cgn.a.a.d);
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if ($$2.a(cvt.ou) && !this.o_()) {
         boolean $$3 = false;
         cvp $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cvp(cvt.vY);
            $$4.b(kr.M, this.cc);
            this.cc = null;
         } else {
            $$4 = new cvp(cvt.ps);
         }

         cvp $$6 = cvs.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awd $$7;
         if ($$3) {
            $$7 = awe.oS;
         } else {
            $$7 = awe.oR;
         }

         this.a($$7, 1.0F, 1.0F);
         return brp.a;
      } else if ($$2.a(cvt.rW) && this.a()) {
         this.a(awf.h);
         this.a(dzl.M, $$0);
         if (!this.dS().B) {
            $$2.a(1, $$0, d($$1));
         }

         return brp.a;
      } else if (this.t() == cgn.a.b && $$2.a(axc.O)) {
         if (this.cc != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dS().a(ln.ae, this.dx() + this.af.j() / 2.0, this.e(0.5), this.dD() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }
         } else {
            Optional<cyu> $$10 = this.m($$2);
            if ($$10.isEmpty()) {
               return brp.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dS().a(ln.p, this.dx() + this.af.j() / 2.0, this.e(0.5), this.dD() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }

            this.cc = $$10.get();
            this.a(awe.oQ, 2.0F, 1.0F);
         }

         return brp.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awf $$0) {
      this.dS().a(null, this, awe.oT, $$0, 1.0F, 1.0F);
      if (!this.dS().w_()) {
         cgh $$1 = btv.w.a(this.dS(), btu.i);
         if ($$1 != null) {
            ((arh)this.dS()).a(ln.w, this.dx(), this.e(0.5), this.dD(), 1, 0.0, 0.0, 0.0, 0.0);
            this.as();
            $$1.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
            $$1.x(this.eA());
            $$1.aT = this.aT;
            if (this.ak()) {
               $$1.b(this.al());
               $$1.p(this.cI());
            }

            if (this.fY()) {
               $$1.fW();
            }

            $$1.n(this.cz());
            this.dS().b($$1);
            this.a(this.t().b(), $$0x -> {
               for (int $$1x = 0; $$1x < $$0x.J(); $$1x++) {
                  this.dS().b(new cke(this.dS(), this.dx(), this.e(1.0), this.dD(), $$0x.c(1)));
               }
            });
         }
      }
   }

   @Override
   public boolean a() {
      return this.bI() && !this.o_();
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.cc != null) {
         cyu.c.encodeStart(ut.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(cgn.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cyu.c.parse(ut.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<cyu> m(cvp $$0) {
      dpm $$1 = dpm.a($$0.h());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cgn.a $$0) {
      this.am.a(bY, $$0.d);
   }

   public cgn.a t() {
      return cgn.a.a(this.am.a(bY));
   }

   @Nullable
   public cgn c(arh $$0, bth $$1) {
      cgn $$2 = btv.as.a($$0, btu.e);
      if ($$2 != null) {
         $$2.a(this.a((cgn)$$1));
      }

      return $$2;
   }

   private cgn.a a(cgn $$0) {
      cgn.a $$1 = this.t();
      cgn.a $$2 = $$0.t();
      cgn.a $$3;
      if ($$1 == $$2 && this.af.a(1024) == 0) {
         $$3 = $$1 == cgn.a.b ? cgn.a.a : cgn.a.b;
      } else {
         $$3 = this.af.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azz {
      a("red", dhl.cg.o(), etd.aP),
      b("brown", dhl.cf.o(), etd.aQ);

      public static final azz.a<cgn.a> c = azz.a(cgn.a::values);
      final String d;
      private final duo e;
      private final alb<etm> f;

      private a(final String $$0, final duo $$1, final alb<etm> $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public duo a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      public alb<etm> b() {
         return this.f;
      }

      static cgn.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
