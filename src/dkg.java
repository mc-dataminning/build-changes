import javax.annotation.Nullable;

public class dkg extends dit implements cwf {
   private final cup a = new cup() {
      @Override
      public void a(cvn $$0, hz $$1, int $$2) {
         $$0.a($$1, cyq.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable cvn $$0, hz $$1, cwe $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dlf $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dkg(hz $$0, dlf $$1) {
      super(div.j, $$0, $$1);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(cvn $$0, hz $$1, dlf $$2, dkg $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(cvn $$0, hz $$1, dlf $$2, dkg $$3) {
      $$3.a.a((aov)$$0, $$1);
   }

   public aan c() {
      return aan.a(this);
   }

   @Override
   public sw aA_() {
      sw $$0 = this.q();
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
   public void a(bnu<?> $$0, awo $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public cup d() {
      return this.a;
   }
}
