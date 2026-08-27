import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfl extends cjk {
   private static final Predicate<bof> e = $$0 -> $$0.bx() && !($$0 instanceof cfl);
   private static final double bV = 0.3;
   private static final double bW = 0.35;
   private static final int bX = 8356754;
   private static final double bY = 0.5725490196078431;
   private static final double bZ = 0.5137254901960784;
   private static final double ca = 0.4980392156862745;
   private static final int cb = 10;
   public static final int b = 40;
   private int cc;
   private int cd;
   private int ce;

   public cfl(bol<? extends cfl> $$0, cwe $$1) {
      super($$0, $$1);
      this.bK = 20;
      this.a(eic.v, 0.0F);
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bvo(this));
      this.bP.a(4, new bwe(this, 1.0, true));
      this.bP.a(5, new bxh(this, 0.4));
      this.bP.a(6, new bwc(this, cia.class, 6.0F));
      this.bP.a(10, new bwc(this, boz.class, 8.0F));
      this.bQ.a(2, new bxm(this, cjk.class).a());
      this.bQ.a(3, new bxn<>(this, cia.class, true));
      this.bQ.a(4, new bxn<>(this, chi.class, true, $$0 -> !$$0.o_()));
      this.bQ.a(4, new bxn<>(this, cay.class, true));
   }

   @Override
   protected void T() {
      boolean $$0 = !(this.cK() instanceof boz) || this.cK().ai().a(auh.c);
      boolean $$1 = !(this.cW() instanceof cjv);
      this.bP.a(bvu.a.a, $$0);
      this.bP.a(bvu.a.c, $$0 && $$1);
      this.bP.a(bvu.a.b, $$0);
      this.bP.a(bvu.a.d, $$0);
   }

   public static bqd.a u() {
      return cfg.gr().a(bqe.n, 100.0).a(bqe.o, 0.3).a(bqe.k, 0.75).a(bqe.c, 12.0).a(bqe.d, 1.5).a(bqe.i, 32.0).a(bqe.r, 1.0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.cc);
      $$0.a("StunTick", this.cd);
      $$0.a("RoarTick", this.ce);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.cc = $$0.h("AttackTick");
      this.cd = $$0.h("StunTick");
      this.ce = $$0.h("RoarTick");
   }

   @Override
   public ato ag_() {
      return atp.uy;
   }

   @Override
   public int fJ() {
      return 45;
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx()) {
         if (this.fa()) {
            this.f(bqe.o).a(0.0);
         } else {
            double $$0 = this.q() != null ? 0.35 : 0.3;
            double $$1 = this.f(bqe.o).b();
            this.f(bqe.o).a(awm.d(0.1, $$1, $$0));
         }

         if (this.O && this.dJ().Z().b(cwa.c)) {
            boolean $$2 = false;
            eoq $$3 = this.cE().g(0.2);

            for (ib $$4 : ib.b(awm.a($$3.a), awm.a($$3.b), awm.a($$3.c), awm.a($$3.d), awm.a($$3.e), awm.a($$3.f))) {
               dme $$5 = this.dJ().a_($$4);
               czf $$6 = $$5.b();
               if ($$6 instanceof ddo) {
                  $$2 = this.dJ().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aC()) {
               this.fd();
            }
         }

         if (this.ce > 0) {
            this.ce--;
            if (this.ce == 10) {
               this.gx();
            }
         }

         if (this.cc > 0) {
            this.cc--;
         }

         if (this.cd > 0) {
            this.cd--;
            this.gw();
            if (this.cd == 0) {
               this.a(atp.uD, 1.0F, 1.0F);
               this.ce = 20;
            }
         }
      }
   }

   private void gw() {
      if (this.af.a(6) == 0) {
         double $$0 = this.do() - (double)this.dd() * Math.sin((double)(this.aV * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         double $$1 = this.dq() + (double)this.de() - 0.3;
         double $$2 = this.du() + (double)this.dd() * Math.cos((double)(this.aV * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         this.dJ().a(kb.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   protected boolean fa() {
      return super.fa() || this.cc > 0 || this.cd > 0 || this.ce > 0;
   }

   @Override
   public boolean D(bof $$0) {
      return this.cd <= 0 && this.ce <= 0 ? super.D($$0) : false;
   }

   @Override
   protected void e(box $$0) {
      if (this.ce == 0) {
         if (this.af.j() < 0.5) {
            this.cd = 40;
            this.a(atp.uC, 1.0F, 1.0F);
            this.dJ().a(this, (byte)39);
            $$0.g((bof)this);
         } else {
            this.a($$0);
         }

         $$0.S = true;
      }
   }

   private void gx() {
      if (this.bx()) {
         for (box $$1 : this.dJ().a(box.class, this.cE().g(4.0), e)) {
            if (!($$1 instanceof ceo)) {
               $$1.a(this.dK().b((box)this), 6.0F);
            }

            this.a($$1);
         }

         eov $$2 = this.cE().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.af.k() * 0.2;
            double $$5 = this.af.k() * 0.2;
            double $$6 = this.af.k() * 0.2;
            this.dJ().a(kb.Y, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.b(dqr.u);
      }
   }

   private void a(bof $$0) {
      double $$1 = $$0.do() - this.do();
      double $$2 = $$0.du() - this.du();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cc = 10;
         this.a(atp.ux, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cd = 40;
      }

      super.b($$0);
   }

   public int w() {
      return this.cc;
   }

   public int gl() {
      return this.cd;
   }

   public int gv() {
      return this.ce;
   }

   @Override
   public boolean B(bof $$0) {
      this.cc = 10;
      this.dJ().a(this, (byte)4);
      this.a(atp.ux, 1.0F, 1.0F);
      return super.B($$0);
   }

   @Nullable
   @Override
   protected ato y() {
      return atp.uw;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.uA;
   }

   @Override
   protected ato n_() {
      return atp.uz;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.uB, 0.15F, 1.0F);
   }

   @Override
   public boolean a(cwh $$0) {
      return !$$0.d(this.cE());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gm() {
      return false;
   }

   @Override
   protected eoq ge() {
      eoq $$0 = super.ge();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
