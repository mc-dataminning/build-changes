import javax.annotation.Nullable;

public class cfw extends cfr {
   @Nullable
   private etf b;

   public cfw(cfp $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dl();
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
   public etf g() {
      return this.b;
   }

   @Override
   public cgf<cfw> i() {
      return cgf.k;
   }
}
