import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cde extends ccw {
   public static final float a = 0.02F;
   protected final bwa b;
   @Nullable
   protected bva c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends bvy> f;
   protected final cgp g;

   public cde(bwa $$0, Class<? extends bvy> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public cde(bwa $$0, Class<? extends bvy> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public cde(bwa $$0, Class<? extends bvy> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(ccw.a.b));
      if ($$1 == cpr.class) {
         Predicate<bva> $$5 = bvg.b($$0);
         this.g = cgp.b().a((double)$$2).a(($$1x, $$2x) -> $$5.test($$1x));
      } else {
         this.g = cgp.b().a((double)$$2);
      }
   }

   @Override
   public boolean b() {
      if (this.b.dX().i() >= this.e) {
         return false;
      } else {
         if (this.b.f() != null) {
            this.c = this.b.f();
         }

         ard $$0 = a(this.b);
         if (this.f == cpr.class) {
            this.c = $$0.a(this.g, this.b, this.b.dz(), this.b.dD(), this.b.dF());
         } else {
            this.c = $$0.a(
               this.b.dU().a(this.f, this.b.cQ().c((double)this.d, 3.0, (double)this.d), $$0x -> true), this.g, this.b, this.b.dz(), this.b.dD(), this.b.dF()
            );
         }

         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      if (!this.c.bJ()) {
         return false;
      } else {
         return this.b.g(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void d() {
      this.h = this.a(40 + this.b.dX().a(40));
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      if (this.c.bJ()) {
         double $$0 = this.i ? this.b.dD() : this.c.dD();
         this.b.J().a(this.c.dz(), $$0, this.c.dF());
         this.h--;
      }
   }
}
