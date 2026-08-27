import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ffu extends fes {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final ffu.a n;
   private final Supplier<gnn> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public ffu(int $$0, int $$1, fun $$2, Supplier<gnn> $$3) {
      super(0, 0, $$0, $$1, wr.a);
      this.n = ffu.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(feh $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.C() + (float)this.x() / 2.0F, (float)(this.D() + this.v()), 100.0F);
      float $$4 = (float)this.v() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.e();
      ewj.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.e();
      ewj.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = axw.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(grf $$0) {
   }

   @Override
   protected void a(fiq $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public fee a(fiw $$0) {
      return null;
   }

   static record a(fsw<?> a, fsw<?> b) {
      public static ffu.a a(fun $$0) {
         fsw<?> $$1 = new fsw($$0.a(fuq.aS), false);
         fsw<?> $$2 = new fsw($$0.a(fuq.aW), true);
         $$1.e = false;
         $$2.e = false;
         return new ffu.a($$1, $$2);
      }

      public void a(feh $$0, gnn $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fsw<?> $$2 = $$1.e() == gnn.a.a ? this.b : this.a;
         gbm $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
      }
   }
}
