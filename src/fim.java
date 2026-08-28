import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fim extends fhk {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fim.a n;
   private final Supplier<gqi> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fim(int $$0, int $$1, fxe $$2, Supplier<gqi> $$3) {
      super(0, 0, $$0, $$1, wt.a);
      this.n = fim.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fgz $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.D() + (float)this.y() / 2.0F, (float)(this.E() + this.w()), 100.0F);
      float $$4 = (float)this.w() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.e();
      ezc.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.e();
      ezc.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = aye.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gub $$0) {
   }

   @Override
   protected void a(fli $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fgw a(flo $$0) {
      return null;
   }

   static record a(fvn<?> a, fvn<?> b) {
      public static fim.a a(fxe $$0) {
         fvn<?> $$1 = new fvn($$0.a(fxh.aS), false);
         fvn<?> $$2 = new fvn($$0.a(fxh.aW), true);
         $$1.e = false;
         $$2.e = false;
         return new fim.a($$1, $$2);
      }

      public void a(fgz $$0, gqi $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fvn<?> $$2 = $$1.e() == gqi.a.a ? this.b : this.a;
         gef $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
      }
   }
}
