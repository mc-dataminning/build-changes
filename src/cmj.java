import javax.annotation.Nullable;

public abstract class cmj implements cmr {
   protected final cmh a;

   public cmj(cmh $$0) {
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
   public void a(arq $$0) {
   }

   @Override
   public void a(cmg $$0, iv $$1, bux $$2, @Nullable crj $$3) {
   }

   @Override
   public void c() {
   }

   @Override
   public void d() {
   }

   @Override
   public float e() {
      return 0.6F;
   }

   @Nullable
   @Override
   public fex f() {
      return null;
   }

   @Override
   public float a(bux $$0, float $$1) {
      return $$1;
   }

   @Override
   public float g() {
      float $$0 = (float)this.a.dx().i() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return 0.7F / $$1 / $$0;
   }
}
