import java.util.EnumSet;
import org.joml.Vector3f;

public class bzc extends bix implements bza {
   private static final aef<Boolean> b = aei.a(bzc.class, aeh.k);
   private int c = 1;

   public bzc(biu<? extends bzc> $$0, cpv $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new bzc.b(this);
   }

   @Override
   protected void z() {
      this.bO.a(5, new bzc.d(this));
      this.bO.a(7, new bzc.a(this));
      this.bO.a(7, new bzc.c(this));
      this.bP.a(1, new bru<>(this, cbu.class, 10, true, false, $$0 -> Math.abs($$0.ds() - this.ds()) <= 4.0));
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
   protected boolean W() {
      return true;
   }

   private static boolean h(bho $$0) {
      return $$0.c() instanceof cck && $$0.d() instanceof cbu;
   }

   @Override
   public boolean b(bho $$0) {
      return !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (h($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, false);
   }

   public static bkl.a y() {
      return bji.A().a(bkm.a, 10.0).a(bkm.b, 100.0);
   }

   @Override
   public apf db() {
      return apf.f;
   }

   @Override
   protected apd w() {
      return ape.jd;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.jf;
   }

   @Override
   protected apd l_() {
      return ape.je;
   }

   @Override
   protected float eV() {
      return 5.0F;
   }

   public static boolean b(biu<bzc> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.ai() != bgv.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fH() {
      return 1;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(biq $$0) {
      return 0.5F;
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return 2.6F;
   }

   static class a extends bqb {
      private final bzc a;

      public a(bzc $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bqb.a.b));
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.q() == null) {
            ehn $$0 = this.a.do();
            this.a.r(-((float)arx.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aU = this.a.dB();
         } else {
            bjg $$1 = this.a.q();
            double $$2 = 64.0;
            if ($$1.f(this.a) < 4096.0) {
               double $$3 = $$1.dq() - this.a.dq();
               double $$4 = $$1.dw() - this.a.dw();
               this.a.r(-((float)arx.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aU = this.a.dB();
            }
         }
      }
   }

   static class b extends bpe {
      private final bzc l;
      private int m;

      public b(bzc $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bpe.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.ef().a(5) + 2;
               ehn $$0 = new ehn(this.e - this.l.dq(), this.f - this.l.ds(), this.g - this.l.dw());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, arx.c($$1))) {
                  this.l.f(this.l.do().e($$0.a(0.1)));
               } else {
                  this.k = bpe.a.a;
               }
            }
         }
      }

      private boolean a(ehn $$0, int $$1) {
         ehi $$2 = this.l.cH();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dL().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bqb {
      private final bzc b;
      public int a;

      public c(bzc $$0) {
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
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         bjg $$0 = this.b.q();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.f(this.b) < 4096.0 && this.b.E($$0)) {
               cpv $$2 = this.b.dL();
               this.a++;
               if (this.a == 10 && !this.b.aT()) {
                  $$2.a(null, 1015, this.b.dl(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  ehn $$4 = this.b.f(1.0F);
                  double $$5 = $$0.dq() - (this.b.dq() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dw() - (this.b.dw() + $$4.e * 4.0);
                  if (!this.b.aT()) {
                     $$2.a(null, 1016, this.b.dl(), 0);
                  }

                  cck $$8 = new cck($$2, this.b, $$5, $$6, $$7, this.b.t());
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

   static class d extends bqb {
      private final bzc a;

      public d(bzc $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bqb.a.a));
      }

      @Override
      public boolean a() {
         bpe $$0 = this.a.I();
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
         asc $$0 = this.a.ef();
         double $$1 = this.a.dq() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.ds() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dw() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.I().a($$1, $$2, $$3, 1.0);
      }
   }
}
