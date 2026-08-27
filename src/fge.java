import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fge extends ffc {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fge.a n;
   private final Supplier<gny> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fge(int $$0, int $$1, fux $$2, Supplier<gny> $$3) {
      super(0, 0, $$0, $$1, wt.a);
      this.n = fge.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fer $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.C() + (float)this.x() / 2.0F, (float)(this.D() + this.v()), 100.0F);
      float $$4 = (float)this.v() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.e();
      ewt.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.e();
      ewt.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = axz.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(grq $$0) {
   }

   @Override
   protected void a(fja $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public feo a(fjg $$0) {
      return null;
   }

   static record a(ftg<?> a, ftg<?> b) {
      public static fge.a a(fux $$0) {
         ftg<?> $$1 = new ftg($$0.a(fva.aS), false);
         ftg<?> $$2 = new ftg($$0.a(fva.aW), true);
         $$1.e = false;
         $$2.e = false;
         return new fge.a($$1, $$2);
      }

      public void a(fer $$0, gny $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.5F, 0.0F);
         ftg<?> $$2 = $$1.e() == gny.a.a ? this.b : this.a;
         gbw $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
      }
   }
}
