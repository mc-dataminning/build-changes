import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fao extends ezm {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fao.a n;
   private final Supplier<gia> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fao(int $$0, int $$1, fpf $$2, Supplier<gia> $$3) {
      super(0, 0, $$0, $$1, vp.a);
      this.n = fao.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(ezb $$0, int $$1, int $$2, float $$3) {
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
      this.p = awi.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gls $$0) {
   }

   @Override
   protected void a(fdj $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public eyy a(fdp $$0) {
      return null;
   }

   static record a(fnn<?> a, fnn<?> b) {
      public static fao.a a(fpf $$0) {
         fnn<?> $$1 = new fnn($$0.a(fpi.aO), false);
         fnn<?> $$2 = new fnn($$0.a(fpi.aS), true);
         $$1.e = false;
         $$2.e = false;
         return new fao.a($$1, $$2);
      }

      public void a(ezb $$0, gia $$1) {
         $$0.e();
         erd.c();
         $$0.c().a();
         $$0.c().a(new Matrix4f().scaling(1.0F, 1.0F, -1.0F));
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fnn<?> $$2 = $$1.e() == gia.a.a ? this.b : this.a;
         fwb $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, ggs.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
         $$0.e();
         erd.b();
      }
   }
}
