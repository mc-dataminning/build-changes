import java.util.List;
import java.util.UUID;
import org.joml.Vector3f;

public class cby extends cfc implements cbm {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bmk e = new bmk(b, "Drinking speed penalty", -0.25, bmk.a.a);
   private static final afo<Boolean> bT = afr.a(cby.class, afq.k);
   private int bU;
   private btw<cfc> bV;
   private btv<cdu> bW;

   public cby(bku<? extends cby> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bV = new btw<>(this, cfc.class, true, $$0 -> $$0 != null && this.gu() && $$0.ai() != bku.bj);
      this.bW = new btv<>(this, cdu.class, 10, true, false, null);
      this.bO.a(1, new brv(this));
      this.bO.a(2, new bta(this, 1.0, 60, 10.0F));
      this.bO.a(2, new bto(this, 1.0));
      this.bO.a(3, new bsj(this, cdu.class, 8.0F));
      this.bO.a(3, new bsw(this));
      this.bP.a(1, new btt(this, cfc.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an().a(bT, false);
   }

   @Override
   protected aqq y() {
      return aqr.AJ;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.AN;
   }

   @Override
   protected aqq m_() {
      return aqr.AL;
   }

   public void y(boolean $$0) {
      this.an().b(bT, $$0);
   }

   @Override
   public boolean u() {
      return this.an().b(bT);
   }

   public static bml.a w() {
      return cbi.gl().a(bmm.l, 26.0).a(bmm.m, 0.25);
   }

   @Override
   public void c_() {
      if (!this.dN().B && this.bx()) {
         this.bV.k();
         if (this.bV.i() <= 0) {
            this.bW.a(true);
         } else {
            this.bW.a(false);
         }

         if (this.u()) {
            if (this.bU-- <= 0) {
               this.y(false);
               clj $$0 = this.eU();
               this.a(bkv.a, clj.b);
               if ($$0.a(clm.sh)) {
                  List<bkd> $$1 = cni.a($$0);
                  if ($$1 != null) {
                     for (bkd $$2 : $$1) {
                        this.b(new bkd($$2));
                     }
                  }
               }

               this.a(dls.l);
               this.a(bmm.m).b(e.a());
            }
         } else {
            cng $$3 = null;
            if (this.ag.i() < 0.15F && this.a(arl.a) && !this.a(bkf.m)) {
               $$3 = cnj.y;
            } else if (this.ag.i() < 0.15F && (this.bN() || this.ey() != null && this.ey().a(ari.i)) && !this.a(bkf.l)) {
               $$3 = cnj.n;
            } else if (this.ag.i() < 0.05F && this.ew() < this.eN()) {
               $$3 = cnj.A;
            } else if (this.ag.i() < 0.5F && this.q() != null && !this.a(bkf.a) && this.q().f(this) > 121.0) {
               $$3 = cnj.p;
            }

            if ($$3 != null) {
               this.a(bkv.a, cni.a(new clj(clm.sh), $$3));
               this.bU = this.eU().r();
               this.y(true);
               if (!this.aU()) {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.AM, this.dc(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bmi $$4 = this.a(bmm.m);
               $$4.b(e.a());
               $$4.b(e);
            }
         }

         if (this.ag.i() < 7.5E-4F) {
            this.dN().a(this, (byte)15);
         }
      }

      super.c_();
   }

   @Override
   public aqq ae_() {
      return aqr.AK;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dN().a(js.ai, this.ds() + this.ag.k() * 0.13F, this.cH().e + 0.5 + this.ag.k() * 0.13F, this.dy() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bjo $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(ari.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(blg $$0, float $$1) {
      if (!this.u()) {
         eju $$2 = $$0.dq();
         double $$3 = $$0.ds() + $$2.c - this.ds();
         double $$4 = $$0.dw() - 1.1F - this.du();
         double $$5 = $$0.dy() + $$2.e - this.dy();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         cng $$7 = cnj.C;
         if ($$0 instanceof cfc) {
            if ($$0.ew() <= 4.0F) {
               $$7 = cnj.A;
            } else {
               $$7 = cnj.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bkf.b)) {
            $$7 = cnj.s;
         } else if ($$0.ew() >= 8.0F && !$$0.a(bkf.s)) {
            $$7 = cnj.E;
         } else if ($$6 <= 3.0 && !$$0.a(bkf.r) && this.ag.i() < 0.25F) {
            $$7 = cnj.N;
         }

         cex $$8 = new cex(this.dN(), this);
         $$8.a(cni.a(new clj(clm.vg), $$7));
         $$8.s($$8.dF() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.AO, this.dc(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dN().b($$8);
      }
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return 1.62F;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.3125F * $$2, 0.0F);
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gg() {
      return false;
   }
}
