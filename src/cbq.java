import java.util.List;
import java.util.UUID;
import org.joml.Vector3f;

public class cbq extends ceu implements cbe {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bmc e = new bmc(b, "Drinking speed penalty", -0.25, bmc.a.a);
   private static final afm<Boolean> bT = afp.a(cbq.class, afo.k);
   private int bU;
   private bto<ceu> bV;
   private btn<cdm> bW;

   public cbq(bkm<? extends cbq> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bV = new bto<>(this, ceu.class, true, $$0 -> $$0 != null && this.gt() && $$0.ag() != bkm.bj);
      this.bW = new btn<>(this, cdm.class, 10, true, false, null);
      this.bO.a(1, new brn(this));
      this.bO.a(2, new bss(this, 1.0, 60, 10.0F));
      this.bO.a(2, new btg(this, 1.0));
      this.bO.a(3, new bsb(this, cdm.class, 8.0F));
      this.bO.a(3, new bso(this));
      this.bP.a(1, new btl(this, ceu.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void b_() {
      super.b_();
      this.al().a(bT, false);
   }

   @Override
   protected aqm w() {
      return aqn.Ai;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.Am;
   }

   @Override
   protected aqm m_() {
      return aqn.Ak;
   }

   public void y(boolean $$0) {
      this.al().b(bT, $$0);
   }

   public boolean s() {
      return this.al().b(bT);
   }

   public static bmd.a t() {
      return cba.gk().a(bme.l, 26.0).a(bme.m, 0.25);
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
               clb $$0 = this.eS();
               this.a(bkn.a, clb.b);
               if ($$0.a(cle.rw)) {
                  List<bjv> $$1 = cna.a($$0);
                  if ($$1 != null) {
                     for (bjv $$2 : $$1) {
                        this.b(new bjv($$2));
                     }
                  }
               }

               this.a(dlg.l);
               this.a(bme.m).b(e.a());
            }
         } else {
            cmy $$3 = null;
            if (this.ag.i() < 0.15F && this.a(arh.a) && !this.a(bjx.m)) {
               $$3 = cnb.y;
            } else if (this.ag.i() < 0.15F && (this.bM() || this.ew() != null && this.ew().a(are.i)) && !this.a(bjx.l)) {
               $$3 = cnb.n;
            } else if (this.ag.i() < 0.05F && this.eu() < this.eL()) {
               $$3 = cnb.A;
            } else if (this.ag.i() < 0.5F && this.q() != null && !this.a(bjx.a) && this.q().f(this) > 121.0) {
               $$3 = cnb.p;
            }

            if ($$3 != null) {
               this.a(bkn.a, cna.a(new clb(cle.rw), $$3));
               this.bU = this.eS().r();
               this.y(true);
               if (!this.aS()) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), aqn.Al, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bma $$4 = this.a(bme.m);
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
   public aqm ad_() {
      return aqn.Aj;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dL().a(js.ai, this.dq() + this.ag.k() * 0.13F, this.cG().e + 0.5 + this.ag.k() * 0.13F, this.dw() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bjg $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(are.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bky $$0, float $$1) {
      if (!this.s()) {
         eji $$2 = $$0.do();
         double $$3 = $$0.dq() + $$2.c - this.dq();
         double $$4 = $$0.du() - 1.1F - this.ds();
         double $$5 = $$0.dw() + $$2.e - this.dw();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         cmy $$7 = cnb.C;
         if ($$0 instanceof ceu) {
            if ($$0.eu() <= 4.0F) {
               $$7 = cnb.A;
            } else {
               $$7 = cnb.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bjx.b)) {
            $$7 = cnb.s;
         } else if ($$0.eu() >= 8.0F && !$$0.a(bjx.s)) {
            $$7 = cnb.E;
         } else if ($$6 <= 3.0 && !$$0.a(bjx.r) && this.ag.i() < 0.25F) {
            $$7 = cnb.N;
         }

         cep $$8 = new cep(this.dL(), this);
         $$8.a(cna.a(new clb(cle.uv), $$7));
         $$8.s($$8.dD() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aS()) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), aqn.An, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dL().b($$8);
      }
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return 1.62F;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
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
