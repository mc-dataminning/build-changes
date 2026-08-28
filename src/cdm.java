import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdm extends cde {
   public static final float a = 0.02F;
   protected final bwi b;
   @Nullable
   protected bvk c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends bwg> f;
   protected final cgx g;

   public cdm(bwi $$0, Class<? extends bwg> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public cdm(bwi $$0, Class<? extends bwg> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public cdm(bwi $$0, Class<? extends bwg> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(cde.a.b));
      if ($$1 == cpx.class) {
         Predicate<bvk> $$5 = bvp.b($$0);
         this.g = cgx.b().a((double)$$2).a(($$1x, $$2x) -> $$5.test($$1x));
      } else {
         this.g = cgx.b().a((double)$$2);
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

         ash $$0 = a(this.b);
         if (this.f == cpx.class) {
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
