import javax.annotation.Nullable;

public abstract class ckr implements ckz {
   protected final ckp a;

   public ckr(ckp $$0) {
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
   public void a(ard $$0) {
   }

   @Override
   public void a(cko $$0, ji $$1, btp $$2, @Nullable cpr $$3) {
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
   public fbx f() {
      return null;
   }

   @Override
   public float a(btp $$0, float $$1) {
      return $$1;
   }

   @Override
   public float g() {
      float $$0 = (float)this.a.dx().i() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return 0.7F / $$1 / $$0;
   }
}
