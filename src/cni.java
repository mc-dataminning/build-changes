import javax.annotation.Nullable;

public abstract class cni implements cnq {
   protected final cng a;

   public cni(cng $$0) {
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
   public void a(asb $$0) {
   }

   @Override
   public void a(cnf $$0, iw $$1, bvt $$2, @Nullable csi $$3) {
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
   public fgc f() {
      return null;
   }

   @Override
   public float a(bvt $$0, float $$1) {
      return $$1;
   }

   @Override
   public float g() {
      float $$0 = (float)this.a.dy().i() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return 0.7F / $$1 / $$0;
   }
}
