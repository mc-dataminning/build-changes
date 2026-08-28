import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fsq extends fro {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fsq.a n;
   private final Supplier<hja> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fsq(int $$0, int $$1, gic $$2, Supplier<hja> $$3) {
      super(0, 0, $$0, $$1, wv.a);
      this.n = fsq.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(frc $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.F() + (float)this.A() / 2.0F, (float)(this.G() + this.y()), 100.0F);
      float $$4 = (float)this.y() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.d();
      fhm.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.d();
      fhm.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = azk.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(hnc $$0) {
   }

   @Override
   protected void a(fvn $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public fqz a(fvt $$0) {
      return null;
   }

   static record a(ggj a, ggj b) {
      public static fsq.a a(gic $$0) {
         ggj $$1 = new ggj($$0.a(gif.co), false);
         ggj $$2 = new ggj($$0.a(gif.cu), true);
         return new fsq.a($$1, $$2);
      }

      public void a(frc $$0, hja $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.501F, 0.0F);
         ggj $$2 = $$1.e() == hja.a.a ? this.b : this.a;
         gpn $$3 = $$2.a($$1.a());
         $$0.a($$3x -> $$2.a($$0.c(), $$3x.getBuffer($$3), 15728880, hhp.d));
         $$0.c().b();
      }
   }
}
