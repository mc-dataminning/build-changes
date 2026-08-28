import javax.annotation.Nullable;

public class ckw extends ckr {
   @Nullable
   private fbs b;

   public ckw(ckp $$0) {
      super($$0);
   }

   @Override
   public void a(ash $$0) {
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
   public fbs f() {
      return this.b;
   }

   @Override
   public clf<ckw> h() {
      return clf.k;
   }
}
