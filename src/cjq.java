import javax.annotation.Nullable;

public class cjq extends cjl {
   @Nullable
   private ezh b;

   public cjq(cjj $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dv();
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
   public ezh g() {
      return this.b;
   }

   @Override
   public cjz<cjq> i() {
      return cjz.k;
   }
}
