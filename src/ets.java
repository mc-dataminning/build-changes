import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class ets extends esq {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float l = 30.0F;
   private static final float m = 50.0F;
   private final ets.a n;
   private final Supplier<gag> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public ets(int $$0, int $$1, fia $$2, Supplier<gag> $$3) {
      super(0, 0, $$0, $$1, tm.a);
      this.n = ets.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(esh $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.r() + (float)this.l() / 2.0F, (float)(this.t() + this.i()), 100.0F);
      float $$4 = (float)this.i() / 2.125F;
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
      this.p = ary.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gds $$0) {
   }

   @Override
   protected void a(ewk $$0) {
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Nullable
   @Override
   public ese a(ewq $$0) {
      return null;
   }

   static record a(fgk<?> a, fgk<?> b) {
      public static ets.a a(fia $$0) {
         fgk<?> $$1 = new fgk($$0.a(fid.aM), false);
         fgk<?> $$2 = new fgk($$0.a(fid.aQ), true);
         $$1.e = false;
         $$2.e = false;
         return new ets.a($$1, $$2);
      }

      public void a(esh $$0, gag $$1) {
         $$0.e();
         ekn.c();
         $$0.c().a();
         $$0.c().a(new Matrix4f().scaling(1.0F, 1.0F, -1.0F));
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fgk<?> $$2 = $$1.e() == gag.a.a ? this.b : this.a;
         foo $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, fyx.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
         $$0.e();
         ekn.b();
      }
   }
}
