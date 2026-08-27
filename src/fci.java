import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fci extends fbg {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fci.a n;
   private final Supplier<gkb> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fci(int $$0, int $$1, frb $$2, Supplier<gkb> $$3) {
      super(0, 0, $$0, $$1, vt.a);
      this.n = fci.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(fav $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.B() + (float)this.w() / 2.0F, (float)(this.C() + this.u()), 100.0F);
      float $$4 = (float)this.u() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.e();
      esx.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.e();
      esx.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = aww.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gnt $$0) {
   }

   @Override
   protected void a(ffe $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public fas a(ffk $$0) {
      return null;
   }

   static record a(fpk<?> a, fpk<?> b) {
      public static fci.a a(frb $$0) {
         fpk<?> $$1 = new fpk($$0.a(fre.aS), false);
         fpk<?> $$2 = new fpk($$0.a(fre.aW), true);
         $$1.e = false;
         $$2.e = false;
         return new fci.a($$1, $$2);
      }

      public void a(fav $$0, gkb $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.5F, 0.0F);
         fpk<?> $$2 = $$1.e() == gkb.a.a ? this.b : this.a;
         fya $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, git.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
      }
   }
}
