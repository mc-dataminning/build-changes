import java.util.EnumSet;
import org.joml.Vector3f;

public class cbh extends blc implements cbf {
   private static final afs<Boolean> b = afv.a(cbh.class, afu.k);
   private int c = 1;

   public cbh(bkz<? extends cbh> $$0, csf $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new cbh.b(this);
   }

   @Override
   protected void B() {
      this.bO.a(5, new cbh.d(this));
      this.bO.a(7, new cbh.a(this));
      this.bO.a(7, new cbh.c(this));
      this.bP.a(1, new btz<>(this, cdz.class, 10, true, false, $$0 -> Math.abs($$0.du() - this.du()) <= 4.0));
   }

   @Override
   public boolean u() {
      return this.an.b(b);
   }

   public void w(boolean $$0) {
      this.an.b(b, $$0);
   }

   public int w() {
      return this.c;
   }

   @Override
   protected boolean X() {
      return true;
   }

   private static boolean h(bjt $$0) {
      return $$0.c() instanceof cep && $$0.d() instanceof cdz;
   }

   @Override
   public boolean b(bjt $$0) {
      return !h($$0) && super.b($$0);
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (h($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
   }

   public static bmq.a A() {
      return bln.C().a(bmr.l, 10.0).a(bmr.g, 100.0);
   }

   @Override
   public aqw dc() {
      return aqw.f;
   }

   @Override
   protected aqu y() {
      return aqv.jx;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.jz;
   }

   @Override
   protected aqu n_() {
      return aqv.jy;
   }

   @Override
   protected float eX() {
      return 5.0F;
   }

   public static boolean b(bkz<cbh> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.aj() != biy.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fJ() {
      return 1;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(bkv $$0) {
      return 0.5F;
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return 2.6F;
   }

   static class a extends bsg {
      private final cbh a;

      public a(cbh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsg.a.b));
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.q() == null) {
            ejz $$0 = this.a.dq();
            this.a.r(-((float)atq.d($$0.c, $$0.e)) * (180.0F / (float)Math.PI));
            this.a.aU = this.a.dD();
         } else {
            bll $$1 = this.a.q();
            double $$2 = 64.0;
            if ($$1.f(this.a) < 4096.0) {
               double $$3 = $$1.ds() - this.a.ds();
               double $$4 = $$1.dy() - this.a.dy();
               this.a.r(-((float)atq.d($$3, $$4)) * (180.0F / (float)Math.PI));
               this.a.aU = this.a.dD();
            }
         }
      }
   }

   static class b extends brj {
      private final cbh l;
      private int m;

      public b(cbh $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == brj.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.eh().a(5) + 2;
               ejz $$0 = new ejz(this.e - this.l.ds(), this.f - this.l.du(), this.g - this.l.dy());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, atq.c($$1))) {
                  this.l.g(this.l.dq().e($$0.a(0.1)));
               } else {
                  this.k = brj.a.a;
               }
            }
         }
      }

      private boolean a(ejz $$0, int $$1) {
         eju $$2 = this.l.cH();

         for (int $$3 = 1; $$3 < $$1; $$3++) {
            $$2 = $$2.c($$0);
            if (!this.l.dN().a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bsg {
      private final cbh b;
      public int a;

      public c(cbh $$0) {
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
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         bll $$0 = this.b.q();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.f(this.b) < 4096.0 && this.b.E($$0)) {
               csf $$2 = this.b.dN();
               this.a++;
               if (this.a == 10 && !this.b.aU()) {
                  $$2.a(null, 1015, this.b.dn(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  ejz $$4 = this.b.f(1.0F);
                  double $$5 = $$0.ds() - (this.b.ds() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dy() - (this.b.dy() + $$4.e * 4.0);
                  if (!this.b.aU()) {
                     $$2.a(null, 1016, this.b.dn(), 0);
                  }

                  cep $$8 = new cep($$2, this.b, $$5, $$6, $$7, this.b.w());
                  $$8.a_(this.b.ds() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$8.dy() + $$4.e * 4.0);
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

   static class d extends bsg {
      private final cbh a;

      public d(cbh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean a() {
         brj $$0 = this.a.K();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.ds();
            double $$2 = $$0.e() - this.a.du();
            double $$3 = $$0.f() - this.a.dy();
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
         atw $$0 = this.a.eh();
         double $$1 = this.a.ds() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.du() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dy() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.K().a($$1, $$2, $$3, 1.0);
      }
   }
}
