import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fhz extends fgx {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fhz.a n;
   private final Supplier<gpu> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fhz(int $$0, int $$1, fwr $$2, Supplier<gpu> $$3) {
      super(0, 0, $$0, $$1, xk.a);
      this.n = fhz.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fgm $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.C() + (float)this.x() / 2.0F, (float)(this.D() + this.v()), 100.0F);
      float $$4 = (float)this.v() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.e();
      eyp.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.e();
      eyp.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = ayu.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gtq $$0) {
   }

   @Override
   protected void a(fkv $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public fgj a(flb $$0) {
      return null;
   }

   static record a(fva<?> a, fva<?> b) {
      public static fhz.a a(fwr $$0) {
         fva<?> $$1 = new fva($$0.a(fwu.aS), false);
         fva<?> $$2 = new fva($$0.a(fwu.aW), true);
         $$1.e = false;
         $$2.e = false;
         return new fhz.a($$1, $$2);
      }

      public void a(fgm $$0, gpu $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fva<?> $$2 = $$1.e() == gpu.a.a ? this.b : this.a;
         gdr $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, gol.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
      }
   }
}
