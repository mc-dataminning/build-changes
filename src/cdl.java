import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdl extends cdd {
   public static final float a = 0.02F;
   protected final bwh b;
   @Nullable
   protected bvj c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends bwf> f;
   protected final cgw g;

   public cdl(bwh $$0, Class<? extends bwf> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public cdl(bwh $$0, Class<? extends bwf> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public cdl(bwh $$0, Class<? extends bwf> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(cdd.a.b));
      if ($$1 == cpw.class) {
         Predicate<bvj> $$5 = bvo.b($$0);
         this.g = cgw.b().a((double)$$2).a(($$1x, $$2x) -> $$5.test($$1x));
      } else {
         this.g = cgw.b().a((double)$$2);
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

         ash $$0 = a(this.b);
         if (this.f == cpw.class) {
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
         this.b.H().a(this.c.dA(), $$0, this.c.dG());
         this.h--;
      }
   }
}
