import javax.annotation.Nullable;

public class cct extends cco {
   @Nullable
   private ens b;

   public cct(ccm $$0) {
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
   public ens g() {
      return this.b;
   }

   @Override
   public cdc<cct> i() {
      return cdc.k;
   }
}
