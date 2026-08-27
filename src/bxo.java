import javax.annotation.Nullable;

public class bxo extends bxj {
   @Nullable
   private ehn b;

   public bxo(bxh $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dj();
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
   public ehn g() {
      return this.b;
   }

   @Override
   public bxx<bxo> i() {
      return bxx.k;
   }
}
