import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccl extends ccd {
   public static final float a = 0.02F;
   protected final bvh b;
   @Nullable
   protected buj c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends bvf> f;
   protected final cfw g;

   public ccl(bvh $$0, Class<? extends bvf> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public ccl(bvh $$0, Class<? extends bvf> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public ccl(bvh $$0, Class<? extends bvf> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(ccd.a.b));
      if ($$1 == cov.class) {
         Predicate<buj> $$5 = buo.b($$0);
         this.g = cfw.b().a((double)$$2).a(($$1x, $$2x) -> $$5.test($$1x));
      } else {
         this.g = cfw.b().a((double)$$2);
      }
   }

   @Override
   public boolean b() {
      if (this.b.dZ().i() >= this.e) {
         return false;
      } else {
         if (this.b.O_() != null) {
            this.c = this.b.O_();
         }

         arc $$0 = a(this.b);
         if (this.f == cov.class) {
            this.c = $$0.a(this.g, this.b, this.b.dB(), this.b.dF(), this.b.dH());
         } else {
            this.c = $$0.a(
               this.b.dW().a(this.f, this.b.cR().c((double)this.d, 3.0, (double)this.d), $$0x -> true), this.g, this.b, this.b.dB(), this.b.dF(), this.b.dH()
            );
         }

         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      if (!this.c.bL()) {
         return false;
      } else {
         return this.b.g(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void d() {
      this.h = this.a(40 + this.b.dZ().a(40));
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      if (this.c.bL()) {
         double $$0 = this.i ? this.b.dF() : this.c.dF();
         this.b.H().a(this.c.dB(), $$0, this.c.dH());
         this.h--;
      }
   }
}
