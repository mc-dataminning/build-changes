import java.util.EnumSet;

public class cee<T extends cmx & cnb> extends cde {
   private final T a;
   private final double b;
   private int c;
   private final float d;
   private int e = -1;
   private int f;
   private boolean g;
   private boolean h;
   private int i = -1;

   public cee(T $$0, double $$1, int $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3 * $$3;
      this.a(EnumSet.of(cde.a.a, cde.a.b));
   }

   public void c(int $$0) {
      this.c = $$0;
   }

   @Override
   public boolean b() {
      return this.a.O_() == null ? false : this.h();
   }

   protected boolean h() {
      return this.a.b(cxt.oR);
   }

   @Override
   public boolean c() {
      return (this.b() || !this.a.L().m()) && this.h();
   }

   @Override
   public void d() {
      super.d();
      this.a.w(true);
   }

   @Override
   public void e() {
      super.e();
      this.a.w(false);
      this.f = 0;
      this.e = -1;
      this.a.fF();
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      bwg $$0 = this.a.O_();
      if ($$0 != null) {
         double $$1 = this.a.i($$0.dB(), $$0.dD(), $$0.dH());
         boolean $$2 = this.a.N().a($$0);
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
            this.a.L().o();
            this.i++;
         } else {
            this.a.L().a($$0, this.b);
            this.i = -1;
         }

         if (this.i >= 20) {
            if ((double)this.a.dZ().i() < 0.3) {
               this.g = !this.g;
            }

            if ((double)this.a.dZ().i() < 0.3) {
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

            this.a.I().a(this.h ? -0.5F : 0.5F, this.g ? 0.5F : -0.5F);
            if (this.a.dm() instanceof bwi $$4) {
               $$4.a($$0, 30.0F, 30.0F);
            }

            this.a.a($$0, 30.0F, 30.0F);
         } else {
            this.a.H().a($$0, 30.0F, 30.0F);
         }

         if (this.a.fz()) {
            if (!$$2 && this.f < -60) {
               this.a.fF();
            } else if ($$2) {
               int $$5 = this.a.fD();
               if ($$5 >= 20) {
                  this.a.fF();
                  this.a.a($$0, cvz.a($$5));
                  this.e = this.c;
               }
            }
         } else if (--this.e <= 0 && this.f >= -60) {
            this.a.c(cqs.a(this.a, cxt.oR));
         }
      }
   }
}
