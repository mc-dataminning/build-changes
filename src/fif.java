import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fif extends fhd {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fif.a n;
   private final Supplier<gqa> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fif(int $$0, int $$1, fwx $$2, Supplier<gqa> $$3) {
      super(0, 0, $$0, $$1, xo.a);
      this.n = fif.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fgs $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.C() + (float)this.x() / 2.0F, (float)(this.D() + this.v()), 100.0F);
      float $$4 = (float)this.v() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.e();
      eyv.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.e();
      eyv.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = ayz.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gtw $$0) {
   }

   @Override
   protected void a(flb $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public fgp a(flh $$0) {
      return null;
   }

   static record a(fvg<?> a, fvg<?> b) {
      public static fif.a a(fwx $$0) {
         fvg<?> $$1 = new fvg($$0.a(fxa.aS), false);
         fvg<?> $$2 = new fvg($$0.a(fxa.aW), true);
         $$1.e = false;
         $$2.e = false;
         return new fif.a($$1, $$2);
      }

      public void a(fgs $$0, gqa $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fvg<?> $$2 = $$1.e() == gqa.a.a ? this.b : this.a;
         gdx $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, gor.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
      }
   }
}
