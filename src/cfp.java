import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cfp extends cfj implements bud, bum<cfp.a> {
   private static final ajv<String> ca = ajz.a(cfp.class, ajx.e);
   private static final int cb = 1024;
   private static final String cc = "stew_effects";
   @Nullable
   private cxu ce;
   @Nullable
   private UUID cf;

   public cfp(bsw<? extends cfp> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(jd $$0, dcx $$1) {
      return $$1.a_($$0.d()).a(dfy.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bsw<cfp> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.a_($$3.d()).a(awd.ca) && a($$1, $$3);
   }

   @Override
   public void a(aqt $$0, btk $$1) {
      UUID $$2 = $$1.cA();
      if (!$$2.equals(this.cf)) {
         this.a(this.t() == cfp.a.a ? cfp.a.b : cfp.a.a);
         this.cf = $$2;
         this.a(avo.oO, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ca, cfp.a.a.d);
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.ot) && !this.o_()) {
         boolean $$3 = false;
         cuo $$4;
         if (this.ce != null) {
            $$3 = true;
            $$4 = new cuo(cur.vX);
            $$4.b(kq.H, this.ce);
            this.ce = null;
         } else {
            $$4 = new cuo(cur.pr);
         }

         cuo $$6 = cuq.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avn $$7;
         if ($$3) {
            $$7 = avo.oR;
         } else {
            $$7 = avo.oQ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bqq.a(this.dQ().B);
      } else if ($$2.a(cur.rV) && this.a()) {
         this.a(avp.h);
         this.a(dxw.M, $$0);
         if (!this.dQ().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqq.a(this.dQ().B);
      } else if (this.t() == cfp.a.b && $$2.a(awm.O)) {
         if (this.ce != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dQ().a(lm.ae, this.dv() + this.ah.j() / 2.0, this.e(0.5), this.dB() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }
         } else {
            Optional<cxu> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bqq.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dQ().a(lm.p, this.dv() + this.ah.j() / 2.0, this.e(0.5), this.dB() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }

            this.ce = $$10.get();
            this.a(avo.oP, 2.0F, 1.0F);
         }

         return bqq.a(this.dQ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avp $$0) {
      this.dQ().a(null, this, avo.oS, $$0, 1.0F, 1.0F);
      if (!this.dQ().x_()) {
         cfj $$1 = bsw.w.a(this.dQ());
         if ($$1 != null) {
            ((aqt)this.dQ()).a(lm.w, this.dv(), this.e(0.5), this.dB(), 1, 0.0, 0.0, 0.0, 0.0);
            this.aq();
            $$1.b(this.dv(), this.dx(), this.dB(), this.dG(), this.dI());
            $$1.u(this.ex());
            $$1.aY = this.aY;
            if (this.ai()) {
               $$1.b(this.aj());
               $$1.p(this.cF());
            }

            if (this.fR()) {
               $$1.fP();
            }

            $$1.o(this.cv());
            this.dQ().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dQ().b(new cjf(this.dQ(), this.dv(), this.e(1.0), this.dB(), new cuo(this.t().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bE() && !this.o_();
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.ce != null) {
         cxu.b.encodeStart(uo.a, this.ce).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(cfp.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cxu.b.parse(uo.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.ce = $$0x);
      }
   }

   private Optional<cxu> n(cuo $$0) {
      dnz $$1 = dnz.a($$0.g());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cfp.a $$0) {
      this.ao.a(ca, $$0.d);
   }

   public cfp.a t() {
      return cfp.a.a(this.ao.a(ca));
   }

   @Nullable
   public cfp c(aqt $$0, bsk $$1) {
      cfp $$2 = bsw.as.a((dcu)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cfp)$$1));
      }

      return $$2;
   }

   private cfp.a a(cfp $$0) {
      cfp.a $$1 = this.t();
      cfp.a $$2 = $$0.t();
      cfp.a $$3;
      if ($$1 == $$2 && this.ah.a(1024) == 0) {
         $$3 = $$1 == cfp.a.b ? cfp.a.a : cfp.a.b;
      } else {
         $$3 = this.ah.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azj {
      a("red", dfy.cg.o()),
      b("brown", dfy.cf.o());

      public static final azj.a<cfp.a> c = azj.a(cfp.a::values);
      final String d;
      final dta e;

      private a(final String $$0, final dta $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dta a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cfp.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
