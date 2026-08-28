import java.util.EnumSet;

public class ccc<T extends ckv & ckz> extends cbc {
   private final T a;
   private final double b;
   private int c;
   private final float d;
   private int e = -1;
   private int f;
   private boolean g;
   private boolean h;
   private int i = -1;

   public ccc(T $$0, double $$1, int $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3 * $$3;
      this.a(EnumSet.of(cbc.a.a, cbc.a.b));
   }

   public void c(int $$0) {
      this.c = $$0;
   }

   @Override
   public boolean b() {
      return this.a.m() == null ? false : this.h();
   }

   protected boolean h() {
      return this.a.b(cvo.ow);
   }

   @Override
   public boolean c() {
      return (this.b() || !this.a.P().m()) && this.h();
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
      this.a.fB();
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void a() {
      buf $$0 = this.a.m();
      if ($$0 != null) {
         double $$1 = this.a.i($$0.dx(), $$0.dz(), $$0.dD());
         boolean $$2 = this.a.Q().a($$0);
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
            this.a.P().o();
            this.i++;
         } else {
            this.a.P().a($$0, this.b);
            this.i = -1;
         }

         if (this.i >= 20) {
            if ((double)this.a.dV().i() < 0.3) {
               this.g = !this.g;
            }

            if ((double)this.a.dV().i() < 0.3) {
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

            this.a.M().a(this.h ? -0.5F : 0.5F, this.g ? 0.5F : -0.5F);
            if (this.a.dh() instanceof buh $$4) {
               $$4.a($$0, 30.0F, 30.0F);
            }

            this.a.a($$0, 30.0F, 30.0F);
         } else {
            this.a.K().a($$0, 30.0F, 30.0F);
         }

         if (this.a.fv()) {
            if (!$$2 && this.f < -60) {
               this.a.fB();
            } else if ($$2) {
               int $$5 = this.a.fz();
               if ($$5 >= 20) {
                  this.a.fB();
                  this.a.a($$0, ctp.a($$5));
                  this.e = this.c;
               }
            }
         } else if (--this.e <= 0 && this.f >= -60) {
            this.a.c(cok.a(this.a, cvo.ow));
         }
      }
   }
}
