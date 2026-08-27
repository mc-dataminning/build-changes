import javax.annotation.Nullable;

public class ccx extends ccs {
   @Nullable
   private enz b;

   public ccx(ccq $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dk();
      }
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Override
   public float f() {
      return 1.0F;
   }

   @Nullable
   @Override
   public enz g() {
      return this.b;
   }

   @Override
   public cdg<ccx> i() {
      return cdg.k;
   }
}
