import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fnd extends fmb {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fnd.a n;
   private final Supplier<haf> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fnd(int $$0, int $$1, gch $$2, Supplier<haf> $$3) {
      super(0, 0, $$0, $$1, xi.a);
      this.n = fnd.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(flq $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.D() + (float)this.y() / 2.0F, (float)(this.E() + this.w()), 100.0F);
      float $$4 = (float)this.w() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.d();
      fdn.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.d();
      fdn.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = azm.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(heg $$0) {
   }

   @Override
   protected void a(fqb $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fln a(fqh $$0) {
      return null;
   }

   static record a(gao a, gao b) {
      public static fnd.a a(gch $$0) {
         gao $$1 = new gao($$0.a(gck.bY), false);
         gao $$2 = new gao($$0.a(gck.ce), true);
         return new fnd.a($$1, $$2);
      }

      public void a(flq $$0, haf $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.501F, 0.0F);
         gao $$2 = $$1.e() == haf.a.a ? this.b : this.a;
         gjq $$3 = $$2.a($$1.a());
         $$0.a($$3x -> $$2.a($$0.c(), $$3x.getBuffer($$3), 15728880, gyv.d));
         $$0.c().b();
      }
   }
}
