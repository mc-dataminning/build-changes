import javax.annotation.Nullable;

public class cks extends ckn {
   @Nullable
   private fbr b;

   public cks(ckl $$0) {
      super($$0);
   }

   @Override
   public void a(arx $$0) {
      if (this.b == null) {
         this.b = this.a.du();
      }
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public void c() {
      this.b = null;
   }

   @Override
   public float e() {
      return 1.0F;
   }

   @Nullable
   @Override
   public fbr f() {
      return this.b;
   }

   @Override
   public clb<cks> h() {
      return clb.k;
   }
}
