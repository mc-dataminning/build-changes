import java.util.EnumSet;

public class buc<T extends ccj & ccn & cbw> extends btb {
   public static final bjg a = avj.a(1, 2);
   private final T b;
   private buc.a c = buc.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public buc(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(btb.a.a, btb.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cmu.vM);
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
      if (this.b.fn()) {
         this.b.ft();
         this.b.b(false);
         ckz.a(this.b.fp(), false);
      }
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      bmf $$0 = this.b.q();
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
               this.h = a.a(this.b.eg());
            }
         } else {
            this.h = 0;
            this.b.N().n();
         }

         this.b.I().a($$0, 30.0F, 30.0F);
         if (this.c == buc.a.a) {
            if (!$$4) {
               this.b.c(cfu.a(this.b, cmu.vM));
               this.c = buc.a.b;
               this.b.b(true);
            }
         } else if (this.c == buc.a.b) {
            if (!this.b.fn()) {
               this.c = buc.a.a;
            }

            int $$5 = this.b.fr();
            cmr $$6 = this.b.fp();
            if ($$5 >= ckz.k($$6)) {
               this.b.fs();
               this.c = buc.a.c;
               this.g = 20 + this.b.eg().a(20);
               this.b.b(false);
            }
         } else if (this.c == buc.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = buc.a.d;
            }
         } else if (this.c == buc.a.d && $$1) {
            this.b.a($$0, 1.0F);
            cmr $$7 = this.b.b(cfu.a(this.b, cmu.vM));
            ckz.a($$7, false);
            this.c = buc.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == buc.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
