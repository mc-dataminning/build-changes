import java.util.EnumSet;

public class bnv<T extends bwc & bwg> extends bmv {
   private final T a;
   private final double b;
   private int c;
   private final float d;
   private int e = -1;
   private int f;
   private boolean g;
   private boolean h;
   private int i = -1;

   public bnv(T $$0, double $$1, int $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3 * $$3;
      this.a(EnumSet.of(bmv.a.a, bmv.a.b));
   }

   public void c(int $$0) {
      this.c = $$0;
   }

   @Override
   public boolean a() {
      return this.a.j() == null ? false : this.h();
   }

   protected boolean h() {
      return this.a.b(cgc.nG);
   }

   @Override
   public boolean b() {
      return (this.a() || !this.a.J().l()) && this.h();
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
      this.a.fo();
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      bfz $$0 = this.a.j();
      if ($$0 != null) {
         double $$1 = this.a.i($$0.dn(), $$0.dp(), $$0.dt());
         boolean $$2 = this.a.K().a($$0);
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
            this.a.J().n();
            this.i++;
         } else {
            this.a.J().a($$0, this.b);
            this.i = -1;
         }

         if (this.i >= 20) {
            if ((double)this.a.ec().i() < 0.3) {
               this.g = !this.g;
            }

            if ((double)this.a.ec().i() < 0.3) {
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

            this.a.G().a(this.h ? -0.5F : 0.5F, this.g ? 0.5F : -0.5F);
            if (this.a.cX() instanceof bgb $$4) {
               $$4.a($$0, 30.0F, 30.0F);
            }

            this.a.a($$0, 30.0F, 30.0F);
         } else {
            this.a.E().a($$0, 30.0F, 30.0F);
         }

         if (this.a.fi()) {
            if (!$$2 && this.f < -60) {
               this.a.fo();
            } else if ($$2) {
               int $$5 = this.a.fm();
               if ($$5 >= 20) {
                  this.a.fo();
                  this.a.a($$0, cdx.a($$5));
                  this.e = this.c;
               }
            }
         } else if (--this.e <= 0 && this.f >= -60) {
            this.a.c(bzh.a(this.a, cgc.nG));
         }
      }
   }
}
