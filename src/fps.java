import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fps extends fop {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fps.a n;
   private final Supplier<hfk> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fps(int $$0, int $$1, gey $$2, Supplier<hfk> $$3) {
      super(0, 0, $$0, $$1, wn.a);
      this.n = fps.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fod $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.F() + (float)this.A() / 2.0F, (float)(this.G() + this.y()), 100.0F);
      float $$4 = (float)this.y() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.d();
      feq.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.d();
      feq.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = ayz.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(hjo $$0) {
   }

   @Override
   protected void a(fsp $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public foa a(fsv $$0) {
      return null;
   }

   static record a(gdf a, gdf b) {
      public static fps.a a(gey $$0) {
         gdf $$1 = new gdf($$0.a(gfb.ce), false);
         gdf $$2 = new gdf($$0.a(gfb.ck), true);
         return new fps.a($$1, $$2);
      }

      public void a(fod $$0, hfk $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.501F, 0.0F);
         gdf $$2 = $$1.e() == hfk.a.a ? this.b : this.a;
         gmh $$3 = $$2.a($$1.a());
         $$0.a($$3x -> $$2.a($$0.c(), $$3x.getBuffer($$3), 15728880, hea.d));
         $$0.c().b();
      }
   }
}
