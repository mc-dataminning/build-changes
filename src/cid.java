import javax.annotation.Nullable;

public abstract class cid implements cil {
   protected final cib a;

   public cid(cib $$0) {
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
   public void a(cia $$0, iz $$1, brn $$2, @Nullable cmx $$3) {
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
   public evr g() {
      return null;
   }

   @Override
   public float a(brn $$0, float $$1) {
      return $$1;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.ds().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return 0.7F / $$1 / $$0;
   }
}
