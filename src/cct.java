import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cct extends cgq {
   private static final Predicate<blu> e = $$0 -> $$0.bx() && !($$0 instanceof cct);
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

   public cct(bly<? extends cct> $$0, cto $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bJ = 20;
      this.a(efb.v, 0.0F);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bta(this));
      this.bO.a(4, new btq(this, 1.0, true));
      this.bO.a(5, new but(this, 0.4));
      this.bO.a(6, new bto(this, cfh.class, 6.0F));
      this.bO.a(10, new bto(this, bmm.class, 8.0F));
      this.bP.a(2, new buy(this, cgq.class).a());
      this.bP.a(3, new buz<>(this, cfh.class, true));
      this.bP.a(4, new buz<>(this, cep.class, true, $$0 -> !$$0.o_()));
      this.bP.a(4, new buz<>(this, byj.class, true));
   }

   @Override
   protected void T() {
      boolean $$0 = !(this.cN() instanceof bmm) || this.cN().ai().a(asj.c);
      boolean $$1 = !(this.cZ() instanceof chb);
      this.bO.a(btg.a.a, $$0);
      this.bO.a(btg.a.c, $$0 && $$1);
      this.bO.a(btg.a.b, $$0);
      this.bO.a(btg.a.d, $$0);
   }

   public static bnp.a u() {
      return cco.gk().a(bnq.l, 100.0).a(bnq.m, 0.3).a(bnq.i, 0.75).a(bnq.c, 12.0).a(bnq.d, 1.5).a(bnq.g, 32.0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ca);
      $$0.a("StunTick", this.cb);
      $$0.a("RoarTick", this.cc);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.ca = $$0.h("AttackTick");
      this.cb = $$0.h("StunTick");
      this.cc = $$0.h("RoarTick");
   }

   @Override
   public arq af_() {
      return arr.ui;
   }

   @Override
   public int ab() {
      return 45;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, -0.0625F * $$2);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx()) {
         if (this.eY()) {
            this.a(bnq.m).a(0.0);
         } else {
            double $$0 = this.q() != null ? 0.35 : 0.3;
            double $$1 = this.a(bnq.m).b();
            this.a(bnq.m).a(aun.d(0.1, $$1, $$0));
         }

         if (this.P && this.dM().Z().b(ctk.c)) {
            boolean $$2 = false;
            eln $$3 = this.cH().g(0.2);

            for (hx $$4 : hx.b(aun.a($$3.a), aun.a($$3.b), aun.a($$3.c), aun.a($$3.d), aun.a($$3.e), aun.a($$3.f))) {
               djg $$5 = this.dM().a_($$4);
               cwp $$6 = $$5.b();
               if ($$6 instanceof day) {
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
               this.a(arr.un, 1.0F, 1.0F);
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
         this.dM().a(jx.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   protected boolean eY() {
      return super.eY() || this.ca > 0 || this.cb > 0 || this.cc > 0;
   }

   @Override
   public boolean E(blu $$0) {
      return this.cb <= 0 && this.cc <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bmk $$0) {
      if (this.cc == 0) {
         if (this.ag.j() < 0.5) {
            this.cb = 40;
            this.a(arr.um, 1.0F, 1.0F);
            this.dM().a(this, (byte)39);
            $$0.g((blu)this);
         } else {
            this.a($$0);
         }

         $$0.T = true;
      }
   }

   private void gq() {
      if (this.bx()) {
         for (bmk $$1 : this.dM().a(bmk.class, this.cH().g(4.0), e)) {
            if (!($$1 instanceof cbw)) {
               $$1.a(this.dN().b((bmk)this), 6.0F);
            }

            this.a($$1);
         }

         els $$2 = this.cH().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ag.k() * 0.2;
            double $$5 = this.ag.k() * 0.2;
            double $$6 = this.ag.k() * 0.2;
            this.dM().a(jx.Y, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dnq.u);
      }
   }

   private void a(blu $$0) {
      double $$1 = $$0.dr() - this.dr();
      double $$2 = $$0.dx() - this.dx();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ca = 10;
         this.a(arr.uh, 1.0F, 1.0F);
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
   public boolean C(blu $$0) {
      this.ca = 10;
      this.dM().a(this, (byte)4);
      this.a(arr.uh, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected arq y() {
      return arr.ug;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.uk;
   }

   @Override
   protected arq n_() {
      return arr.uj;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.ul, 0.15F, 1.0F);
   }

   @Override
   public boolean a(ctr $$0) {
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
   protected eln fX() {
      eln $$0 = super.fX();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
