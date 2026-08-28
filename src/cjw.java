import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjw extends cnx {
   private static final Predicate<bsh> e = $$0 -> $$0.bF() && !($$0 instanceof cjw);
   private static final double ca = 0.3;
   private static final double cb = 0.35;
   private static final int cc = 8356754;
   private static final float cd = 0.57254905F;
   private static final float ce = 0.5137255F;
   private static final float cf = 0.49803922F;
   private static final int cg = 10;
   public static final int b = 40;
   private int ch;
   private int ci;
   private int cj;

   public cjw(bsn<? extends cjw> $$0, dcg $$1) {
      super($$0, $$1);
      this.bP = 20;
      this.a(epa.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzu(this));
      this.bU.a(4, new cak(this, 1.0, true));
      this.bU.a(5, new cbn(this, 0.4));
      this.bU.a(6, new cai(this, cml.class, 6.0F));
      this.bU.a(10, new cai(this, bte.class, 8.0F));
      this.bV.a(2, new cbs(this, cnx.class).a());
      this.bV.a(3, new cbt<>(this, cml.class, true));
      this.bV.a(4, new cbt<>(this, clt.class, true, $$0 -> !$$0.o_()));
      this.bV.a(4, new cbt<>(this, cfe.class, true));
   }

   @Override
   protected void S() {
      boolean $$0 = !(this.cS() instanceof bte) || this.cS().am().a(awa.c);
      boolean $$1 = !(this.de() instanceof coi);
      this.bU.a(caa.a.a, $$0);
      this.bU.a(caa.a.c, $$0 && $$1);
      this.bU.a(caa.a.b, $$0);
      this.bU.a(caa.a.d, $$0);
   }

   public static buj.a s() {
      return cjr.gt().a(buk.s, 100.0).a(buk.v, 0.3).a(buk.p, 0.75).a(buk.c, 12.0).a(buk.d, 1.5).a(buk.m, 32.0).a(buk.B, 1.0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ch);
      $$0.a("StunTick", this.ci);
      $$0.a("RoarTick", this.cj);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.ch = $$0.h("AttackTick");
      this.ci = $$0.h("StunTick");
      this.cj = $$0.h("RoarTick");
   }

   @Override
   public avg ae_() {
      return avh.vf;
   }

   @Override
   public int ab() {
      return 45;
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bF()) {
         if (this.fe()) {
            this.f(buk.v).a(0.0);
         } else {
            double $$0 = this.p() != null ? 0.35 : 0.3;
            double $$1 = this.f(buk.v).b();
            this.f(buk.v).a(ayg.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dR().ab().b(dcc.c)) {
            boolean $$2 = false;
            ewc $$3 = this.cM().g(0.2);

            for (ja $$4 : ja.b(ayg.a($$3.a), ayg.a($$3.b), ayg.a($$3.c), ayg.a($$3.d), ayg.a($$3.e), ayg.a($$3.f))) {
               dsl $$5 = this.dR().a_($$4);
               dfi $$6 = $$5.b();
               if ($$6 instanceof djs) {
                  $$2 = this.dR().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aG()) {
               this.fh();
            }
         }

         if (this.cj > 0) {
            this.cj--;
            if (this.cj == 10) {
               this.gz();
            }
         }

         if (this.ch > 0) {
            this.ch--;
         }

         if (this.ci > 0) {
            this.ci--;
            this.gy();
            if (this.ci == 0) {
               this.a(avh.vk, 1.0F, 1.0F);
               this.cj = 20;
            }
         }
      }
   }

   private void gy() {
      if (this.ah.a(6) == 0) {
         double $$0 = this.dw() - (double)this.dl() * Math.sin((double)(this.aZ * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         double $$1 = this.dy() + (double)this.dm() - 0.3;
         double $$2 = this.dC() + (double)this.dl() * Math.cos((double)(this.aZ * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         this.dR().a(lc.a(lj.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fe() {
      return super.fe() || this.ch > 0 || this.ci > 0 || this.cj > 0;
   }

   @Override
   public boolean F(bsh $$0) {
      return this.ci <= 0 && this.cj <= 0 ? super.F($$0) : false;
   }

   @Override
   protected void e(btc $$0) {
      if (this.cj == 0) {
         if (this.ah.j() < 0.5) {
            this.ci = 40;
            this.a(avh.vj, 1.0F, 1.0F);
            this.dR().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.U = true;
      }
   }

   private void gz() {
      if (this.bF()) {
         for (btc $$1 : this.dR().a(btc.class, this.cM().g(4.0), e)) {
            if (!($$1 instanceof ciy)) {
               $$1.a(this.dS().b((btc)this), 6.0F);
            }

            this.b($$1);
         }

         ewh $$2 = this.cM().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ah.k() * 0.2;
            double $$5 = this.ah.k() * 0.2;
            double $$6 = this.ah.k() * 0.2;
            this.dR().a(lj.ab, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dxh.u);
      }
   }

   private void b(bsh $$0) {
      double $$1 = $$0.dw() - this.dw();
      double $$2 = $$0.dC() - this.dC();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ch = 10;
         this.a(avh.ve, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.ci = 40;
      }

      super.b($$0);
   }

   public int t() {
      return this.ch;
   }

   public int gn() {
      return this.ci;
   }

   public int gx() {
      return this.cj;
   }

   @Override
   public boolean D(bsh $$0) {
      this.ch = 10;
      this.dR().a(this, (byte)4);
      this.a(avh.ve, 1.0F, 1.0F);
      return super.D($$0);
   }

   @Nullable
   @Override
   protected avg v() {
      return avh.vd;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.vh;
   }

   @Override
   protected avg n_() {
      return avh.vg;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.vi, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dcj $$0) {
      return !$$0.d(this.cM());
   }

   @Override
   public void a(aqm $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean go() {
      return false;
   }

   @Override
   protected ewc gf() {
      ewc $$0 = super.gf();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
