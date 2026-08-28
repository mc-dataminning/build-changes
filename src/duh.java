import javax.annotation.Nullable;

public class duh extends dsr implements dga {
   private final deg a = new deg() {
      @Override
      public void a(dff $$0, jh $$1, int $$2) {
         $$0.a($$1, dil.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dff $$0, jh $$1, dfz $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dvo $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public duh(jh $$0, dvo $$1) {
      super(dst.j, $$0, $$1);
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dff $$0, jh $$1, dvo $$2, duh $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dff $$0, jh $$1, dvo $$2, duh $$3) {
      $$3.a.a((arq)$$0, $$1);
   }

   public aco b() {
      return aco.a(this);
   }

   @Override
   public un a(js.a $$0) {
      un $$1 = this.e($$0);
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
   public void a(bup<?> $$0, azv $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public deg c() {
      return this.a;
   }
}
