import java.util.EnumSet;
import javax.annotation.Nullable;

public class bxy extends bxq {
   public static final float a = 0.02F;
   protected final bqv b;
   @Nullable
   protected bqa c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends bqt> f;
   protected final cbj g;

   public bxy(bqv $$0, Class<? extends bqt> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public bxy(bqv $$0, Class<? extends bqt> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public bxy(bqv $$0, Class<? extends bqt> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(bxq.a.b));
      if ($$1 == cka.class) {
         this.g = cbj.b().a((double)$$2).a($$1x -> bqf.b($$0).test($$1x));
      } else {
         this.g = cbj.b().a((double)$$2);
      }
   }

   @Override
   public boolean a() {
      if (this.b.ei().i() >= this.e) {
         return false;
      } else {
         if (this.b.p() != null) {
            this.c = this.b.p();
         }

         if (this.f == cka.class) {
            this.c = this.b.dM().a(this.g, this.b, this.b.dr(), this.b.dv(), this.b.dx());
         } else {
            this.c = this.b
               .dM()
               .a(this.b.dM().a(this.f, this.b.cH().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.dr(), this.b.dv(), this.b.dx());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      if (!this.c.bA()) {
         return false;
      } else {
         return this.b.g(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void c() {
      this.h = this.a(40 + this.b.ei().a(40));
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      if (this.c.bA()) {
         double $$0 = this.i ? this.b.dv() : this.c.dv();
         this.b.G().a(this.c.dr(), $$0, this.c.dx());
         this.h--;
      }
   }
}
