import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccn extends ccf {
   public static final float a = 0.02F;
   protected final bvj b;
   @Nullable
   protected bul c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends bvh> f;
   protected final cfy g;

   public ccn(bvj $$0, Class<? extends bvh> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public ccn(bvj $$0, Class<? extends bvh> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public ccn(bvj $$0, Class<? extends bvh> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(ccf.a.b));
      if ($$1 == cox.class) {
         Predicate<bul> $$5 = buq.b($$0);
         this.g = cfy.b().a((double)$$2).a(($$1x, $$2x) -> $$5.test($$1x));
      } else {
         this.g = cfy.b().a((double)$$2);
      }
   }

   @Override
   public boolean b() {
      if (this.b.dY().i() >= this.e) {
         return false;
      } else {
         if (this.b.O_() != null) {
            this.c = this.b.O_();
         }

         ard $$0 = a(this.b);
         if (this.f == cox.class) {
            this.c = $$0.a(this.g, this.b, this.b.dA(), this.b.dE(), this.b.dG());
         } else {
            this.c = $$0.a(
               this.b.dV().a(this.f, this.b.cR().c((double)this.d, 3.0, (double)this.d), $$0x -> true), this.g, this.b, this.b.dA(), this.b.dE(), this.b.dG()
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
      this.h = this.a(40 + this.b.dY().a(40));
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      if (this.c.bL()) {
         double $$0 = this.i ? this.b.dE() : this.c.dE();
         this.b.L().a(this.c.dA(), $$0, this.c.dG());
         this.h--;
      }
   }
}
