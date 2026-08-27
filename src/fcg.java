import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fcg extends fbe {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fcg.a n;
   private final Supplier<gjy> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fcg(int $$0, int $$1, fqz $$2, Supplier<gjy> $$3) {
      super(0, 0, $$0, $$1, vt.a);
      this.n = fcg.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fat $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.B() + (float)this.w() / 2.0F, (float)(this.C() + this.u()), 100.0F);
      float $$4 = (float)this.u() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.e();
      esv.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.e();
      esv.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = aww.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gnq $$0) {
   }

   @Override
   protected void a(ffc $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public faq a(ffi $$0) {
      return null;
   }

   static record a(fpi<?> a, fpi<?> b) {
      public static fcg.a a(fqz $$0) {
         fpi<?> $$1 = new fpi($$0.a(frc.aO), false);
         fpi<?> $$2 = new fpi($$0.a(frc.aS), true);
         $$1.e = false;
         $$2.e = false;
         return new fcg.a($$1, $$2);
      }

      public void a(fat $$0, gjy $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fpi<?> $$2 = $$1.e() == gjy.a.a ? this.b : this.a;
         fxy $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, giq.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
      }
   }
}
