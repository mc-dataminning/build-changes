import java.util.EnumSet;

public class cfg<T extends cok & cop & cnx> extends cef {
   public static final btr a = baq.a(1, 2);
   private final T b;
   private cfg.a c = cfg.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cfg(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(cef.a.a, cef.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(czo.xg);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.O().k()) && this.h();
   }

   private boolean i() {
      return this.b.f() != null && this.b.f().bI();
   }

   @Override
   public void e() {
      super.e();
      this.b.v(false);
      this.b.g(null);
      this.f = 0;
      if (this.b.fy()) {
         this.b.fE();
         this.b.b(false);
         this.b.fA().b(kk.P, dbo.a);
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void a() {
      bxj $$0 = this.b.f();
      if ($$0 != null) {
         boolean $$1 = this.b.P().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.g((bwi)$$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.O().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.dX());
            }
         } else {
            this.h = 0;
            this.b.O().m();
         }

         this.b.J().a($$0, 30.0F, 30.0F);
         if (this.c == cfg.a.a) {
            if (!$$4) {
               this.b.c(csg.a(this.b, czo.xg));
               this.c = cfg.a.b;
               this.b.b(true);
            }
         } else if (this.c == cfg.a.b) {
            if (!this.b.fy()) {
               this.c = cfg.a.a;
            }

            int $$5 = this.b.fC();
            czk $$6 = this.b.fA();
            if ($$5 >= cyd.b($$6, this.b)) {
               this.b.fD();
               this.c = cfg.a.c;
               this.g = 20 + this.b.dX().a(20);
               this.b.b(false);
            }
         } else if (this.c == cfg.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cfg.a.d;
            }
         } else if (this.c == cfg.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cfg.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cfg.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
