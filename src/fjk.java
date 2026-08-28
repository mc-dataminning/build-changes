import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fjk extends fii {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fjk.a n;
   private final Supplier<grj> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fjk(int $$0, int $$1, fye $$2, Supplier<grj> $$3) {
      super(0, 0, $$0, $$1, wy.a);
      this.n = fjk.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fhx $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.D() + (float)this.y() / 2.0F, (float)(this.E() + this.w()), 100.0F);
      float $$4 = (float)this.w() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.e();
      fad.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.e();
      fad.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = ayo.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gvd $$0) {
   }

   @Override
   protected void a(fmg $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fhu a(fmm $$0) {
      return null;
   }

   static record a(fwn<?> a, fwn<?> b) {
      public static fjk.a a(fye $$0) {
         fwn<?> $$1 = new fwn($$0.a(fyh.aT), false);
         fwn<?> $$2 = new fwn($$0.a(fyh.aX), true);
         $$1.e = false;
         $$2.e = false;
         return new fjk.a($$1, $$2);
      }

      public void a(fhx $$0, grj $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fwn<?> $$2 = $$1.e() == grj.a.a ? this.b : this.a;
         gff $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, gqa.d);
         $$0.c().b();
      }
   }
}
