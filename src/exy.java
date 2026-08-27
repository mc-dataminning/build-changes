import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class exy extends eww {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final exy.a n;
   private final Supplier<gff> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public exy(int $$0, int $$1, fml $$2, Supplier<gff> $$3) {
      super(0, 0, $$0, $$1, vc.a);
      this.n = exy.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(ewm $$0, int $$1, int $$2, float $$3) {
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
      this.p = aui.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gir $$0) {
   }

   @Override
   protected void a(far $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public ewj a(fax $$0) {
      return null;
   }

   static record a(fku<?> a, fku<?> b) {
      public static exy.a a(fml $$0) {
         fku<?> $$1 = new fku($$0.a(fmo.aP), false);
         fku<?> $$2 = new fku($$0.a(fmo.aT), true);
         $$1.e = false;
         $$2.e = false;
         return new exy.a($$1, $$2);
      }

      public void a(ewm $$0, gff $$1) {
         $$0.e();
         eop.c();
         $$0.c().a();
         $$0.c().a(new Matrix4f().scaling(1.0F, 1.0F, -1.0F));
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fku<?> $$2 = $$1.e() == gff.a.a ? this.b : this.a;
         fth $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
         $$0.e();
         eop.b();
      }
   }
}
