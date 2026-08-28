import javax.annotation.Nullable;

public class ckd extends cjy {
   @Nullable
   private fbb b;

   public ckd(cjw $$0) {
      super($$0);
   }

   @Override
   public void a(ard $$0) {
      if (this.b == null) {
         this.b = this.a.dt();
      }
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public void c() {
      this.b = null;
   }

   @Override
   public float e() {
      return 1.0F;
   }

   @Nullable
   @Override
   public fbb f() {
      return this.b;
   }

   @Override
   public ckm<ckd> h() {
      return ckm.k;
   }
}
