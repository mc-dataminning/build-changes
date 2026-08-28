import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cij extends cid implements bww, bxf<cij.a> {
   private static final alc<String> bZ = alg.a(cij.class, ale.e);
   private static final int ca = 1024;
   private static final String cb = "stew_effects";
   @Nullable
   private dap cd;
   @Nullable
   private UUID ce;

   public cij(bvq<? extends cij> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(jh $$0, dhk $$1) {
      return $$1.a_($$0.e()).a(dkn.fz) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bvq<cij> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.cc) && a($$1, $$3);
   }

   @Override
   public void a(ash $$0, bwe $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.ce)) {
         this.a(this.t() == cij.a.a ? cij.a.b : cij.a.a);
         this.ce = $$2;
         this.a(axf.pg, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bZ, cij.a.a.d);
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      if ($$2.a(cxs.oP) && !this.e_()) {
         boolean $$3 = false;
         cxo $$4;
         if (this.cd != null) {
            $$3 = true;
            $$4 = new cxo(cxs.wM);
            $$4.b(ku.R, this.cd);
            this.cd = null;
         } else {
            $$4 = new cxo(cxs.pN);
         }

         cxo $$6 = cxr.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         axe $$7;
         if ($$3) {
            $$7 = axf.pj;
         } else {
            $$7 = axf.pi;
         }

         this.a($$7, 1.0F, 1.0F);
         return bti.a;
      } else if ($$2.a(cxs.sJ) && this.a()) {
         if (this.dV() instanceof ash $$9) {
            this.a($$9, axg.h, $$2);
            this.a(ecq.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bti.a;
      } else if (this.t() == cij.a.b && $$2.a(ayd.P)) {
         if (this.cd != null) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               this.dV().a(ls.af, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
            }
         } else {
            Optional<dap> $$11 = this.i($$2);
            if ($$11.isEmpty()) {
               return bti.e;
            }

            $$2.a(1, $$0);

            for (int $$12 = 0; $$12 < 4; $$12++) {
               this.dV().a(ls.p, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
            }

            this.cd = $$11.get();
            this.a(axf.ph, 2.0F, 1.0F);
         }

         return bti.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ash $$0, axg $$1, cxo $$2) {
      $$0.a(null, this, axf.pk, $$1, 1.0F, 1.0F);
      this.a(bvq.C, bve.a(this, false, false), $$2x -> {
         $$0.a(ls.w, this.dA(), this.e(0.5), this.dG(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, ewk.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.L(); $$2xx++) {
               $$0xx.b(new cma(this.dV(), this.dA(), this.e(1.0), this.dG(), $$1xx.c(1)));
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
         dap.c.encodeStart(vl.a, this.cd).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cij.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dap.c.parse(vl.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cd = $$0x);
      }
   }

   private Optional<dap> i(cxo $$0) {
      dsq $$1 = dsq.a($$0.h());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cij.a $$0) {
      this.al.a(bZ, $$0.d);
   }

   public cij.a t() {
      return cij.a.a(this.al.a(bZ));
   }

   @Nullable
   public cij c(ash $$0, bva $$1) {
      cij $$2 = bvq.aF.a($$0, bvp.e);
      if ($$2 != null) {
         $$2.a(this.a((cij)$$1));
      }

      return $$2;
   }

   private cij.a a(cij $$0) {
      cij.a $$1 = this.t();
      cij.a $$2 = $$0.t();
      cij.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == cij.a.b ? cij.a.a : cij.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bba {
      a("red", dkn.cn.m()),
      b("brown", dkn.cm.m());

      public static final bba.a<cij.a> c = bba.a(cij.a::values);
      final String d;
      private final dxu e;

      private a(final String $$0, final dxu $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dxu a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cij.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
