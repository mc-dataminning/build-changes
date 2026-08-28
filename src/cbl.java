import java.util.EnumSet;

public class cbl<T extends ckb & ckf & cjo> extends cak {
   public static final bqb a = azo.a(1, 2);
   private final T b;
   private cbl.a c = cbl.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cbl(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(cak.a.a, cak.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cur.vW);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.J().l()) && this.h();
   }

   private boolean i() {
      return this.b.p() != null && this.b.p().bE();
   }

   @Override
   public void e() {
      super.e();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fs()) {
         this.b.fy();
         this.b.b(false);
         this.b.fu().b(kq.E, cxe.a);
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void a() {
      btl $$0 = this.b.p();
      if ($$0 != null) {
         boolean $$1 = this.b.L().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.g($$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.J().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.dT());
            }
         } else {
            this.h = 0;
            this.b.J().n();
         }

         this.b.F().a($$0, 30.0F, 30.0F);
         if (this.c == cbl.a.a) {
            if (!$$4) {
               this.b.c(cnp.a(this.b, cur.vW));
               this.c = cbl.a.b;
               this.b.b(true);
            }
         } else if (this.c == cbl.a.b) {
            if (!this.b.fs()) {
               this.c = cbl.a.a;
            }

            int $$5 = this.b.fw();
            cuo $$6 = this.b.fu();
            if ($$5 >= cta.a(this.b)) {
               this.b.fx();
               this.c = cbl.a.c;
               this.g = 20 + this.b.dT().a(20);
               this.b.b(false);
            }
         } else if (this.c == cbl.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cbl.a.d;
            }
         } else if (this.c == cbl.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cbl.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cbl.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
