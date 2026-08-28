import javax.annotation.Nullable;

public class duc extends dsm implements dfv {
   private final dec a = new dec() {
      @Override
      public void a(dfb $$0, jh $$1, int $$2) {
         $$0.a($$1, dig.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dfb $$0, jh $$1, dfu $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dvj $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public duc(jh $$0, dvj $$1) {
      super(dso.j, $$0, $$1);
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dfb $$0, jh $$1, dvj $$2, duc $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dfb $$0, jh $$1, dvj $$2, duc $$3) {
      $$3.a.a((arn)$$0, $$1);
   }

   public acl b() {
      return acl.a(this);
   }

   @Override
   public uk a(js.a $$0) {
      uk $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void a(bul<?> $$0, azs $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public dec c() {
      return this.a;
   }
}
