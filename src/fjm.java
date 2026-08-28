import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fjm extends fik {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fjm.a n;
   private final Supplier<grl> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fjm(int $$0, int $$1, fyg $$2, Supplier<grl> $$3) {
      super(0, 0, $$0, $$1, wy.a);
      this.n = fjm.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fhz $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.D() + (float)this.y() / 2.0F, (float)(this.E() + this.w()), 100.0F);
      float $$4 = (float)this.w() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.e();
      faf.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.e();
      faf.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = ayo.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gvf $$0) {
   }

   @Override
   protected void a(fmi $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fhw a(fmo $$0) {
      return null;
   }

   static record a(fwp<?> a, fwp<?> b) {
      public static fjm.a a(fyg $$0) {
         fwp<?> $$1 = new fwp($$0.a(fyj.aT), false);
         fwp<?> $$2 = new fwp($$0.a(fyj.aX), true);
         $$1.e = false;
         $$2.e = false;
         return new fjm.a($$1, $$2);
      }

      public void a(fhz $$0, grl $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fwp<?> $$2 = $$1.e() == grl.a.a ? this.b : this.a;
         gfh $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, gqc.d);
         $$0.c().b();
      }
   }
}
