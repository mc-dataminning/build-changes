import javax.annotation.Nullable;

public class cmd extends cly {
   @Nullable
   private fei b;

   public cmd(clw $$0) {
      super($$0);
   }

   @Override
   public void a(arq $$0) {
      if (this.b == null) {
         this.b = this.a.dt();
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
   public fei f() {
      return this.b;
   }

   @Override
   public cmm<cmd> h() {
      return cmm.k;
   }
}
