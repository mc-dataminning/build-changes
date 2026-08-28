import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cik extends cie implements bwx, bxg<cik.a> {
   private static final alc<String> bZ = alg.a(cik.class, ale.e);
   private static final int ca = 1024;
   private static final String cb = "stew_effects";
   @Nullable
   private daq cd;
   @Nullable
   private UUID ce;

   public cik(bvr<? extends cik> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(jh $$0, dhl $$1) {
      return $$1.a_($$0.e()).a(dko.fz) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bvr<cik> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.cc) && a($$1, $$3);
   }

   @Override
   public void a(ash $$0, bwf $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.ce)) {
         this.a(this.t() == cik.a.a ? cik.a.b : cik.a.a);
         this.ce = $$2;
         this.a(axf.pg, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bZ, cik.a.a.d);
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if ($$2.a(cxt.oP) && !this.e_()) {
         boolean $$3 = false;
         cxp $$4;
         if (this.cd != null) {
            $$3 = true;
            $$4 = new cxp(cxt.wM);
            $$4.b(ku.R, this.cd);
            this.cd = null;
         } else {
            $$4 = new cxp(cxt.pN);
         }

         cxp $$6 = cxs.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         axe $$7;
         if ($$3) {
            $$7 = axf.pj;
         } else {
            $$7 = axf.pi;
         }

         this.a($$7, 1.0F, 1.0F);
         return btj.a;
      } else if ($$2.a(cxt.sJ) && this.a()) {
         if (this.dW() instanceof ash $$9) {
            this.a($$9, axg.h, $$2);
            this.a(ecr.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return btj.a;
      } else if (this.t() == cik.a.b && $$2.a(ayd.P)) {
         if (this.cd != null) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               this.dW().a(ls.af, this.dB() + this.ae.j() / 2.0, this.e(0.5), this.dH() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
            }
         } else {
            Optional<daq> $$11 = this.i($$2);
            if ($$11.isEmpty()) {
               return btj.e;
            }

            $$2.a(1, $$0);

            for (int $$12 = 0; $$12 < 4; $$12++) {
               this.dW().a(ls.p, this.dB() + this.ae.j() / 2.0, this.e(0.5), this.dH() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
            }

            this.cd = $$11.get();
            this.a(axf.ph, 2.0F, 1.0F);
         }

         return btj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ash $$0, axg $$1, cxp $$2) {
      $$0.a(null, this, axf.pk, $$1, 1.0F, 1.0F);
      this.a(bvr.C, bvf.a(this, false, false), $$2x -> {
         $$0.a(ls.w, this.dB(), this.e(0.5), this.dH(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, ewl.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.L(); $$2xx++) {
               $$0xx.b(new cmb(this.dW(), this.dB(), this.e(1.0), this.dH(), $$1xx.c(1)));
            }
         });
      });
   }

   @Override
   public boolean a() {
      return this.bL() && !this.e_();
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.cd != null) {
         daq.c.encodeStart(vl.a, this.cd).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cik.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         daq.c.parse(vl.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cd = $$0x);
      }
   }

   private Optional<daq> i(cxp $$0) {
      dsr $$1 = dsr.a($$0.h());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cik.a $$0) {
      this.al.a(bZ, $$0.d);
   }

   public cik.a t() {
      return cik.a.a(this.al.a(bZ));
   }

   @Nullable
   public cik c(ash $$0, bvb $$1) {
      cik $$2 = bvr.aF.a($$0, bvq.e);
      if ($$2 != null) {
         $$2.a(this.a((cik)$$1));
      }

      return $$2;
   }

   private cik.a a(cik $$0) {
      cik.a $$1 = this.t();
      cik.a $$2 = $$0.t();
      cik.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == cik.a.b ? cik.a.a : cik.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bba {
      a("red", dko.cn.m()),
      b("brown", dko.cm.m());

      public static final bba.a<cik.a> c = bba.a(cik.a::values);
      final String d;
      private final dxv e;

      private a(final String $$0, final dxv $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dxv a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cik.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
