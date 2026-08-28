import java.util.EnumSet;
import javax.annotation.Nullable;

public class cai extends caa {
   public static final float a = 0.02F;
   protected final bte b;
   @Nullable
   protected bsh c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends btc> f;
   protected final cdt g;

   public cai(bte $$0, Class<? extends btc> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public cai(bte $$0, Class<? extends btc> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public cai(bte $$0, Class<? extends btc> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(caa.a.b));
      if ($$1 == cml.class) {
         this.g = cdt.b().a((double)$$2).a($$1x -> bsm.b($$0).test($$1x));
      } else {
         this.g = cdt.b().a((double)$$2);
      }
   }

   @Override
   public boolean a() {
      if (this.b.dU().i() >= this.e) {
         return false;
      } else {
         if (this.b.p() != null) {
            this.c = this.b.p();
         }

         if (this.f == cml.class) {
            this.c = this.b.dR().a(this.g, this.b, this.b.dw(), this.b.dA(), this.b.dC());
         } else {
            this.c = this.b
               .dR()
               .a(this.b.dR().a(this.f, this.b.cM().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.dw(), this.b.dA(), this.b.dC());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      if (!this.c.bF()) {
         return false;
      } else {
         return this.b.g(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void c() {
      this.h = this.a(40 + this.b.dU().a(40));
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      if (this.c.bF()) {
         double $$0 = this.i ? this.b.dA() : this.c.dA();
         this.b.F().a(this.c.dw(), $$0, this.c.dC());
         this.h--;
      }
   }
}
