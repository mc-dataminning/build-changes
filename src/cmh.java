import javax.annotation.Nullable;

public class cmh extends cmc {
   @Nullable
   private feq b;

   public cmh(cma $$0) {
      super($$0);
   }

   @Override
   public void a(arq $$0) {
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
   public feq f() {
      return this.b;
   }

   @Override
   public cmq<cmh> h() {
      return cmq.k;
   }
}
