import javax.annotation.Nullable;

public class cjz extends cju {
   @Nullable
   private ezr b;

   public cjz(cjs $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dw();
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
   public ezr g() {
      return this.b;
   }

   @Override
   public cki<cjz> i() {
      return cki.k;
   }
}
