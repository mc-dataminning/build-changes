import java.util.function.Supplier;
import javax.annotation.Nullable;

public class flk extends fki {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final flk.a n;
   private final Supplier<gyc> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public flk(int $$0, int $$1, gah $$2, Supplier<gyc> $$3) {
      super(0, 0, $$0, $$1, xc.a);
      this.n = flk.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fjx $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.D() + (float)this.y() / 2.0F, (float)(this.E() + this.w()), 100.0F);
      float $$4 = (float)this.w() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.e();
      fca.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.e();
      fca.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = azd.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(hca $$0) {
   }

   @Override
   protected void a(foh $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fju a(fon $$0) {
      return null;
   }

   static record a(fyp a, fyp b) {
      public static flk.a a(gah $$0) {
         fyp $$1 = new fyp($$0.a(gak.bI), false);
         fyp $$2 = new fyp($$0.a(gak.bO), true);
         return new flk.a($$1, $$2);
      }

      public void a(fjx $$0, gyc $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.501F, 0.0F);
         fyp $$2 = $$1.e() == gyc.a.a ? this.b : this.a;
         ghq $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, gws.d);
         $$0.c().b();
      }
   }
}
