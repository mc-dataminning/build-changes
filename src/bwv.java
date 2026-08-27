import java.util.EnumSet;

public class bwv<T extends cfg & cfk & cet> extends bvu {
   public static final blw a = axl.a(1, 2);
   private final T b;
   private bwv.a c = bwv.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public bwv(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(bvu.a.a, bvu.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cpt.vP);
   }

   @Override
   public boolean b() {
      return this.i() && (this.a() || !this.b.N().l()) && this.h();
   }

   private boolean i() {
      return this.b.q() != null && this.b.q().bx();
   }

   @Override
   public void d() {
      super.d();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fp()) {
         this.b.fv();
         this.b.b(false);
         coa.a(this.b.fr(), false);
      }
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      box $$0 = this.b.q();
      if ($$0 != null) {
         boolean $$1 = this.b.O().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.f($$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.N().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.ef());
            }
         } else {
            this.h = 0;
            this.b.N().n();
         }

         this.b.I().a($$0, 30.0F, 30.0F);
         if (this.c == bwv.a.a) {
            if (!$$4) {
               this.b.c(ciu.a(this.b, cpt.vP));
               this.c = bwv.a.b;
               this.b.b(true);
            }
         } else if (this.c == bwv.a.b) {
            if (!this.b.fp()) {
               this.c = bwv.a.a;
            }

            int $$5 = this.b.ft();
            cpq $$6 = this.b.fr();
            if ($$5 >= coa.k($$6)) {
               this.b.fu();
               this.c = bwv.a.c;
               this.g = 20 + this.b.ef().a(20);
               this.b.b(false);
            }
         } else if (this.c == bwv.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = bwv.a.d;
            }
         } else if (this.c == bwv.a.d && $$1) {
            this.b.a($$0, 1.0F);
            cpq $$7 = this.b.b(ciu.a(this.b, cpt.vP));
            coa.a($$7, false);
            this.c = bwv.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == bwv.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
