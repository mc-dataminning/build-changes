import javax.annotation.Nullable;

public class cne extends cmz {
   @Nullable
   private ffs b;

   public cne(cmx $$0) {
      super($$0);
   }

   @Override
   public void a(aru $$0) {
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
   public ffs f() {
      return this.b;
   }

   @Override
   public cnn<cne> h() {
      return cnn.k;
   }
}
