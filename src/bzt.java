import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzt extends bzl {
   public static final float a = 0.02F;
   protected final bsq b;
   @Nullable
   protected brv c;
   protected final float d;
   protected int e;
   protected final float f;
   private final boolean i;
   protected final Class<? extends bso> g;
   protected final cde h;

   public bzt(bsq $$0, Class<? extends bso> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public bzt(bsq $$0, Class<? extends bso> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public bzt(bsq $$0, Class<? extends bso> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.g = $$1;
      this.d = $$2;
      this.f = $$3;
      this.i = $$4;
      this.a(EnumSet.of(bzl.a.b));
      if ($$1 == cly.class) {
         this.h = cde.b().a((double)$$2).a($$1x -> bsa.b($$0).test($$1x));
      } else {
         this.h = cde.b().a((double)$$2);
      }
   }

   @Override
   public boolean a() {
      if (this.b.et().i() >= this.f) {
         return false;
      } else {
         if (this.b.p() != null) {
            this.c = this.b.p();
         }

         if (this.g == cly.class) {
            this.c = this.b.dU().a(this.h, this.b, this.b.dz(), this.b.dD(), this.b.dF());
         } else {
            this.c = this.b
               .dU()
               .a(this.b.dU().a(this.g, this.b.cP().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.h, this.b, this.b.dz(), this.b.dD(), this.b.dF());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      if (!this.c.bI()) {
         return false;
      } else {
         return this.b.g(this.c) > (double)(this.d * this.d) ? false : this.e > 0;
      }
   }

   @Override
   public void c() {
      this.e = this.a(40 + this.b.et().a(40));
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      if (this.c.bI()) {
         double $$0 = this.i ? this.b.dD() : this.c.dD();
         this.b.F().a(this.c.dz(), $$0, this.c.dF());
         this.e--;
      }
   }
}
