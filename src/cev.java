import java.util.EnumSet;

public class cev<T extends cnt & cnx> extends cdv {
   private final T a;
   private final double b;
   private int c;
   private final float d;
   private int e = -1;
   private int f;
   private boolean g;
   private boolean h;
   private int i = -1;

   public cev(T $$0, double $$1, int $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3 * $$3;
      this.a(EnumSet.of(cdv.a.a, cdv.a.b));
   }

   public void c(int $$0) {
      this.c = $$0;
   }

   @Override
   public boolean b() {
      return this.a.f() == null ? false : this.h();
   }

   protected boolean h() {
      return this.a.b(cyw.pe);
   }

   @Override
   public boolean c() {
      return (this.b() || !this.a.O().k()) && this.h();
   }

   @Override
   public void d() {
      super.d();
      this.a.v(true);
   }

   @Override
   public void e() {
      super.e();
      this.a.v(false);
      this.f = 0;
      this.e = -1;
      this.a.fE();
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void a() {
      bwz $$0 = this.a.f();
      if ($$0 != null) {
         double $$1 = this.a.i($$0.dA(), $$0.dC(), $$0.dG());
         boolean $$2 = this.a.P().a($$0);
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
            this.a.O().m();
            this.i++;
         } else {
            this.a.O().a($$0, this.b);
            this.i = -1;
         }

         if (this.i >= 20) {
            if ((double)this.a.dY().i() < 0.3) {
               this.g = !this.g;
            }

            if ((double)this.a.dY().i() < 0.3) {
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

            this.a.L().a(this.h ? -0.5F : 0.5F, this.g ? 0.5F : -0.5F);
            if (this.a.dl() instanceof bxb $$4) {
               $$4.a($$0, 30.0F, 30.0F);
            }

            this.a.a($$0, 30.0F, 30.0F);
         } else {
            this.a.J().a($$0, 30.0F, 30.0F);
         }

         if (this.a.fy()) {
            if (!$$2 && this.f < -60) {
               this.a.fE();
            } else if ($$2) {
               int $$5 = this.a.fC();
               if ($$5 >= 20) {
                  this.a.fE();
                  this.a.a($$0, cxe.a($$5));
                  this.e = this.c;
               }
            }
         } else if (--this.e <= 0 && this.f >= -60) {
            this.a.c(cro.a(this.a, cyw.pe));
         }
      }
   }
}
