import java.util.EnumSet;

public class cfb<T extends cod & coh & cnq> extends cea {
   public static final bto a = baq.a(1, 2);
   private final T b;
   private cfb.a c = cfb.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cfb(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(cea.a.a, cea.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(czh.xg);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.O().k()) && this.h();
   }

   private boolean i() {
      return this.b.f() != null && this.b.f().bK();
   }

   @Override
   public void e() {
      super.e();
      this.b.v(false);
      this.b.g(null);
      this.f = 0;
      if (this.b.fz()) {
         this.b.fF();
         this.b.b(false);
         this.b.fB().b(kj.P, dbh.a);
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void a() {
      bxe $$0 = this.b.f();
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

         double $$3 = this.b.g((bwf)$$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.O().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.dY());
            }
         } else {
            this.h = 0;
            this.b.O().m();
         }

         this.b.J().a($$0, 30.0F, 30.0F);
         if (this.c == cfb.a.a) {
            if (!$$4) {
               this.b.c(crz.a(this.b, czh.xg));
               this.c = cfb.a.b;
               this.b.b(true);
            }
         } else if (this.c == cfb.a.b) {
            if (!this.b.fz()) {
               this.c = cfb.a.a;
            }

            int $$5 = this.b.fD();
            czd $$6 = this.b.fB();
            if ($$5 >= cxw.b($$6, this.b)) {
               this.b.fE();
               this.c = cfb.a.c;
               this.g = 20 + this.b.dY().a(20);
               this.b.b(false);
            }
         } else if (this.c == cfb.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cfb.a.d;
            }
         } else if (this.c == cfb.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cfb.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cfb.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
