import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fbk extends fai {
   private static final float a = 0.0625F;
   private static final float b = 2.125F;
   private static final float c = 100.0F;
   private static final float d = 2.5F;
   private static final float e = -5.0F;
   private static final float f = 30.0F;
   private static final float m = 50.0F;
   private final fbk.a n;
   private final Supplier<giy> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fbk(int $$0, int $$1, fqb $$2, Supplier<giy> $$3) {
      super(0, 0, $$0, $$1, vr.a);
      this.n = fbk.a.a($$2);
      this.o = $$3;
   }

   @Override
   protected void b(ezx $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.B() + (float)this.w() / 2.0F, (float)(this.C() + this.u()), 100.0F);
      float $$4 = (float)this.u() / 2.125F;
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a(0.0F, -0.0625F, 0.0F);
      $$0.c().a(a.b.rotationDegrees(this.p), 0.0F, -1.0625F, 0.0F);
      $$0.c().a(a.d.rotationDegrees(this.q));
      $$0.e();
      erz.a(a.b.rotationDegrees(this.p));
      this.n.a($$0, this.o.get());
      $$0.e();
      erz.d();
      $$0.c().b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = awm.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(gmq $$0) {
   }

   @Override
   protected void a(fef $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public ezu a(fel $$0) {
      return null;
   }

   static record a(foj<?> a, foj<?> b) {
      public static fbk.a a(fqb $$0) {
         foj<?> $$1 = new foj($$0.a(fqe.aO), false);
         foj<?> $$2 = new foj($$0.a(fqe.aS), true);
         $$1.e = false;
         $$2.e = false;
         return new fbk.a($$1, $$2);
      }

      public void a(ezx $$0, giy $$1) {
         $$0.c().a();
         $$0.c().b(1.0F, 1.0F, -1.0F);
         $$0.c().a(0.0F, -1.5F, 0.0F);
         foj<?> $$2 = $$1.e() == giy.a.a ? this.b : this.a;
         fwy $$3 = $$2.a($$1.a());
         $$2.a($$0.c(), $$0.d().getBuffer($$3), 15728880, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.c().b();
      }
   }
}
