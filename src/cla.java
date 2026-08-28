import javax.annotation.Nullable;

public class cla extends ckv {
   @Nullable
   private fbx b;

   public cla(ckt $$0) {
      super($$0);
   }

   @Override
   public void a(ash $$0) {
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
   public fbx f() {
      return this.b;
   }

   @Override
   public clj<cla> h() {
      return clj.k;
   }
}
