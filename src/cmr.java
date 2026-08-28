import javax.annotation.Nullable;

public class cmr extends cmm {
   @Nullable
   private ffc b;

   public cmr(cmk $$0) {
      super($$0);
   }

   @Override
   public void a(arq $$0) {
      if (this.b == null) {
         this.b = this.a.ds();
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
   public ffc f() {
      return this.b;
   }

   @Override
   public cna<cmr> h() {
      return cna.k;
   }
}
