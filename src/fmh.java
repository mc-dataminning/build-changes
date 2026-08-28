import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fmh extends flf {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fmh.a n;
   private final Supplier<gze> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fmh(int $$0, int $$1, gbi $$2, Supplier<gze> $$3) {
      super(0, 0, $$0, $$1, xh.a);
      this.n = fmh.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fku $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.D() + (float)this.y() / 2.0F, (float)(this.E() + this.w()), 100.0F);
      float $$4 = (float)this.w() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.d();
      fcx.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.d();
      fcx.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = azk.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(hdf $$0) {
   }

   @Override
   protected void a(fpf $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fkr a(fpl $$0) {
      return null;
   }

   static record a(fzp a, fzp b) {
      public static fmh.a a(gbi $$0) {
         fzp $$1 = new fzp($$0.a(gbl.bI), false);
         fzp $$2 = new fzp($$0.a(gbl.bO), true);
         return new fmh.a($$1, $$2);
      }

      public void a(fku $$0, gze $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.501F, 0.0F);
         fzp $$2 = $$1.e() == gze.a.a ? this.b : this.a;
         gir $$3 = $$2.a($$1.a());
         $$0.a($$3x -> $$2.a($$0.c(), $$3x.getBuffer($$3), 15728880, gxu.d));
         $$0.c().b();
      }
   }
}
