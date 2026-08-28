import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fpu extends fos {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fpu.a n;
   private final Supplier<hfv> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fpu(int $$0, int $$1, gfa $$2, Supplier<hfv> $$3) {
      super(0, 0, $$0, $$1, wo.a);
      this.n = fpu.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fof $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.F() + (float)this.A() / 2.0F, (float)(this.G() + this.y()), 100.0F);
      float $$4 = (float)this.y() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.d();
      fer.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.d();
      fer.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = ayz.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(hjw $$0) {
   }

   @Override
   protected void a(fsr $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public foc a(fsx $$0) {
      return null;
   }

   static record a(gdh a, gdh b) {
      public static fpu.a a(gfa $$0) {
         gdh $$1 = new gdh($$0.a(gfd.ce), false);
         gdh $$2 = new gdh($$0.a(gfd.ck), true);
         return new fpu.a($$1, $$2);
      }

      public void a(fof $$0, hfv $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.501F, 0.0F);
         gdh $$2 = $$1.e() == hfv.a.a ? this.b : this.a;
         gmj $$3 = $$2.a($$1.a());
         $$0.a($$3x -> $$2.a($$0.c(), $$3x.getBuffer($$3), 15728880, hej.d));
         $$0.c().b();
      }
   }
}
