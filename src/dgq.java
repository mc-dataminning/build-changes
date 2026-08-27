import javax.annotation.Nullable;

public class dgq extends dfd {
   private final crc a = new crc() {
      @Override
      public void a(csa $$0, ht $$1, int $$2) {
         $$0.a($$1, cvc.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable csa $$0, ht $$1, csr $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dhi $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dgq(ht $$0, dhi $$1) {
      super(dff.j, $$0, $$1);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(csa $$0, ht $$1, dhi $$2, dgq $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(csa $$0, ht $$1, dhi $$2, dgq $$3) {
      $$3.a.a((ame)$$0, $$1);
   }

   public yk c() {
      return yk.a(this);
   }

   @Override
   public rz aw_() {
      rz $$0 = this.o();
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

   public void a(bku<?> $$0, ats $$1) {
      this.a.a($$0, this.o, $$1, this.p);
   }

   public crc d() {
      return this.a;
   }
}
