import javax.annotation.Nullable;

public class dtl extends drv implements dfd {
   private final ddk a = new ddk() {
      @Override
      public void a(dej $$0, jf $$1, int $$2) {
         $$0.a($$1, dho.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dej $$0, jf $$1, dfc $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dus $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dtl(jf $$0, dus $$1) {
      super(drx.j, $$0, $$1);
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dej $$0, jf $$1, dus $$2, dtl $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dej $$0, jf $$1, dus $$2, dtl $$3) {
      $$3.a.a((arj)$$0, $$1);
   }

   public ach b() {
      return ach.a(this);
   }

   @Override
   public ug a(jq.a $$0) {
      ug $$1 = this.e($$0);
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
   public void a(bty<?> $$0, azn $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public ddk c() {
      return this.a;
   }
}
