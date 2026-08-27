import java.util.List;
import java.util.UUID;

public class cfw extends cjk implements cfk {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bqc e = new bqc(b, "Drinking speed penalty", -0.25, bqc.a.a);
   private static final aii<Boolean> bV = ail.a(cfw.class, aik.k);
   private int bW;
   private bxp<cjk> bX;
   private bxo<cia> bY;

   public cfw(bol<? extends cfw> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bX = new bxp<>(this, cjk.class, true, $$0 -> $$0 != null && this.gA() && $$0.ai() != bol.bm);
      this.bY = new bxo<>(this, cia.class, 10, true, false, null);
      this.bP.a(1, new bvo(this));
      this.bP.a(2, new bwt(this, 1.0, 60, 10.0F));
      this.bP.a(2, new bxh(this, 1.0));
      this.bP.a(3, new bwc(this, cia.class, 8.0F));
      this.bP.a(3, new bwp(this));
      this.bQ.a(1, new bxm(this, cjk.class));
      this.bQ.a(2, this.bX);
      this.bQ.a(3, this.bY);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(bV, false);
   }

   @Override
   protected ato y() {
      return atp.BI;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.BM;
   }

   @Override
   protected ato n_() {
      return atp.BK;
   }

   public void y(boolean $$0) {
      this.an().b(bV, $$0);
   }

   @Override
   public boolean u() {
      return this.an().b(bV);
   }

   public static bqd.a w() {
      return cfg.gr().a(bqe.n, 26.0).a(bqe.o, 0.25);
   }

   @Override
   public void d_() {
      if (!this.dJ().B && this.bx()) {
         this.bX.k();
         if (this.bX.i() <= 0) {
            this.bY.a(true);
         } else {
            this.bY.a(false);
         }

         if (this.u()) {
            if (this.bW-- <= 0) {
               this.y(false);
               cpq $$0 = this.eR();
               this.a(bom.a, cpq.h);
               if ($$0.a(cpt.sj)) {
                  List<bns> $$1 = cro.a($$0);
                  if ($$1 != null) {
                     for (bns $$2 : $$1) {
                        this.b(new bns($$2));
                     }
                  }
               }

               this.b(dqr.l);
               this.f(bqe.o).b(e.a());
            }
         } else {
            il<crm> $$3 = null;
            if (this.af.i() < 0.15F && this.a(auj.a) && !this.a(bnu.m)) {
               $$3 = crp.y;
            } else if (this.af.i() < 0.15F && (this.bK() || this.ew() != null && this.ew().a(aug.j)) && !this.a(bnu.l)) {
               $$3 = crp.n;
            } else if (this.af.i() < 0.05F && this.eu() < this.eL()) {
               $$3 = crp.A;
            } else if (this.af.i() < 0.5F && this.q() != null && !this.a(bnu.a) && this.q().f(this) > 121.0) {
               $$3 = crp.p;
            }

            if ($$3 != null) {
               this.a(bom.a, cro.a(new cpq(cpt.sj), $$3));
               this.bW = this.eR().s();
               this.y(true);
               if (!this.aU()) {
                  this.dJ().a(null, this.do(), this.dq(), this.du(), atp.BL, this.cY(), 1.0F, 0.8F + this.af.i() * 0.4F);
               }

               bqa $$4 = this.f(bqe.o);
               $$4.b(e.a());
               $$4.c(e);
            }
         }

         if (this.af.i() < 7.5E-4F) {
            this.dJ().a(this, (byte)15);
         }
      }

      super.d_();
   }

   @Override
   public ato ag_() {
      return atp.BJ;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.af.a(35) + 10; $$1++) {
            this.dJ().a(kb.ak, this.do() + this.af.k() * 0.13F, this.cE().e + 0.5 + this.af.k() * 0.13F, this.du() + this.af.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bne $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(aug.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(box $$0, float $$1) {
      if (!this.u()) {
         eov $$2 = $$0.dm();
         double $$3 = $$0.do() + $$2.c - this.do();
         double $$4 = $$0.ds() - 1.1F - this.dq();
         double $$5 = $$0.du() + $$2.e - this.du();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         il<crm> $$7 = crp.C;
         if ($$0 instanceof cjk) {
            if ($$0.eu() <= 4.0F) {
               $$7 = crp.A;
            } else {
               $$7 = crp.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bnu.b)) {
            $$7 = crp.s;
         } else if ($$0.eu() >= 8.0F && !$$0.a(bnu.s)) {
            $$7 = crp.E;
         } else if ($$6 <= 3.0 && !$$0.a(bnu.r) && this.af.i() < 0.25F) {
            $$7 = crp.N;
         }

         cje $$8 = new cje(this.dJ(), this);
         $$8.a(cro.a(new cpq(cpt.vk), $$7));
         $$8.s($$8.dB() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dJ().a(null, this.do(), this.dq(), this.du(), atp.BN, this.cY(), 1.0F, 0.8F + this.af.i() * 0.4F);
         }

         this.dJ().b($$8);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gm() {
      return false;
   }
}
