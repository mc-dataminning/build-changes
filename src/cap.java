import javax.annotation.Nullable;

public class cap extends cak {
   @Nullable
   private elm b;

   public cap(cai $$0) {
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
   public elm g() {
      return this.b;
   }

   @Override
   public cay<cap> i() {
      return cay.k;
   }
}
