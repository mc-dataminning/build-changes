import javax.annotation.Nullable;

public class cjv extends cjq {
   @Nullable
   private ezn b;

   public cjv(cjo $$0) {
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
   public ezn g() {
      return this.b;
   }

   @Override
   public cke<cjv> i() {
      return cke.k;
   }
}
