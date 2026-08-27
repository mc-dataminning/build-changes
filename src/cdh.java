import javax.annotation.Nullable;

public abstract class cdh implements cdp {
   protected final cdf a;

   public cdh(cdf $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return false;
   }

   @Override
   public void b() {
   }

   @Override
   public void c() {
   }

   @Override
   public void a(cde $$0, ib $$1, bne $$2, @Nullable cia $$3) {
   }

   @Override
   public void d() {
   }

   @Override
   public void e() {
   }

   @Override
   public float f() {
      return 0.6F;
   }

   @Nullable
   @Override
   public eov g() {
      return null;
   }

   @Override
   public float a(bne $$0, float $$1) {
      return $$1;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.dm().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return 0.7F / $$1 / $$0;
   }
}
