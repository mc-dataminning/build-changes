import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cce extends cga {
   private static final Predicate<blf> e = $$0 -> $$0.bx() && !($$0 instanceof cce);
   private static final double bT = 0.3;
   private static final double bU = 0.35;
   private static final int bV = 8356754;
   private static final double bW = 0.5725490196078431;
   private static final double bX = 0.5137254901960784;
   private static final double bY = 0.4980392156862745;
   private static final int bZ = 10;
   public static final int b = 40;
   private int ca;
   private int cb;
   private int cc;

   public cce(blj<? extends cce> $$0, csy $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bJ = 20;
      this.a(eek.v, 0.0F);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsl(this));
      this.bO.a(4, new btb(this, 1.0, true));
      this.bO.a(5, new bue(this, 0.4));
      this.bO.a(6, new bsz(this, cer.class, 6.0F));
      this.bO.a(10, new bsz(this, blx.class, 8.0F));
      this.bP.a(2, new buj(this, cga.class).a());
      this.bP.a(3, new buk<>(this, cer.class, true));
      this.bP.a(4, new buk<>(this, cdz.class, true, $$0 -> !$$0.o_()));
      this.bP.a(4, new buk<>(this, bxu.class, true));
   }

   @Override
   protected void T() {
      boolean $$0 = !(this.cN() instanceof blx) || this.cN().ai().a(aru.c);
      boolean $$1 = !(this.cZ() instanceof cgl);
      this.bO.a(bsr.a.a, $$0);
      this.bO.a(bsr.a.c, $$0 && $$1);
      this.bO.a(bsr.a.b, $$0);
      this.bO.a(bsr.a.d, $$0);
   }

   public static bna.a u() {
      return cbz.gk().a(bnb.l, 100.0).a(bnb.m, 0.3).a(bnb.i, 0.75).a(bnb.c, 12.0).a(bnb.d, 1.5).a(bnb.g, 32.0);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ca);
      $$0.a("StunTick", this.cb);
      $$0.a("RoarTick", this.cc);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.ca = $$0.h("AttackTick");
      this.cb = $$0.h("StunTick");
      this.cc = $$0.h("RoarTick");
   }

   @Override
   public arb af_() {
      return arc.ui;
   }

   @Override
   public int ab() {
      return 45;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, -0.0625F * $$2);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx()) {
         if (this.eY()) {
            this.a(bnb.m).a(0.0);
         } else {
            double $$0 = this.q() != null ? 0.35 : 0.3;
            double $$1 = this.a(bnb.m).b();
            this.a(bnb.m).a(aty.d(0.1, $$1, $$0));
         }

         if (this.P && this.dM().Y().b(csu.c)) {
            boolean $$2 = false;
            ekw $$3 = this.cH().g(0.2);

            for (hv $$4 : hv.b(aty.a($$3.a), aty.a($$3.b), aty.a($$3.c), aty.a($$3.d), aty.a($$3.e), aty.a($$3.f))) {
               dip $$5 = this.dM().a_($$4);
               cvz $$6 = $$5.b();
               if ($$6 instanceof dai) {
                  $$2 = this.dM().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aC()) {
               this.fb();
            }
         }

         if (this.cc > 0) {
            this.cc--;
            if (this.cc == 10) {
               this.gq();
            }
         }

         if (this.ca > 0) {
            this.ca--;
         }

         if (this.cb > 0) {
            this.cb--;
            this.gp();
            if (this.cb == 0) {
               this.a(arc.un, 1.0F, 1.0F);
               this.cc = 20;
            }
         }
      }
   }

   private void gp() {
      if (this.ag.a(6) == 0) {
         double $$0 = this.dr() - (double)this.dg() * Math.sin((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         double $$1 = this.dt() + (double)this.dh() - 0.3;
         double $$2 = this.dx() + (double)this.dg() * Math.cos((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         this.dM().a(jv.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   protected boolean eY() {
      return super.eY() || this.ca > 0 || this.cb > 0 || this.cc > 0;
   }

   @Override
   public boolean E(blf $$0) {
      return this.cb <= 0 && this.cc <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(blv $$0) {
      if (this.cc == 0) {
         if (this.ag.j() < 0.5) {
            this.cb = 40;
            this.a(arc.um, 1.0F, 1.0F);
            this.dM().a(this, (byte)39);
            $$0.g((blf)this);
         } else {
            this.a($$0);
         }

         $$0.T = true;
      }
   }

   private void gq() {
      if (this.bx()) {
         for (blv $$1 : this.dM().a(blv.class, this.cH().g(4.0), e)) {
            if (!($$1 instanceof cbh)) {
               $$1.a(this.dN().b((blv)this), 6.0F);
            }

            this.a($$1);
         }

         elb $$2 = this.cH().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ag.k() * 0.2;
            double $$5 = this.ag.k() * 0.2;
            double $$6 = this.ag.k() * 0.2;
            this.dM().a(jv.Y, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dmz.u);
      }
   }

   private void a(blf $$0) {
      double $$1 = $$0.dr() - this.dr();
      double $$2 = $$0.dx() - this.dx();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ca = 10;
         this.a(arc.uh, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cb = 40;
      }

      super.b($$0);
   }

   public int w() {
      return this.ca;
   }

   public int ge() {
      return this.cb;
   }

   public int go() {
      return this.cc;
   }

   @Override
   public boolean C(blf $$0) {
      this.ca = 10;
      this.dM().a(this, (byte)4);
      this.a(arc.uh, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected arb y() {
      return arc.ug;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.uk;
   }

   @Override
   protected arb n_() {
      return arc.uj;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.ul, 0.15F, 1.0F);
   }

   @Override
   public boolean a(ctb $$0) {
      return !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gf() {
      return false;
   }

   @Override
   protected ekw fX() {
      ekw $$0 = super.fX();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
