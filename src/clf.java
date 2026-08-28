import java.util.function.Predicate;
import javax.annotation.Nullable;

public class clf extends cpj {
   private static final Predicate<bto> bY = $$0 -> $$0.bI() && !($$0 instanceof clf) && ($$0.dS().ac().b(dec.c) || !$$0.ao().equals(btv.d));
   private static final double bZ = 0.3;
   private static final double ca = 0.35;
   private static final int cb = 8356754;
   private static final float cc = 0.57254905F;
   private static final float cd = 0.5137255F;
   private static final float ce = 0.49803922F;
   public static final int b = 10;
   public static final int c = 40;
   private int cf;
   private int cg;
   private int ch;

   public clf(btv<? extends clf> $$0, deg $$1) {
      super($$0, $$1);
      this.bN = 20;
      this.a(erg.v, 0.0F);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbb(this));
      this.bS.a(4, new cbr(this, 1.0, true));
      this.bS.a(5, new ccu(this, 0.4));
      this.bS.a(6, new cbp(this, cnu.class, 6.0F));
      this.bS.a(10, new cbp(this, bum.class, 8.0F));
      this.bT.a(2, new ccz(this, cpj.class).a());
      this.bT.a(3, new cda<>(this, cnu.class, true));
      this.bT.a(4, new cda<>(this, cnc.class, true, $$0 -> !$$0.o_()));
      this.bT.a(4, new cda<>(this, cgm.class, true));
   }

   @Override
   protected void W() {
      boolean $$0 = !(this.cU() instanceof bum) || this.cU().ao().a(awx.c);
      boolean $$1 = !(this.dg() instanceof cpu);
      this.bS.a(cbh.a.a, $$0);
      this.bS.a(cbh.a.c, $$0 && $$1);
      this.bS.a(cbh.a.b, $$0);
      this.bS.a(cbh.a.d, $$0);
   }

   public static bvq.a q() {
      return cla.gv().a(bvr.s, 100.0).a(bvr.v, 0.3).a(bvr.p, 0.75).a(bvr.c, 12.0).a(bvr.d, 1.5).a(bvr.m, 32.0).a(bvr.B, 1.0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.cf);
      $$0.a("StunTick", this.cg);
      $$0.a("RoarTick", this.ch);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.cf = $$0.h("AttackTick");
      this.cg = $$0.h("StunTick");
      this.ch = $$0.h("RoarTick");
   }

   @Override
   public awd ah_() {
      return awe.vg;
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
            this.g(bvr.v).a(0.0);
         } else {
            double $$0 = this.m() != null ? 0.35 : 0.3;
            double $$1 = this.g(bvr.v).b();
            this.g(bvr.v).a(azd.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dS().ac().b(dec.c)) {
            boolean $$2 = false;
            eyn $$3 = this.cO().g(0.2);

            for (je $$4 : je.b(azd.a($$3.a), azd.a($$3.b), azd.a($$3.c), azd.a($$3.d), azd.a($$3.e), azd.a($$3.f))) {
               duo $$5 = this.dS().a_($$4);
               dhj $$6 = $$5.b();
               if ($$6 instanceof dlt) {
                  $$2 = this.dS().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aH()) {
               this.v();
            }
         }

         if (this.ch > 0) {
            this.ch--;
            if (this.ch == 10) {
               this.gB();
            }
         }

         if (this.cf > 0) {
            this.cf--;
         }

         if (this.cg > 0) {
            this.cg--;
            this.gA();
            if (this.cg == 0) {
               this.a(awe.vl, 1.0F, 1.0F);
               this.ch = 20;
            }
         }
      }
   }

   private void gA() {
      if (this.af.a(6) == 0) {
         double $$0 = this.dx() - (double)this.dn() * Math.sin((double)(this.aT * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         double $$1 = this.dz() + (double)this.do() - 0.3;
         double $$2 = this.dD() + (double)this.dn() * Math.cos((double)(this.aT * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         this.dS().a(lg.a(ln.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean ff() {
      return super.ff() || this.cf > 0 || this.cg > 0 || this.ch > 0;
   }

   @Override
   public boolean G(bto $$0) {
      return this.cg <= 0 && this.ch <= 0 ? super.G($$0) : false;
   }

   @Override
   protected void e(buk $$0) {
      if (this.ch == 0) {
         if (this.af.j() < 0.5) {
            this.cg = 40;
            this.a(awe.vk, 1.0F, 1.0F);
            this.dS().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.c($$0);
         }

         $$0.U = true;
      }
   }

   private void gB() {
      if (this.bI()) {
         for (buk $$1 : this.dS().a(buk.class, this.cO().g(4.0), bY)) {
            if (!($$1 instanceof ckh)) {
               $$1.a(this.dT().b((buk)this), 6.0F);
            }

            this.c($$1);
         }

         eys $$2 = this.cO().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.af.k() * 0.2;
            double $$5 = this.af.k() * 0.2;
            double $$6 = this.af.k() * 0.2;
            this.dS().a(ln.ab, $$2.d, $$2.e, $$2.f, $$4, $$5, $$6);
         }

         this.a(dzl.u);
      }
   }

   private void c(bto $$0) {
      double $$1 = $$0.dx() - this.dx();
      double $$2 = $$0.dD() - this.dD();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(awe.vf, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cg = 40;
      }

      super.b($$0);
   }

   public int t() {
      return this.cf;
   }

   public int gp() {
      return this.cg;
   }

   public int gz() {
      return this.ch;
   }

   @Override
   public boolean E(bto $$0) {
      this.cf = 10;
      this.dS().a(this, (byte)4);
      this.a(awe.vf, 1.0F, 1.0F);
      return super.E($$0);
   }

   @Nullable
   @Override
   protected awd w() {
      return awe.ve;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.vi;
   }

   @Override
   protected awd n_() {
      return awe.vh;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.vj, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dej $$0) {
      return !$$0.d(this.cO());
   }

   @Override
   public void a(arh $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gq() {
      return false;
   }

   @Override
   protected eyn gh() {
      eyn $$0 = super.gh();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
