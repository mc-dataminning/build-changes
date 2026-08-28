import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cfr extends cfl implements buf, buo<cfr.a> {
   private static final ajw<String> cc = aka.a(cfr.class, ajy.e);
   private static final int cd = 1024;
   private static final String ce = "stew_effects";
   @Nullable
   private cxw cg;
   @Nullable
   private UUID ch;

   public cfr(bsx<? extends cfr> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(jd $$0, dcz $$1) {
      return $$1.a_($$0.e()).a(dga.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bsx<cfr> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.a_($$3.e()).a(awe.cb) && a($$1, $$3);
   }

   @Override
   public void a(aqu $$0, btm $$1) {
      UUID $$2 = $$1.cz();
      if (!$$2.equals(this.ch)) {
         this.a(this.t() == cfr.a.a ? cfr.a.b : cfr.a.a);
         this.ch = $$2;
         this.a(avp.oO, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cc, cfr.a.a.d);
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.ot) && !this.o_()) {
         boolean $$3 = false;
         cuq $$4;
         if (this.cg != null) {
            $$3 = true;
            $$4 = new cuq(cut.vX);
            $$4.b(kq.H, this.cg);
            this.cg = null;
         } else {
            $$4 = new cuq(cut.pr);
         }

         cuq $$6 = cus.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avo $$7;
         if ($$3) {
            $$7 = avp.oR;
         } else {
            $$7 = avp.oQ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bqr.a(this.dO().B);
      } else if ($$2.a(cut.rV) && this.a()) {
         this.a(avq.h);
         this.a(dxz.M, $$0);
         if (!this.dO().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqr.a(this.dO().B);
      } else if (this.t() == cfr.a.b && $$2.a(awn.O)) {
         if (this.cg != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dO().a(lm.ae, this.dt() + this.ah.j() / 2.0, this.e(0.5), this.dz() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }
         } else {
            Optional<cxw> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bqr.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dO().a(lm.p, this.dt() + this.ah.j() / 2.0, this.e(0.5), this.dz() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }

            this.cg = $$10.get();
            this.a(avp.oP, 2.0F, 1.0F);
         }

         return bqr.a(this.dO().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avq $$0) {
      this.dO().a(null, this, avp.oS, $$0, 1.0F, 1.0F);
      if (!this.dO().x_()) {
         cfl $$1 = bsx.w.a(this.dO());
         if ($$1 != null) {
            ((aqu)this.dO()).a(lm.w, this.dt(), this.e(0.5), this.dz(), 1, 0.0, 0.0, 0.0, 0.0);
            this.aq();
            $$1.b(this.dt(), this.dv(), this.dz(), this.dE(), this.dG());
            $$1.v(this.ew());
            $$1.aY = this.aY;
            if (this.ai()) {
               $$1.b(this.aj());
               $$1.p(this.cE());
            }

            if (this.fT()) {
               $$1.fR();
            }

            $$1.n(this.cv());
            this.dO().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dO().b(new cjh(this.dO(), this.dt(), this.e(1.0), this.dz(), new cuq(this.t().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bE() && !this.o_();
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.cg != null) {
         cxw.b.encodeStart(up.a, this.cg).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a(cfr.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cxw.b.parse(up.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cg = $$0x);
      }
   }

   private Optional<cxw> n(cuq $$0) {
      dob $$1 = dob.a($$0.g());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cfr.a $$0) {
      this.ao.a(cc, $$0.d);
   }

   public cfr.a t() {
      return cfr.a.a(this.ao.a(cc));
   }

   @Nullable
   public cfr c(aqu $$0, bsl $$1) {
      cfr $$2 = bsx.as.a((dcw)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cfr)$$1));
      }

      return $$2;
   }

   private cfr.a a(cfr $$0) {
      cfr.a $$1 = this.t();
      cfr.a $$2 = $$0.t();
      cfr.a $$3;
      if ($$1 == $$2 && this.ah.a(1024) == 0) {
         $$3 = $$1 == cfr.a.b ? cfr.a.a : cfr.a.b;
      } else {
         $$3 = this.ah.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azk {
      a("red", dga.cg.o()),
      b("brown", dga.cf.o());

      public static final azk.a<cfr.a> c = azk.a(cfr.a::values);
      final String d;
      final dtc e;

      private a(final String $$0, final dtc $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dtc a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cfr.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
