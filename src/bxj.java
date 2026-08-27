import javax.annotation.Nullable;

public class bxj extends bxe {
   @Nullable
   private ehi b;

   public bxj(bxc $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.di();
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
   public ehi g() {
      return this.b;
   }

   @Override
   public bxs<bxj> i() {
      return bxs.k;
   }
}
