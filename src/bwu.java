import java.util.EnumSet;

public class bwu<T extends cfg & cfk> extends bvu {
   private final T a;
   private final double b;
   private int c;
   private final float d;
   private int e = -1;
   private int f;
   private boolean g;
   private boolean h;
   private int i = -1;

   public bwu(T $$0, double $$1, int $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3 * $$3;
      this.a(EnumSet.of(bvu.a.a, bvu.a.b));
   }

   public void c(int $$0) {
      this.c = $$0;
   }

   @Override
   public boolean a() {
      return this.a.q() == null ? false : this.h();
   }

   protected boolean h() {
      return this.a.b(cpt.ot);
   }

   @Override
   public boolean b() {
      return (this.a() || !this.a.N().l()) && this.h();
   }

   @Override
   public void c() {
      super.c();
      this.a.v(true);
   }

   @Override
   public void d() {
      super.d();
      this.a.v(false);
      this.f = 0;
      this.e = -1;
      this.a.fv();
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      box $$0 = this.a.q();
      if ($$0 != null) {
         double $$1 = this.a.i($$0.do(), $$0.dq(), $$0.du());
         boolean $$2 = this.a.O().a($$0);
         boolean $$3 = this.f > 0;
         if ($$2 != $$3) {
            this.f = 0;
         }

         if ($$2) {
            this.f++;
         } else {
            this.f--;
         }

         if (!($$1 > (double)this.d) && this.f >= 20) {
            this.a.N().n();
            this.i++;
         } else {
            this.a.N().a($$0, this.b);
            this.i = -1;
         }

         if (this.i >= 20) {
            if ((double)this.a.ef().i() < 0.3) {
               this.g = !this.g;
            }

            if ((double)this.a.ef().i() < 0.3) {
               this.h = !this.h;
            }

            this.i = 0;
         }

         if (this.i > -1) {
            if ($$1 > (double)(this.d * 0.75F)) {
               this.h = false;
            } else if ($$1 < (double)(this.d * 0.25F)) {
               this.h = true;
            }

            this.a.K().a(this.h ? -0.5F : 0.5F, this.g ? 0.5F : -0.5F);
            if (this.a.cX() instanceof boz $$4) {
               $$4.a($$0, 30.0F, 30.0F);
            }

            this.a.a($$0, 30.0F, 30.0F);
         } else {
            this.a.I().a($$0, 30.0F, 30.0F);
         }

         if (this.a.fp()) {
            if (!$$2 && this.f < -60) {
               this.a.fv();
            } else if ($$2) {
               int $$5 = this.a.ft();
               if ($$5 >= 20) {
                  this.a.fv();
                  this.a.a($$0, cnq.a($$5));
                  this.e = this.c;
               }
            }
         } else if (--this.e <= 0 && this.f >= -60) {
            this.a.c(ciu.a(this.a, cpt.ot));
         }
      }
   }
}
