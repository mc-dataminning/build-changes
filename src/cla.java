import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cla extends cpd {
   private static final Predicate<btj> bZ = $$0 -> $$0.bI() && !($$0 instanceof cla) && ($$0.dS().ac().b(ddo.c) || !$$0.ao().equals(btq.d));
   private static final double ca = 0.3;
   private static final double cb = 0.35;
   private static final int cc = 8356754;
   private static final float cd = 0.57254905F;
   private static final float ce = 0.5137255F;
   private static final float cf = 0.49803922F;
   public static final int b = 10;
   public static final int c = 40;
   private int cg;
   private int ch;
   private int ci;

   public cla(btq<? extends cla> $$0, dds $$1) {
      super($$0, $$1);
      this.bO = 20;
      this.a(eqs.v, 0.0F);
   }

   @Override
   protected void D() {
      super.D();
      this.bT.a(0, new caw(this));
      this.bT.a(4, new cbm(this, 1.0, true));
      this.bT.a(5, new ccp(this, 0.4));
      this.bT.a(6, new cbk(this, cnp.class, 6.0F));
      this.bT.a(10, new cbk(this, buh.class, 8.0F));
      this.bU.a(2, new ccu(this, cpd.class).a());
      this.bU.a(3, new ccv<>(this, cnp.class, true));
      this.bU.a(4, new ccv<>(this, cmx.class, true, $$0 -> !$$0.o_()));
      this.bU.a(4, new ccv<>(this, cgh.class, true));
   }

   @Override
   protected void W() {
      boolean $$0 = !(this.cU() instanceof buh) || this.cU().ao().a(aww.c);
      boolean $$1 = !(this.dg() instanceof cpo);
      this.bT.a(cbc.a.a, $$0);
      this.bT.a(cbc.a.c, $$0 && $$1);
      this.bT.a(cbc.a.b, $$0);
      this.bT.a(cbc.a.d, $$0);
   }

   public static bvl.a q() {
      return ckv.gu().a(bvm.s, 100.0).a(bvm.v, 0.3).a(bvm.p, 0.75).a(bvm.c, 12.0).a(bvm.d, 1.5).a(bvm.m, 32.0).a(bvm.B, 1.0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.cg);
      $$0.a("StunTick", this.ch);
      $$0.a("RoarTick", this.ci);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.cg = $$0.h("AttackTick");
      this.ch = $$0.h("StunTick");
      this.ci = $$0.h("RoarTick");
   }

   @Override
   public awc ah_() {
      return awd.vg;
   }

   @Override
   public int ag() {
      return 45;
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bI()) {
         if (this.ff()) {
            this.g(bvm.v).a(0.0);
         } else {
            double $$0 = this.m() != null ? 0.35 : 0.3;
            double $$1 = this.g(bvm.v).b();
            this.g(bvm.v).a(azc.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dS().ac().b(ddo.c)) {
            boolean $$2 = false;
            exz $$3 = this.cO().g(0.2);

            for (je $$4 : je.b(azc.a($$3.a), azc.a($$3.b), azc.a($$3.c), azc.a($$3.d), azc.a($$3.e), azc.a($$3.f))) {
               dua $$5 = this.dS().a_($$4);
               dgv $$6 = $$5.b();
               if ($$6 instanceof dlf) {
                  $$2 = this.dS().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aH()) {
               this.v();
            }
         }

         if (this.ci > 0) {
            this.ci--;
            if (this.ci == 10) {
               this.gA();
            }
         }

         if (this.cg > 0) {
            this.cg--;
         }

         if (this.ch > 0) {
            this.ch--;
            this.gz();
            if (this.ch == 0) {
               this.a(awd.vl, 1.0F, 1.0F);
               this.ci = 20;
            }
         }
      }
   }

   private void gz() {
      if (this.af.a(6) == 0) {
         double $$0 = this.dx() - (double)this.dn() * Math.sin((double)(this.aU * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         double $$1 = this.dz() + (double)this.do() - 0.3;
         double $$2 = this.dD() + (double)this.dn() * Math.cos((double)(this.aU * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         this.dS().a(lg.a(ln.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean ff() {
      return super.ff() || this.cg > 0 || this.ch > 0 || this.ci > 0;
   }

   @Override
   public boolean G(btj $$0) {
      return this.ch <= 0 && this.ci <= 0 ? super.G($$0) : false;
   }

   @Override
   protected void e(buf $$0) {
      if (this.ci == 0) {
         if (this.af.j() < 0.5) {
            this.ch = 40;
            this.a(awd.vk, 1.0F, 1.0F);
            this.dS().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.c($$0);
         }

         $$0.U = true;
      }
   }

   private void gA() {
      if (this.bI()) {
         for (buf $$1 : this.dS().a(buf.class, this.cO().g(4.0), bZ)) {
            if (!($$1 instanceof ckc)) {
               $$1.a(this.dT().b((buf)this), 6.0F);
            }

            this.c($$1);
         }

         eye $$2 = this.cO().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.af.k() * 0.2;
            double $$5 = this.af.k() * 0.2;
            double $$6 = this.af.k() * 0.2;
            this.dS().a(ln.ab, $$2.d, $$2.e, $$2.f, $$4, $$5, $$6);
         }

         this.a(dyx.u);
      }
   }

   private void c(btj $$0) {
      double $$1 = $$0.dx() - this.dx();
      double $$2 = $$0.dD() - this.dD();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cg = 10;
         this.a(awd.vf, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.ch = 40;
      }

      super.b($$0);
   }

   public int t() {
      return this.cg;
   }

   public int go() {
      return this.ch;
   }

   public int gy() {
      return this.ci;
   }

   @Override
   public boolean E(btj $$0) {
      this.cg = 10;
      this.dS().a(this, (byte)4);
      this.a(awd.vf, 1.0F, 1.0F);
      return super.E($$0);
   }

   @Nullable
   @Override
   protected awc w() {
      return awd.ve;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.vi;
   }

   @Override
   protected awc n_() {
      return awd.vh;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.vj, 0.15F, 1.0F);
   }

   @Override
   public boolean a(ddv $$0) {
      return !$$0.d(this.cO());
   }

   @Override
   public void a(arg $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gp() {
      return false;
   }

   @Override
   protected exz gg() {
      exz $$0 = super.gg();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
