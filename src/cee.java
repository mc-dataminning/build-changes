import javax.annotation.Nullable;

public class cee extends cdz {
   @Nullable
   private epr b;

   public cee(cdx $$0) {
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
   public epr g() {
      return this.b;
   }

   @Override
   public cen<cee> i() {
      return cen.k;
   }
}
