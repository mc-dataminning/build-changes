import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fpt extends foq {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fpt.a n;
   private final Supplier<hfu> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fpt(int $$0, int $$1, gez $$2, Supplier<hfu> $$3) {
      super(0, 0, $$0, $$1, wo.a);
      this.n = fpt.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(foe $$0, int $$1, int $$2, float $$3) {
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
   public void a(hjv $$0) {
   }

   @Override
   protected void a(fsq $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public fob a(fsw $$0) {
      return null;
   }

   static record a(gdg a, gdg b) {
      public static fpt.a a(gez $$0) {
         gdg $$1 = new gdg($$0.a(gfc.ce), false);
         gdg $$2 = new gdg($$0.a(gfc.ck), true);
         return new fpt.a($$1, $$2);
      }

      public void a(foe $$0, hfu $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.501F, 0.0F);
         gdg $$2 = $$1.e() == hfu.a.a ? this.b : this.a;
         gmi $$3 = $$2.a($$1.a());
         $$0.a($$3x -> $$2.a($$0.c(), $$3x.getBuffer($$3), 15728880, hei.d));
         $$0.c().b();
      }
   }
}
