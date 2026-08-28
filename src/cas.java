import java.util.EnumSet;
import javax.annotation.Nullable;

public class cas extends cak {
   public static final float a = 0.02F;
   protected final btn b;
   @Nullable
   protected bsq c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends btl> f;
   protected final ced g;

   public cas(btn $$0, Class<? extends btl> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public cas(btn $$0, Class<? extends btl> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public cas(btn $$0, Class<? extends btl> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(cak.a.b));
      if ($$1 == cmv.class) {
         this.g = ced.b().a((double)$$2).a($$1x -> bsv.b($$0).test($$1x));
      } else {
         this.g = ced.b().a((double)$$2);
      }
   }

   @Override
   public boolean b() {
      if (this.b.dT().i() >= this.e) {
         return false;
      } else {
         if (this.b.p() != null) {
            this.c = this.b.p();
         }

         if (this.f == cmv.class) {
            this.c = this.b.dQ().a(this.g, this.b, this.b.dv(), this.b.dz(), this.b.dB());
         } else {
            this.c = this.b
               .dQ()
               .a(this.b.dQ().a(this.f, this.b.cL().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.dv(), this.b.dz(), this.b.dB());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      if (!this.c.bE()) {
         return false;
      } else {
         return this.b.g(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void d() {
      this.h = this.a(40 + this.b.dT().a(40));
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      if (this.c.bE()) {
         double $$0 = this.i ? this.b.dz() : this.c.dz();
         this.b.F().a(this.c.dv(), $$0, this.c.dB());
         this.h--;
      }
   }
}
