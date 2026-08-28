import javax.annotation.Nullable;

public class dvr extends dua implements dhe {
   private final dfk a = new dfk() {
      @Override
      public void a(dgj $$0, ji $$1, int $$2) {
         $$0.a($$1, djp.cA, $$2, 0);
      }

      @Override
      public void a(@Nullable dgj $$0, ji $$1, dhd $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dwy $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dvr(ji $$0, dwy $$1) {
      super(duc.j, $$0, $$1);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dgj $$0, ji $$1, dwy $$2, dvr $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dgj $$0, ji $$1, dwy $$2, dvr $$3) {
      $$3.a.a((ard)$$0, $$1);
   }

   public abs b() {
      return abs.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      tq $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public void a(but<?> $$0, azh $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dfk c() {
      return this.a;
   }
}
