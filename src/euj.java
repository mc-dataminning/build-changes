import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class euj extends eth {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float l = 30.0F;
   private static final float m = 50.0F;
   private final euj.a n;
   private final Supplier<gba> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public euj(int $$0, int $$1, fis $$2, Supplier<gba> $$3) {
      super(0, 0, $$0, $$1, uh.a);
      this.n = euj.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(esy $$0, int $$1, int $$2, float $$3) {
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
      this.p = asy.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gem $$0) {
   }

   @Override
   protected void a(exc $$0) {
   }

   @Override
   public boolean aJ_() {
      return false;
   }

   @Nullable
   @Override
   public esv a(exi $$0) {
      return null;
   }

   static record a(fhc<?> a, fhc<?> b) {
      public static euj.a a(fis $$0) {
         fhc<?> $$1 = new fhc($$0.a(fiv.aM), false);
         fhc<?> $$2 = new fhc($$0.a(fiv.aQ), true);
         $$1.e = false;
         $$2.e = false;
         return new euj.a($$1, $$2);
      }

      public void a(esy $$0, gba $$1) {
         $$0.e();
         eld.c();
         $$0.c().a();
         $$0.c().a(new Matrix4f().scaling(1.0F, 1.0F, -1.0F));
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fhc<?> $$2 = $$1.e() == gba.a.a ? this.b : this.a;
         fpj $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, fzr.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
         $$0.e();
         eld.b();
      }
   }
}
