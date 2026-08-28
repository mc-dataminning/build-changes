import javax.annotation.Nullable;

public class cka extends cjv {
   @Nullable
   private fay b;

   public cka(cjt $$0) {
      super($$0);
   }

   @Override
   public void a(arc $$0) {
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
   public fay f() {
      return this.b;
   }

   @Override
   public ckj<cka> h() {
      return ckj.k;
   }
}
