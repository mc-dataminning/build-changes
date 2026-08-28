import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fla extends fjy {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fla.a n;
   private final Supplier<gxl> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fla(int $$0, int $$1, fzx $$2, Supplier<gxl> $$3) {
      super(0, 0, $$0, $$1, xc.a);
      this.n = fla.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fjn $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.D() + (float)this.y() / 2.0F, (float)(this.E() + this.w()), 100.0F);
      float $$4 = (float)this.w() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.e();
      fbl.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.e();
      fbl.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = azc.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(hbj $$0) {
   }

   @Override
   protected void a(fnx $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fjk a(fod $$0) {
      return null;
   }

   static record a(fyf a, fyf b) {
      public static fla.a a(fzx $$0) {
         fyf $$1 = new fyf($$0.a(gaa.bH), false);
         fyf $$2 = new fyf($$0.a(gaa.bN), true);
         return new fla.a($$1, $$2);
      }

      public void a(fjn $$0, gxl $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.501F, 0.0F);
         fyf $$2 = $$1.e() == gxl.a.a ? this.b : this.a;
         ghe $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, gwb.d);
         $$0.c().b();
      }
   }
}
