import javax.annotation.Nullable;

public class dec extends dcq {
   private final cos a = new cos() {
      @Override
      public void a(cpq $$0, gw $$1, int $$2) {
         $$0.a($$1, csr.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable cpq $$0, gw $$1, cqh $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dfe $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dec(gw $$0, dfe $$1) {
      super(dcs.j, $$0, $$1);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(cpq $$0, gw $$1, dfe $$2, dec $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(cpq $$0, gw $$1, dfe $$2, dec $$3) {
      $$3.a.a((akn)$$0, $$1);
   }

   public xa c() {
      return xa.a(this);
   }

   @Override
   public qu an_() {
      qu $$0 = this.o();
      $$0.r("SpawnPotentials");
      return $$0;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean t() {
      return true;
   }

   public void a(bip<?> $$0, arx $$1) {
      this.a.a($$0, this.o, $$1, this.p);
   }

   public cos d() {
      return this.a;
   }
}
