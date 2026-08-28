import javax.annotation.Nullable;

public class cmo extends cmj {
   @Nullable
   private fex b;

   public cmo(cmh $$0) {
      super($$0);
   }

   @Override
   public void a(arq $$0) {
      if (this.b == null) {
         this.b = this.a.ds();
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
   public fex f() {
      return this.b;
   }

   @Override
   public cmx<cmo> h() {
      return cmx.k;
   }
}
