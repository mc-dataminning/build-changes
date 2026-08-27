import javax.annotation.Nullable;

public class diq extends dhd implements cup {
   private final csz a = new csz() {
      @Override
      public void a(ctx $$0, hx $$1, int $$2) {
         $$0.a($$1, cxa.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable ctx $$0, hx $$1, cuo $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            djp $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public diq(hx $$0, djp $$1) {
      super(dhf.j, $$0, $$1);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(ctx $$0, hx $$1, djp $$2, diq $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(ctx $$0, hx $$1, djp $$2, diq $$3) {
      $$3.a.a((ane)$$0, $$1);
   }

   public zi c() {
      return zi.a(this);
   }

   @Override
   public so aA_() {
      so $$0 = this.q();
      $$0.r("SpawnPotentials");
      return $$0;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(bmc<?> $$0, auw $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public csz d() {
      return this.a;
   }
}
