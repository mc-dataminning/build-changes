import java.util.List;
import java.util.UUID;
import org.joml.Vector3f;

public class cae extends cdi implements bzs {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bkq e = new bkq(b, "Drinking speed penalty", -0.25, bkq.a.a);
   private static final aef<Boolean> bT = aei.a(cae.class, aeh.k);
   private int bU;
   private bsc<cdi> bV;
   private bsb<cca> bW;

   public cae(bja<? extends cae> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bV = new bsc<>(this, cdi.class, true, $$0 -> $$0 != null && this.gt() && $$0.ag() != bja.bj);
      this.bW = new bsb<>(this, cca.class, 10, true, false, null);
      this.bO.a(1, new bqb(this));
      this.bO.a(2, new brg(this, 1.0, 60, 10.0F));
      this.bO.a(2, new bru(this, 1.0));
      this.bO.a(3, new bqp(this, cca.class, 8.0F));
      this.bO.a(3, new brc(this));
      this.bP.a(1, new brz(this, cdi.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(bT, false);
   }

   @Override
   protected apf w() {
      return apg.Ad;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.Ah;
   }

   @Override
   protected apf l_() {
      return apg.Af;
   }

   public void y(boolean $$0) {
      this.al().b(bT, $$0);
   }

   public boolean s() {
      return this.al().b(bT);
   }

   public static bkr.a t() {
      return bzo.gk().a(bks.l, 26.0).a(bks.m, 0.25);
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
               cjl $$0 = this.eS();
               this.a(bjb.a, cjl.b);
               if ($$0.a(cjo.rv)) {
                  List<bij> $$1 = clk.a($$0);
                  if ($$1 != null) {
                     for (bij $$2 : $$1) {
                        this.b(new bij($$2));
                     }
                  }
               }

               this.a(djn.l);
               this.a(bks.m).b(e.a());
            }
         } else {
            cli $$3 = null;
            if (this.ag.i() < 0.15F && this.a(aqa.a) && !this.a(bil.m)) {
               $$3 = cll.y;
            } else if (this.ag.i() < 0.15F && (this.bM() || this.ew() != null && this.ew().a(apx.i)) && !this.a(bil.l)) {
               $$3 = cll.n;
            } else if (this.ag.i() < 0.05F && this.eu() < this.eL()) {
               $$3 = cll.A;
            } else if (this.ag.i() < 0.5F && this.q() != null && !this.a(bil.a) && this.q().f(this) > 121.0) {
               $$3 = cll.p;
            }

            if ($$3 != null) {
               this.a(bjb.a, clk.a(new cjl(cjo.rv), $$3));
               this.bU = this.eS().r();
               this.y(true);
               if (!this.aS()) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), apg.Ag, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bko $$4 = this.a(bks.m);
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
   public apf ac_() {
      return apg.Ae;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dL().a(iv.ah, this.dq() + this.ag.k() * 0.13F, this.cG().e + 0.5 + this.ag.k() * 0.13F, this.dw() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bhu $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(apx.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bjm $$0, float $$1) {
      if (!this.s()) {
         ehh $$2 = $$0.do();
         double $$3 = $$0.dq() + $$2.c - this.dq();
         double $$4 = $$0.du() - 1.1F - this.ds();
         double $$5 = $$0.dw() + $$2.e - this.dw();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         cli $$7 = cll.C;
         if ($$0 instanceof cdi) {
            if ($$0.eu() <= 4.0F) {
               $$7 = cll.A;
            } else {
               $$7 = cll.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bil.b)) {
            $$7 = cll.s;
         } else if ($$0.eu() >= 8.0F && !$$0.a(bil.s)) {
            $$7 = cll.E;
         } else if ($$6 <= 3.0 && !$$0.a(bil.r) && this.ag.i() < 0.25F) {
            $$7 = cll.N;
         }

         cdd $$8 = new cdd(this.dL(), this);
         $$8.a(clk.a(new cjl(cjo.uu), $$7));
         $$8.s($$8.dD() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aS()) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), apg.Ai, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dL().b($$8);
      }
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return 1.62F;
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
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
