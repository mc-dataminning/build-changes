import javax.annotation.Nullable;

public class dti extends drs implements dfa {
   private final ddh a = new ddh() {
      @Override
      public void a(deg $$0, je $$1, int $$2) {
         $$0.a($$1, dhl.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable deg $$0, je $$1, dez $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            duo $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dti(je $$0, duo $$1) {
      super(dru.j, $$0, $$1);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(deg $$0, je $$1, duo $$2, dti $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(deg $$0, je $$1, duo $$2, dti $$3) {
      $$3.a.a((arh)$$0, $$1);
   }

   public acg b() {
      return acg.a(this);
   }

   @Override
   public uf a(jp.a $$0) {
      uf $$1 = this.e($$0);
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
   public void a(btv<?> $$0, azl $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public ddh c() {
      return this.a;
   }
}
