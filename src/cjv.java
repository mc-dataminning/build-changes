import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjv extends cnw {
   private static final Predicate<bsg> e = $$0 -> $$0.bE() && !($$0 instanceof cjv);
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

   public cjv(bsm<? extends cjv> $$0, dcf $$1) {
      super($$0, $$1);
      this.bP = 20;
      this.a(eoy.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzt(this));
      this.bU.a(4, new caj(this, 1.0, true));
      this.bU.a(5, new cbm(this, 0.4));
      this.bU.a(6, new cah(this, cmk.class, 6.0F));
      this.bU.a(10, new cah(this, btd.class, 8.0F));
      this.bV.a(2, new cbr(this, cnw.class).a());
      this.bV.a(3, new cbs<>(this, cmk.class, true));
      this.bV.a(4, new cbs<>(this, cls.class, true, $$0 -> !$$0.p_()));
      this.bV.a(4, new cbs<>(this, cfd.class, true));
   }

   @Override
   protected void S() {
      boolean $$0 = !(this.cR() instanceof btd) || this.cR().al().a(awa.c);
      boolean $$1 = !(this.dd() instanceof coh);
      this.bU.a(bzz.a.a, $$0);
      this.bU.a(bzz.a.c, $$0 && $$1);
      this.bU.a(bzz.a.b, $$0);
      this.bU.a(bzz.a.d, $$0);
   }

   public static bui.a s() {
      return cjq.gu().a(buj.s, 100.0).a(buj.v, 0.3).a(buj.p, 0.75).a(buj.c, 12.0).a(buj.d, 1.5).a(buj.m, 32.0).a(buj.B, 1.0);
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
   public void n_() {
      super.n_();
      if (this.bE()) {
         if (this.fd()) {
            this.f(buj.v).a(0.0);
         } else {
            double $$0 = this.p() != null ? 0.35 : 0.3;
            double $$1 = this.f(buj.v).b();
            this.f(buj.v).a(ayg.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dQ().ab().b(dcb.c)) {
            boolean $$2 = false;
            ewa $$3 = this.cL().g(0.2);

            for (ja $$4 : ja.b(ayg.a($$3.a), ayg.a($$3.b), ayg.a($$3.c), ayg.a($$3.d), ayg.a($$3.e), ayg.a($$3.f))) {
               dsk $$5 = this.dQ().a_($$4);
               dfh $$6 = $$5.b();
               if ($$6 instanceof djr) {
                  $$2 = this.dQ().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aF()) {
               this.fg();
            }
         }

         if (this.cj > 0) {
            this.cj--;
            if (this.cj == 10) {
               this.gA();
            }
         }

         if (this.ch > 0) {
            this.ch--;
         }

         if (this.ci > 0) {
            this.ci--;
            this.gz();
            if (this.ci == 0) {
               this.a(avh.vk, 1.0F, 1.0F);
               this.cj = 20;
            }
         }
      }
   }

   private void gz() {
      if (this.ah.a(6) == 0) {
         double $$0 = this.dv() - (double)this.dk() * Math.sin((double)(this.aY * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         double $$1 = this.dx() + (double)this.dl() - 0.3;
         double $$2 = this.dB() + (double)this.dk() * Math.cos((double)(this.aY * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         this.dQ().a(lc.a(lj.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fd() {
      return super.fd() || this.ch > 0 || this.ci > 0 || this.cj > 0;
   }

   @Override
   public boolean F(bsg $$0) {
      return this.ci <= 0 && this.cj <= 0 ? super.F($$0) : false;
   }

   @Override
   protected void e(btb $$0) {
      if (this.cj == 0) {
         if (this.ah.j() < 0.5) {
            this.ci = 40;
            this.a(avh.vj, 1.0F, 1.0F);
            this.dQ().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.U = true;
      }
   }

   private void gA() {
      if (this.bE()) {
         for (btb $$1 : this.dQ().a(btb.class, this.cL().g(4.0), e)) {
            if (!($$1 instanceof cix)) {
               $$1.a(this.dR().b((btb)this), 6.0F);
            }

            this.b($$1);
         }

         ewf $$2 = this.cL().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ah.k() * 0.2;
            double $$5 = this.ah.k() * 0.2;
            double $$6 = this.ah.k() * 0.2;
            this.dQ().a(lj.ab, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dxg.u);
      }
   }

   private void b(bsg $$0) {
      double $$1 = $$0.dv() - this.dv();
      double $$2 = $$0.dB() - this.dB();
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

   public int u() {
      return this.ch;
   }

   public int go() {
      return this.ci;
   }

   public int gy() {
      return this.cj;
   }

   @Override
   public boolean D(bsg $$0) {
      this.ch = 10;
      this.dQ().a(this, (byte)4);
      this.a(avh.ve, 1.0F, 1.0F);
      return super.D($$0);
   }

   @Nullable
   @Override
   protected avg v() {
      return avh.vd;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.vh;
   }

   @Override
   protected avg o_() {
      return avh.vg;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.vi, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dci $$0) {
      return !$$0.d(this.cL());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gp() {
      return false;
   }

   @Override
   protected ewa gg() {
      ewa $$0 = super.gg();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
