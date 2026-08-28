import javax.annotation.Nullable;

public class clx extends cls {
   @Nullable
   private fdw b;

   public clx(clq $$0) {
      super($$0);
   }

   @Override
   public void a(aro $$0) {
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
   public fdw f() {
      return this.b;
   }

   @Override
   public cmg<clx> h() {
      return cmg.k;
   }
}
