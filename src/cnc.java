import javax.annotation.Nullable;

public class cnc extends cmx {
   @Nullable
   private ffq b;

   public cnc(cmv $$0) {
      super($$0);
   }

   @Override
   public void a(ars $$0) {
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
   public ffq f() {
      return this.b;
   }

   @Override
   public cnl<cnc> h() {
      return cnl.k;
   }
}
