import javax.annotation.Nullable;

public class cdm extends cdh {
   @Nullable
   private eov b;

   public cdm(cdf $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dh();
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
   public eov g() {
      return this.b;
   }

   @Override
   public cdv<cdm> i() {
      return cdv.k;
   }
}
