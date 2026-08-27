import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class exh extends ewf {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float l = 30.0F;
   private static final float m = 50.0F;
   private final exh.a n;
   private final Supplier<geo> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public exh(int $$0, int $$1, flu $$2, Supplier<geo> $$3) {
      super(0, 0, $$0, $$1, va.a);
      this.n = exh.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(evw $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.p() + (float)this.k() / 2.0F, (float)(this.r() + this.i()), 100.0F);
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
      this.p = aty.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gia $$0) {
   }

   @Override
   protected void a(faa $$0) {
   }

   @Override
   public boolean aL_() {
      return false;
   }

   @Nullable
   @Override
   public evt a(fag $$0) {
      return null;
   }

   static record a(fkd<?> a, fkd<?> b) {
      public static exh.a a(flu $$0) {
         fkd<?> $$1 = new fkd($$0.a(flx.aP), false);
         fkd<?> $$2 = new fkd($$0.a(flx.aT), true);
         $$1.e = false;
         $$2.e = false;
         return new exh.a($$1, $$2);
      }

      public void a(evw $$0, geo $$1) {
         $$0.e();
         enz.c();
         $$0.c().a();
         $$0.c().a(new Matrix4f().scaling(1.0F, 1.0F, -1.0F));
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fkd<?> $$2 = $$1.e() == geo.a.a ? this.b : this.a;
         fsq $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, gdf.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
         $$0.e();
         enz.b();
      }
   }
}
