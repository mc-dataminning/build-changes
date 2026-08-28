import java.util.function.Supplier;
import javax.annotation.Nullable;

public class flz extends fkx {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final flz.a n;
   private final Supplier<gyt> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public flz(int $$0, int $$1, gax $$2, Supplier<gyt> $$3) {
      super(0, 0, $$0, $$1, xg.a);
      this.n = flz.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fkm $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.D() + (float)this.y() / 2.0F, (float)(this.E() + this.w()), 100.0F);
      float $$4 = (float)this.w() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.d();
      fcp.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.d();
      fcp.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = azj.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(hcu $$0) {
   }

   @Override
   protected void a(fox $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fkj a(fpd $$0) {
      return null;
   }

   static record a(fze a, fze b) {
      public static flz.a a(gax $$0) {
         fze $$1 = new fze($$0.a(gba.bI), false);
         fze $$2 = new fze($$0.a(gba.bO), true);
         return new flz.a($$1, $$2);
      }

      public void a(fkm $$0, gyt $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.501F, 0.0F);
         fze $$2 = $$1.e() == gyt.a.a ? this.b : this.a;
         gig $$3 = $$2.a($$1.a());
         $$0.a($$3x -> $$2.a($$0.c(), $$3x.getBuffer($$3), 15728880, gxj.d));
         $$0.c().b();
      }
   }
}
