import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbs extends cfh {
   private static final Predicate<bkv> e = $$0 -> $$0.bx() && !($$0 instanceof cbs);
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

   public cbs(bkz<? extends cbs> $$0, csf $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bJ = 20;
      this.a(edi.v, 0.0F);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsa(this));
      this.bO.a(4, new bsq(this, 1.0, true));
      this.bO.a(5, new btt(this, 0.4));
      this.bO.a(6, new bso(this, cdz.class, 6.0F));
      this.bO.a(10, new bso(this, bln.class, 8.0F));
      this.bP.a(2, new bty(this, cfh.class).a());
      this.bP.a(3, new btz<>(this, cdz.class, true));
      this.bP.a(4, new btz<>(this, cdh.class, true, $$0 -> !$$0.o_()));
      this.bP.a(4, new btz<>(this, bxi.class, true));
   }

   @Override
   protected void T() {
      boolean $$0 = !(this.cO() instanceof bln) || this.cO().ai().a(arn.c);
      boolean $$1 = !(this.da() instanceof cfs);
      this.bO.a(bsg.a.a, $$0);
      this.bO.a(bsg.a.c, $$0 && $$1);
      this.bO.a(bsg.a.b, $$0);
      this.bO.a(bsg.a.d, $$0);
   }

   public static bmq.a u() {
      return cbn.gl().a(bmr.l, 100.0).a(bmr.m, 0.3).a(bmr.i, 0.75).a(bmr.c, 12.0).a(bmr.d, 1.5).a(bmr.g, 32.0);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ca);
      $$0.a("StunTick", this.cb);
      $$0.a("RoarTick", this.cc);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.ca = $$0.h("AttackTick");
      this.cb = $$0.h("StunTick");
      this.cc = $$0.h("RoarTick");
   }

   @Override
   public aqu af_() {
      return aqv.tN;
   }

   @Override
   public int ab() {
      return 45;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, -0.0625F * $$2);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx()) {
         if (this.eZ()) {
            this.a(bmr.m).a(0.0);
         } else {
            double $$0 = this.q() != null ? 0.35 : 0.3;
            double $$1 = this.a(bmr.m).b();
            this.a(bmr.m).a(atq.d(0.1, $$1, $$0));
         }

         if (this.P && this.dN().Y().b(csb.c)) {
            boolean $$2 = false;
            eju $$3 = this.cH().g(0.2);

            for (hx $$4 : hx.b(atq.a($$3.a), atq.a($$3.b), atq.a($$3.c), atq.a($$3.d), atq.a($$3.e), atq.a($$3.f))) {
               dhn $$5 = this.dN().a_($$4);
               cvf $$6 = $$5.b();
               if ($$6 instanceof czo) {
                  $$2 = this.dN().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aC()) {
               this.fc();
            }
         }

         if (this.cc > 0) {
            this.cc--;
            if (this.cc == 10) {
               this.gr();
            }
         }

         if (this.ca > 0) {
            this.ca--;
         }

         if (this.cb > 0) {
            this.cb--;
            this.gq();
            if (this.cb == 0) {
               this.a(aqv.tS, 1.0F, 1.0F);
               this.cc = 20;
            }
         }
      }
   }

   private void gq() {
      if (this.ag.a(6) == 0) {
         double $$0 = this.ds() - (double)this.dh() * Math.sin((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         double $$1 = this.du() + (double)this.di() - 0.3;
         double $$2 = this.dy() + (double)this.dh() * Math.cos((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         this.dN().a(jw.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   protected boolean eZ() {
      return super.eZ() || this.ca > 0 || this.cb > 0 || this.cc > 0;
   }

   @Override
   public boolean E(bkv $$0) {
      return this.cb <= 0 && this.cc <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bll $$0) {
      if (this.cc == 0) {
         if (this.ag.j() < 0.5) {
            this.cb = 40;
            this.a(aqv.tR, 1.0F, 1.0F);
            this.dN().a(this, (byte)39);
            $$0.g((bkv)this);
         } else {
            this.a($$0);
         }

         $$0.T = true;
      }
   }

   private void gr() {
      if (this.bx()) {
         for (bll $$1 : this.dN().a(bll.class, this.cH().g(4.0), e)) {
            if (!($$1 instanceof cav)) {
               $$1.a(this.dO().b((bll)this), 6.0F);
            }

            this.a($$1);
         }

         ejz $$2 = this.cH().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ag.k() * 0.2;
            double $$5 = this.ag.k() * 0.2;
            double $$6 = this.ag.k() * 0.2;
            this.dN().a(jw.W, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dlx.u);
      }
   }

   private void a(bkv $$0) {
      double $$1 = $$0.ds() - this.ds();
      double $$2 = $$0.dy() - this.dy();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ca = 10;
         this.a(aqv.tM, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cb = 40;
      }

      super.b($$0);
   }

   public int w() {
      return this.ca;
   }

   public int gf() {
      return this.cb;
   }

   public int gp() {
      return this.cc;
   }

   @Override
   public boolean C(bkv $$0) {
      this.ca = 10;
      this.dN().a(this, (byte)4);
      this.a(aqv.tM, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected aqu y() {
      return aqv.tL;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.tP;
   }

   @Override
   protected aqu n_() {
      return aqv.tO;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.tQ, 0.15F, 1.0F);
   }

   @Override
   public boolean a(csi $$0) {
      return !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gg() {
      return false;
   }

   @Override
   protected eju fY() {
      eju $$0 = super.fY();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
