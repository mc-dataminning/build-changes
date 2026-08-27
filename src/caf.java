import java.util.EnumSet;
import org.joml.Vector3f;

public class caf extends bka implements cad {
   private static final afc<Boolean> b = aff.a(caf.class, afe.k);
   private int c = 1;

   public caf(bjx<? extends caf> $$0, cqz $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new caf.b(this);
   }

   @Override
   protected void z() {
      this.bO.a(5, new caf.d(this));
      this.bO.a(7, new caf.a(this));
      this.bO.a(7, new caf.c(this));
      this.bP.a(1, new bsx<>(this, ccx.class, 10, true, false, $$0 -> Math.abs($$0.ds() - this.ds()) <= 4.0));
   }

   public boolean s() {
      return this.an.b(b);
   }

   public void w(boolean $$0) {
      this.an.b(b, $$0);
   }

   public int t() {
      return this.c;
   }

   @Override
   protected boolean V() {
      return true;
   }

   private static boolean h(bir $$0) {
      return $$0.c() instanceof cdn && $$0.d() instanceof ccx;
   }

   @Override
   public boolean b(bir $$0) {
      return !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      if (h($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, false);
   }

   public static blo.a y() {
      return bkl.A().a(blp.l, 10.0).a(blp.g, 100.0);
   }

   @Override
   public aqe da() {
      return aqe.f;
   }

   @Override
   protected aqc w() {
      return aqd.jf;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.jh;
   }

   @Override
   protected aqc m_() {
      return aqd.jg;
   }

   @Override
   protected float eV() {
      return 5.0F;
   }

   public static boolean b(bjx<caf> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.ai() != bhy.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fI() {
      return 1;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(bjt $$0) {
      return 0.5F;
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return 2.6F;
   }

   static class a extends bre {
      private final caf a;

      public a(caf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bre.a.b));
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.q() == null) {
            eif $$0 = this.a.do();
            this.a.r(-((float)asy.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aU = this.a.dB();
         } else {
            bkj $$1 = this.a.q();
            double $$2 = 64.0;
            if ($$1.f(this.a) < 4096.0) {
               double $$3 = $$1.dq() - this.a.dq();
               double $$4 = $$1.dw() - this.a.dw();
               this.a.r(-((float)asy.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aU = this.a.dB();
            }
         }
      }
   }

   static class b extends bqh {
      private final caf l;
      private int m;

      public b(caf $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bqh.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.ef().a(5) + 2;
               eif $$0 = new eif(this.e - this.l.dq(), this.f - this.l.ds(), this.g - this.l.dw());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, asy.c($$1))) {
                  this.l.f(this.l.do().e($$0.a(0.1)));
               } else {
                  this.k = bqh.a.a;
               }
            }
         }
      }

      private boolean a(eif $$0, int $$1) {
         eia $$2 = this.l.cG();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dL().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bre {
      private final caf b;
      public int a;

      public c(caf $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.q() != null;
      }

      @Override
      public void c() {
         this.a = 0;
      }

      @Override
      public void d() {
         this.b.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bkj $$0 = this.b.q();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.f(this.b) < 4096.0 && this.b.E($$0)) {
               cqz $$2 = this.b.dL();
               this.a++;
               if (this.a == 10 && !this.b.aS()) {
                  $$2.a(null, 1015, this.b.dl(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  eif $$4 = this.b.f(1.0F);
                  double $$5 = $$0.dq() - (this.b.dq() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dw() - (this.b.dw() + $$4.e * 4.0);
                  if (!this.b.aS()) {
                     $$2.a(null, 1016, this.b.dl(), 0);
                  }

                  cdn $$8 = new cdn($$2, this.b, $$5, $$6, $$7, this.b.t());
                  $$8.e(this.b.dq() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$8.dw() + $$4.e * 4.0);
                  $$2.b($$8);
                  this.a = -40;
               }
            } else if (this.a > 0) {
               this.a--;
            }

            this.b.w(this.a > 10);
         }
      }
   }

   static class d extends bre {
      private final caf a;

      public d(caf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bre.a.a));
      }

      @Override
      public boolean a() {
         bqh $$0 = this.a.I();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.dq();
            double $$2 = $$0.e() - this.a.ds();
            double $$3 = $$0.f() - this.a.dw();
            double $$4 = $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
            return $$4 < 1.0 || $$4 > 3600.0;
         }
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         ate $$0 = this.a.ef();
         double $$1 = this.a.dq() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.ds() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dw() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.I().a($$1, $$2, $$3, 1.0);
      }
   }
}
