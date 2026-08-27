import java.util.List;
import java.util.UUID;
import org.joml.Vector3f;

public class cbb extends cef implements cap {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bln e = new bln(b, "Drinking speed penalty", -0.25, bln.a.a);
   private static final afc<Boolean> bT = aff.a(cbb.class, afe.k);
   private int bU;
   private bsz<cef> bV;
   private bsy<ccx> bW;

   public cbb(bjx<? extends cbb> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bV = new bsz<>(this, cef.class, true, $$0 -> $$0 != null && this.gt() && $$0.ag() != bjx.bj);
      this.bW = new bsy<>(this, ccx.class, 10, true, false, null);
      this.bO.a(1, new bqy(this));
      this.bO.a(2, new bsd(this, 1.0, 60, 10.0F));
      this.bO.a(2, new bsr(this, 1.0));
      this.bO.a(3, new brm(this, ccx.class, 8.0F));
      this.bO.a(3, new brz(this));
      this.bP.a(1, new bsw(this, cef.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void b_() {
      super.b_();
      this.al().a(bT, false);
   }

   @Override
   protected aqc w() {
      return aqd.Ag;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.Ak;
   }

   @Override
   protected aqc m_() {
      return aqd.Ai;
   }

   public void y(boolean $$0) {
      this.al().b(bT, $$0);
   }

   public boolean s() {
      return this.al().b(bT);
   }

   public static blo.a t() {
      return cal.gk().a(blp.l, 26.0).a(blp.m, 0.25);
   }

   @Override
   public void c_() {
      if (!this.dL().B && this.bv()) {
         this.bV.k();
         if (this.bV.i() <= 0) {
            this.bW.a(true);
         } else {
            this.bW.a(false);
         }

         if (this.s()) {
            if (this.bU-- <= 0) {
               this.y(false);
               ckj $$0 = this.eS();
               this.a(bjy.a, ckj.b);
               if ($$0.a(ckm.rv)) {
                  List<bjg> $$1 = cmi.a($$0);
                  if ($$1 != null) {
                     for (bjg $$2 : $$1) {
                        this.b(new bjg($$2));
                     }
                  }
               }

               this.a(dkl.l);
               this.a(blp.m).b(e.a());
            }
         } else {
            cmg $$3 = null;
            if (this.ag.i() < 0.15F && this.a(aqx.a) && !this.a(bji.m)) {
               $$3 = cmj.y;
            } else if (this.ag.i() < 0.15F && (this.bM() || this.ew() != null && this.ew().a(aqu.i)) && !this.a(bji.l)) {
               $$3 = cmj.n;
            } else if (this.ag.i() < 0.05F && this.eu() < this.eL()) {
               $$3 = cmj.A;
            } else if (this.ag.i() < 0.5F && this.q() != null && !this.a(bji.a) && this.q().f(this) > 121.0) {
               $$3 = cmj.p;
            }

            if ($$3 != null) {
               this.a(bjy.a, cmi.a(new ckj(ckm.rv), $$3));
               this.bU = this.eS().r();
               this.y(true);
               if (!this.aS()) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), aqd.Aj, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bll $$4 = this.a(blp.m);
               $$4.b(e.a());
               $$4.b(e);
            }
         }

         if (this.ag.i() < 7.5E-4F) {
            this.dL().a(this, (byte)15);
         }
      }

      super.c_();
   }

   @Override
   public aqc ad_() {
      return aqd.Ah;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dL().a(js.ah, this.dq() + this.ag.k() * 0.13F, this.cG().e + 0.5 + this.ag.k() * 0.13F, this.dw() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bir $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(aqu.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bkj $$0, float $$1) {
      if (!this.s()) {
         eif $$2 = $$0.do();
         double $$3 = $$0.dq() + $$2.c - this.dq();
         double $$4 = $$0.du() - 1.1F - this.ds();
         double $$5 = $$0.dw() + $$2.e - this.dw();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         cmg $$7 = cmj.C;
         if ($$0 instanceof cef) {
            if ($$0.eu() <= 4.0F) {
               $$7 = cmj.A;
            } else {
               $$7 = cmj.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bji.b)) {
            $$7 = cmj.s;
         } else if ($$0.eu() >= 8.0F && !$$0.a(bji.s)) {
            $$7 = cmj.E;
         } else if ($$6 <= 3.0 && !$$0.a(bji.r) && this.ag.i() < 0.25F) {
            $$7 = cmj.N;
         }

         cea $$8 = new cea(this.dL(), this);
         $$8.a(cmi.a(new ckj(ckm.uu), $$7));
         $$8.s($$8.dD() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aS()) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), aqd.Al, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dL().b($$8);
      }
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return 1.62F;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.3125F * $$2, 0.0F);
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gf() {
      return false;
   }
}
