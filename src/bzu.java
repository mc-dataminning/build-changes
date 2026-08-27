import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzu extends bzm {
   public static final float a = 0.02F;
   protected final bsq b;
   @Nullable
   protected bru c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends bso> f;
   protected final cdf g;

   public bzu(bsq $$0, Class<? extends bso> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public bzu(bsq $$0, Class<? extends bso> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public bzu(bsq $$0, Class<? extends bso> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(bzm.a.b));
      if ($$1 == clw.class) {
         this.g = cdf.b().a((double)$$2).a($$1x -> brz.b($$0).test($$1x));
      } else {
         this.g = cdf.b().a((double)$$2);
      }
   }

   @Override
   public boolean a() {
      if (this.b.el().i() >= this.e) {
         return false;
      } else {
         if (this.b.p() != null) {
            this.c = this.b.p();
         }

         if (this.f == clw.class) {
            this.c = this.b.dP().a(this.g, this.b, this.b.du(), this.b.dy(), this.b.dA());
         } else {
            this.c = this.b
               .dP()
               .a(this.b.dP().a(this.f, this.b.cK().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.du(), this.b.dy(), this.b.dA());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      if (!this.c.bD()) {
         return false;
      } else {
         return this.b.g(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void c() {
      this.h = this.a(40 + this.b.el().a(40));
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      if (this.c.bD()) {
         double $$0 = this.i ? this.b.dy() : this.c.dy();
         this.b.G().a(this.c.du(), $$0, this.c.dA());
         this.h--;
      }
   }
}
