import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cif extends chz implements bws, bxb<cif.a> {
   private static final alc<String> bZ = alg.a(cif.class, ale.e);
   private static final int ca = 1024;
   private static final String cb = "stew_effects";
   @Nullable
   private dal cd;
   @Nullable
   private UUID ce;

   public cif(bvm<? extends cif> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(jh $$0, dhd $$1) {
      return $$1.a_($$0.e()).a(dkg.fz) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bvm<cif> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.cc) && a($$1, $$3);
   }

   @Override
   public void a(ash $$0, bwa $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.ce)) {
         this.a(this.t() == cif.a.a ? cif.a.b : cif.a.a);
         this.ce = $$2;
         this.a(axf.pf, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bZ, cif.a.a.d);
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if ($$2.a(cxo.oP) && !this.e_()) {
         boolean $$3 = false;
         cxk $$4;
         if (this.cd != null) {
            $$3 = true;
            $$4 = new cxk(cxo.wM);
            $$4.b(ku.R, this.cd);
            this.cd = null;
         } else {
            $$4 = new cxk(cxo.pN);
         }

         cxk $$6 = cxn.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         axe $$7;
         if ($$3) {
            $$7 = axf.pi;
         } else {
            $$7 = axf.ph;
         }

         this.a($$7, 1.0F, 1.0F);
         return bte.a;
      } else if ($$2.a(cxo.sJ) && this.a()) {
         if (this.dV() instanceof ash $$9) {
            this.a($$9, axg.h, $$2);
            this.a(ecj.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bte.a;
      } else if (this.t() == cif.a.b && $$2.a(ayd.P)) {
         if (this.cd != null) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               this.dV().a(ls.af, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
            }
         } else {
            Optional<dal> $$11 = this.i($$2);
            if ($$11.isEmpty()) {
               return bte.e;
            }

            $$2.a(1, $$0);

            for (int $$12 = 0; $$12 < 4; $$12++) {
               this.dV().a(ls.p, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
            }

            this.cd = $$11.get();
            this.a(axf.pg, 2.0F, 1.0F);
         }

         return bte.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ash $$0, axg $$1, cxk $$2) {
      $$0.a(null, this, axf.pj, $$1, 1.0F, 1.0F);
      this.a(bvm.C, bva.a(this, false, false), $$2x -> {
         $$0.a(ls.w, this.dA(), this.e(0.5), this.dG(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, ewd.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.L(); $$2xx++) {
               $$0xx.b(new clw(this.dV(), this.dA(), this.e(1.0), this.dG(), $$1xx.c(1)));
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
         dal.c.encodeStart(vl.a, this.cd).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cif.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dal.c.parse(vl.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cd = $$0x);
      }
   }

   private Optional<dal> i(cxk $$0) {
      dsj $$1 = dsj.a($$0.h());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cif.a $$0) {
      this.al.a(bZ, $$0.d);
   }

   public cif.a t() {
      return cif.a.a(this.al.a(bZ));
   }

   @Nullable
   public cif c(ash $$0, buw $$1) {
      cif $$2 = bvm.aF.a($$0, bvl.e);
      if ($$2 != null) {
         $$2.a(this.a((cif)$$1));
      }

      return $$2;
   }

   private cif.a a(cif $$0) {
      cif.a $$1 = this.t();
      cif.a $$2 = $$0.t();
      cif.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == cif.a.b ? cif.a.a : cif.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bba {
      a("red", dkg.cn.m()),
      b("brown", dkg.cm.m());

      public static final bba.a<cif.a> c = bba.a(cif.a::values);
      final String d;
      private final dxn e;

      private a(final String $$0, final dxn $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dxn a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cif.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
