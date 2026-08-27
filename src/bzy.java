import java.util.List;
import java.util.UUID;
import org.joml.Vector3f;

public class bzy extends cdc implements bzm {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bkk e = new bkk(b, "Drinking speed penalty", -0.25, bkk.a.a);
   private static final aef<Boolean> bT = aei.a(bzy.class, aeh.k);
   private int bU;
   private brw<cdc> bV;
   private brv<cbu> bW;

   public bzy(biu<? extends bzy> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bV = new brw<>(this, cdc.class, true, $$0 -> $$0 != null && this.gs() && $$0.ag() != biu.bj);
      this.bW = new brv<>(this, cbu.class, 10, true, false, null);
      this.bO.a(1, new bpv(this));
      this.bO.a(2, new bra(this, 1.0, 60, 10.0F));
      this.bO.a(2, new bro(this, 1.0));
      this.bO.a(3, new bqj(this, cbu.class, 8.0F));
      this.bO.a(3, new bqw(this));
      this.bP.a(1, new brt(this, cdc.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(bT, false);
   }

   @Override
   protected apd w() {
      return ape.Ad;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.Ah;
   }

   @Override
   protected apd l_() {
      return ape.Af;
   }

   public void y(boolean $$0) {
      this.al().b(bT, $$0);
   }

   public boolean s() {
      return this.al().b(bT);
   }

   public static bkl.a t() {
      return bzi.gj().a(bkm.a, 26.0).a(bkm.d, 0.25);
   }

   @Override
   public void b_() {
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
               cjf $$0 = this.eS();
               this.a(biv.a, cjf.b);
               if ($$0.a(cji.rv)) {
                  List<bid> $$1 = cle.a($$0);
                  if ($$1 != null) {
                     for (bid $$2 : $$1) {
                        this.b(new bid($$2));
                     }
                  }
               }

               this.a(djt.l);
               this.a(bkm.d).b(e.a());
            }
         } else {
            clc $$3 = null;
            if (this.ag.i() < 0.15F && this.a(apy.a) && !this.a(bif.m)) {
               $$3 = clf.y;
            } else if (this.ag.i() < 0.15F && (this.bM() || this.ew() != null && this.ew().a(apv.i)) && !this.a(bif.l)) {
               $$3 = clf.n;
            } else if (this.ag.i() < 0.05F && this.eu() < this.eL()) {
               $$3 = clf.A;
            } else if (this.ag.i() < 0.5F && this.q() != null && !this.a(bif.a) && this.q().f(this) > 121.0) {
               $$3 = clf.p;
            }

            if ($$3 != null) {
               this.a(biv.a, cle.a(new cjf(cji.rv), $$3));
               this.bU = this.eS().r();
               this.y(true);
               if (!this.aS()) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), ape.Ag, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bki $$4 = this.a(bkm.d);
               $$4.b(e.a());
               $$4.b(e);
            }
         }

         if (this.ag.i() < 7.5E-4F) {
            this.dL().a(this, (byte)15);
         }
      }

      super.b_();
   }

   @Override
   public apd ac_() {
      return ape.Ae;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dL().a(ix.ah, this.dq() + this.ag.k() * 0.13F, this.cG().e + 0.5 + this.ag.k() * 0.13F, this.dw() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bho $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(apv.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bjg $$0, float $$1) {
      if (!this.s()) {
         ehn $$2 = $$0.do();
         double $$3 = $$0.dq() + $$2.c - this.dq();
         double $$4 = $$0.du() - 1.1F - this.ds();
         double $$5 = $$0.dw() + $$2.e - this.dw();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         clc $$7 = clf.C;
         if ($$0 instanceof cdc) {
            if ($$0.eu() <= 4.0F) {
               $$7 = clf.A;
            } else {
               $$7 = clf.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bif.b)) {
            $$7 = clf.s;
         } else if ($$0.eu() >= 8.0F && !$$0.a(bif.s)) {
            $$7 = clf.E;
         } else if ($$6 <= 3.0 && !$$0.a(bif.r) && this.ag.i() < 0.25F) {
            $$7 = clf.N;
         }

         ccx $$8 = new ccx(this.dL(), this);
         $$8.a(cle.a(new cjf(cji.uu), $$7));
         $$8.s($$8.dD() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aS()) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), ape.Ai, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dL().b($$8);
      }
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return 1.62F;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.3125F * $$2, 0.0F);
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean ge() {
      return false;
   }
}
