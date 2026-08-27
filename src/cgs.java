import javax.annotation.Nullable;

public class cgs extends cgn {
   @Nullable
   private etp b;

   public cgs(cgl $$0) {
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
   public etp g() {
      return this.b;
   }

   @Override
   public chb<cgs> i() {
      return chb.k;
   }
}
