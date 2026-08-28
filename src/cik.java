import javax.annotation.Nullable;

public class cik extends cif {
   @Nullable
   private evt b;

   public cik(cid $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.dn();
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
   public evt g() {
      return this.b;
   }

   @Override
   public cit<cik> i() {
      return cit.k;
   }
}
