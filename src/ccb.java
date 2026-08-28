import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccb extends cbt {
   public static final float a = 0.02F;
   protected final bux b;
   @Nullable
   protected btz c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends buv> f;
   protected final cfm g;

   public ccb(bux $$0, Class<? extends buv> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public ccb(bux $$0, Class<? extends buv> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public ccb(bux $$0, Class<? extends buv> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(cbt.a.b));
      if ($$1 == coh.class) {
         this.g = cfm.b().a((double)$$2).a($$1x -> bue.b($$0).test($$1x));
      } else {
         this.g = cfm.b().a((double)$$2);
      }
   }

   @Override
   public boolean b() {
      if (this.b.ea().i() >= this.e) {
         return false;
      } else {
         if (this.b.m() != null) {
            this.c = this.b.m();
         }

         if (this.f == coh.class) {
            this.c = this.b.dX().a(this.g, this.b, this.b.dC(), this.b.dG(), this.b.dI());
         } else {
            this.c = this.b
               .dX()
               .a(this.b.dX().a(this.f, this.b.cS().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.dC(), this.b.dG(), this.b.dI());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      if (!this.c.bM()) {
         return false;
      } else {
         return this.b.g(this.c) > (double)(this.d * this.d) ? false : this.h > 0;
      }
   }

   @Override
   public void d() {
      this.h = this.a(40 + this.b.ea().a(40));
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      if (this.c.bM()) {
         double $$0 = this.i ? this.b.dG() : this.c.dG();
         this.b.K().a(this.c.dC(), $$0, this.c.dI());
         this.h--;
      }
   }
}
