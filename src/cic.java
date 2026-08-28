import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cic extends chw implements bwp, bwy<cic.a> {
   private static final ajx<String> bF = akb.a(cic.class, ajz.e);
   private static final int bG = 1024;
   private static final String bH = "stew_effects";
   @Nullable
   private dag bJ;
   @Nullable
   private UUID bK;

   public cic(bvi<? extends cic> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ji $$0, dhc $$1) {
      return $$1.a_($$0.e()).a(dkg.fA) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bvi<cic> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cd) && a($$1, $$3);
   }

   @Override
   public void a(ard $$0, bvx $$1) {
      UUID $$2 = $$1.cF();
      if (!$$2.equals(this.bK)) {
         this.a(this.t() == cic.a.a ? cic.a.b : cic.a.a);
         this.bK = $$2;
         this.a(awa.pw, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bF, cic.a.a.d);
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if ($$2.a(cxl.pa) && !this.n_()) {
         boolean $$3 = false;
         cxh $$4;
         if (this.bJ != null) {
            $$3 = true;
            $$4 = new cxh(cxl.wY);
            $$4.b(kv.T, this.bJ);
            this.bJ = null;
         } else {
            $$4 = new cxh(cxl.pY);
         }

         cxh $$6 = cxk.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avz $$7;
         if ($$3) {
            $$7 = awa.pz;
         } else {
            $$7 = awa.py;
         }

         this.a($$7, 1.0F, 1.0F);
         return bsy.a;
      } else if ($$2.a(cxl.sU) && this.a()) {
         if (this.dU() instanceof ard $$9) {
            this.a($$9, awb.h, $$2);
            this.a(ecp.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsy.a;
      } else if (this.t() == cic.a.b) {
         Optional<dag> $$10 = this.i($$2);
         if ($$10.isEmpty()) {
            return super.b($$0, $$1);
         } else {
            if (this.bJ != null) {
               for (int $$11 = 0; $$11 < 2; $$11++) {
                  this.dU().a(lt.ah, this.dz() + this.ae.j() / 2.0, this.e(0.5), this.dF() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }
            } else {
               $$2.a(1, $$0);

               for (int $$12 = 0; $$12 < 4; $$12++) {
                  this.dU().a(lt.p, this.dz() + this.ae.j() / 2.0, this.e(0.5), this.dF() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }

               this.bJ = $$10.get();
               this.a(awa.px, 2.0F, 1.0F);
            }

            return bsy.a;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ard $$0, awb $$1, cxh $$2) {
      $$0.a(null, this, awa.pA, $$1, 1.0F, 1.0F);
      this.a(bvi.C, buu.a(this, false, false), $$2x -> {
         $$0.a(lt.w, this.dz(), this.e(0.5), this.dF(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, ewk.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new clw(this.dU(), this.dz(), this.e(1.0), this.dF(), $$1xx.c(1)));
            }
         });
      });
   }

   @Override
   public boolean a() {
      return this.bJ() && !this.n_();
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.bJ != null) {
         dag.c.encodeStart(ue.a, this.bJ).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(cic.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dag.c.parse(ue.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.bJ = $$0x);
      }
   }

   private Optional<dag> i(cxh $$0) {
      dsm $$1 = dsm.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   public void a(cic.a $$0) {
      this.al.a(bF, $$0.d);
   }

   public cic.a t() {
      return cic.a.a(this.al.a(bF));
   }

   @Nullable
   public cic c(ard $$0, buq $$1) {
      cic $$2 = bvi.aE.a($$0, bvh.e);
      if ($$2 != null) {
         $$2.a(this.a((cic)$$1));
      }

      return $$2;
   }

   private cic.a a(cic $$0) {
      cic.a $$1 = this.t();
      cic.a $$2 = $$0.t();
      cic.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == cic.a.b ? cic.a.a : cic.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azv {
      a("red", dkg.cn.m()),
      b("brown", dkg.cm.m());

      public static final azv.a<cic.a> c = azv.a(cic.a::values);
      final String d;
      private final dxq e;

      private a(final String $$0, final dxq $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dxq a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cic.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
