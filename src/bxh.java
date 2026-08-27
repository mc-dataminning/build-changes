import javax.annotation.Nullable;

public class bxh extends bxc {
   @Nullable
   private ehe b;

   public bxh(bxa $$0) {
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
   public ehe g() {
      return this.b;
   }

   @Override
   public bxq<bxh> i() {
      return bxq.k;
   }
}
