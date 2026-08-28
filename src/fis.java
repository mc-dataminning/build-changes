import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fis extends fhq {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fis.a n;
   private final Supplier<gqo> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fis(int $$0, int $$1, fxk $$2, Supplier<gqo> $$3) {
      super(0, 0, $$0, $$1, wt.a);
      this.n = fis.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fhf $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.D() + (float)this.y() / 2.0F, (float)(this.E() + this.w()), 100.0F);
      float $$4 = (float)this.w() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.e();
      ezi.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.e();
      ezi.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = ayg.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(guh $$0) {
   }

   @Override
   protected void a(flo $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fhc a(flu $$0) {
      return null;
   }

   static record a(fvt<?> a, fvt<?> b) {
      public static fis.a a(fxk $$0) {
         fvt<?> $$1 = new fvt($$0.a(fxn.aS), false);
         fvt<?> $$2 = new fvt($$0.a(fxn.aW), true);
         $$1.e = false;
         $$2.e = false;
         return new fis.a($$1, $$2);
      }

      public void a(fhf $$0, gqo $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fvt<?> $$2 = $$1.e() == gqo.a.a ? this.b : this.a;
         gel $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
      }
   }
}
