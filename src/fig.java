import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fig extends fhe {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fig.a n;
   private final Supplier<gqb> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fig(int $$0, int $$1, fwy $$2, Supplier<gqb> $$3) {
      super(0, 0, $$0, $$1, xo.a);
      this.n = fig.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fgt $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.C() + (float)this.x() / 2.0F, (float)(this.D() + this.v()), 100.0F);
      float $$4 = (float)this.v() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.e();
      eyw.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.e();
      eyw.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = ayz.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gtx $$0) {
   }

   @Override
   protected void a(flc $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public fgq a(fli $$0) {
      return null;
   }

   static record a(fvh<?> a, fvh<?> b) {
      public static fig.a a(fwy $$0) {
         fvh<?> $$1 = new fvh($$0.a(fxb.aS), false);
         fvh<?> $$2 = new fvh($$0.a(fxb.aW), true);
         $$1.e = false;
         $$2.e = false;
         return new fig.a($$1, $$2);
      }

      public void a(fgt $$0, gqb $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fvh<?> $$2 = $$1.e() == gqb.a.a ? this.b : this.a;
         gdy $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, gos.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
      }
   }
}
