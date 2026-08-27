import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class eyf extends exd {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final eyf.a n;
   private final Supplier<gfl> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public eyf(int $$0, int $$1, fms $$2, Supplier<gfl> $$3) {
      super(0, 0, $$0, $$1, ve.a);
      this.n = eyf.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(ewt $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.B() + (float)this.w() / 2.0F, (float)(this.C() + this.u()), 100.0F);
      float $$4 = (float)this.u() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      Matrix4f $$5 = $$0.c().c().a();
      $$5.rotateAround(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      this.n.a($$0, this.o.get());
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = aun.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gjd $$0) {
   }

   @Override
   protected void a(fay $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public ewq a(fbe $$0) {
      return null;
   }

   static record a(flb<?> a, flb<?> b) {
      public static eyf.a a(fms $$0) {
         flb<?> $$1 = new flb($$0.a(fmv.aP), false);
         flb<?> $$2 = new flb($$0.a(fmv.aT), true);
         $$1.e = false;
         $$2.e = false;
         return new eyf.a($$1, $$2);
      }

      public void a(ewt $$0, gfl $$1) {
         $$0.e();
         eow.c();
         $$0.c().a();
         $$0.c().a(new Matrix4f().scaling(1.0F, 1.0F, -1.0F));
         $$0.c().a(0.0F, -1.5F, 0.0F);
         flb<?> $$2 = $$1.e() == gfl.a.a ? this.b : this.a;
         fto $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, ged.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
         $$0.e();
         eow.b();
      }
   }
}
