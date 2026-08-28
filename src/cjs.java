import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjs extends cnt {
   private static final Predicate<bsd> e = $$0 -> $$0.bD() && !($$0 instanceof cjs);
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

   public cjs(bsj<? extends cjs> $$0, dcd $$1) {
      super($$0, $$1);
      this.bP = 20;
      this.a(eos.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzq(this));
      this.bU.a(4, new cag(this, 1.0, true));
      this.bU.a(5, new cbj(this, 0.4));
      this.bU.a(6, new cae(this, cmh.class, 6.0F));
      this.bU.a(10, new cae(this, bta.class, 8.0F));
      this.bV.a(2, new cbo(this, cnt.class).a());
      this.bV.a(3, new cbp<>(this, cmh.class, true));
      this.bV.a(4, new cbp<>(this, clp.class, true, $$0 -> !$$0.p_()));
      this.bV.a(4, new cbp<>(this, cfa.class, true));
   }

   @Override
   protected void S() {
      boolean $$0 = !(this.cQ() instanceof bta) || this.cQ().ak().a(avy.c);
      boolean $$1 = !(this.dc() instanceof coe);
      this.bU.a(bzw.a.a, $$0);
      this.bU.a(bzw.a.c, $$0 && $$1);
      this.bU.a(bzw.a.b, $$0);
      this.bU.a(bzw.a.d, $$0);
   }

   public static buf.a s() {
      return cjn.gt().a(bug.s, 100.0).a(bug.v, 0.3).a(bug.p, 0.75).a(bug.c, 12.0).a(bug.d, 1.5).a(bug.m, 32.0).a(bug.B, 1.0);
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
   public ave ae_() {
      return avf.vf;
   }

   @Override
   public int ab() {
      return 45;
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bD()) {
         if (this.fc()) {
            this.f(bug.v).a(0.0);
         } else {
            double $$0 = this.p() != null ? 0.35 : 0.3;
            double $$1 = this.f(bug.v).b();
            this.f(bug.v).a(aye.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dP().ab().b(dbz.c)) {
            boolean $$2 = false;
            evu $$3 = this.cK().g(0.2);

            for (ja $$4 : ja.b(aye.a($$3.a), aye.a($$3.b), aye.a($$3.c), aye.a($$3.d), aye.a($$3.e), aye.a($$3.f))) {
               dsh $$5 = this.dP().a_($$4);
               dff $$6 = $$5.b();
               if ($$6 instanceof djp) {
                  $$2 = this.dP().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aE()) {
               this.ff();
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
               this.a(avf.vk, 1.0F, 1.0F);
               this.cj = 20;
            }
         }
      }
   }

   private void gy() {
      if (this.ah.a(6) == 0) {
         double $$0 = this.du() - (double)this.dj() * Math.sin((double)(this.aY * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         double $$1 = this.dw() + (double)this.dk() - 0.3;
         double $$2 = this.dA() + (double)this.dj() * Math.cos((double)(this.aY * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         this.dP().a(lc.a(lj.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fc() {
      return super.fc() || this.ch > 0 || this.ci > 0 || this.cj > 0;
   }

   @Override
   public boolean F(bsd $$0) {
      return this.ci <= 0 && this.cj <= 0 ? super.F($$0) : false;
   }

   @Override
   protected void e(bsy $$0) {
      if (this.cj == 0) {
         if (this.ah.j() < 0.5) {
            this.ci = 40;
            this.a(avf.vj, 1.0F, 1.0F);
            this.dP().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.U = true;
      }
   }

   private void gz() {
      if (this.bD()) {
         for (bsy $$1 : this.dP().a(bsy.class, this.cK().g(4.0), e)) {
            if (!($$1 instanceof ciu)) {
               $$1.a(this.dQ().b((bsy)this), 6.0F);
            }

            this.b($$1);
         }

         evz $$2 = this.cK().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ah.k() * 0.2;
            double $$5 = this.ah.k() * 0.2;
            double $$6 = this.ah.k() * 0.2;
            this.dP().a(lj.ab, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dxa.u);
      }
   }

   private void b(bsd $$0) {
      double $$1 = $$0.du() - this.du();
      double $$2 = $$0.dA() - this.dA();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ch = 10;
         this.a(avf.ve, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.ci = 40;
      }

      super.b($$0);
   }

   public int u() {
      return this.ch;
   }

   public int gn() {
      return this.ci;
   }

   public int gx() {
      return this.cj;
   }

   @Override
   public boolean D(bsd $$0) {
      this.ch = 10;
      this.dP().a(this, (byte)4);
      this.a(avf.ve, 1.0F, 1.0F);
      return super.D($$0);
   }

   @Nullable
   @Override
   protected ave v() {
      return avf.vd;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.vh;
   }

   @Override
   protected ave o_() {
      return avf.vg;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.vi, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dcg $$0) {
      return !$$0.d(this.cK());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean go() {
      return false;
   }

   @Override
   protected evu gf() {
      evu $$0 = super.gf();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
