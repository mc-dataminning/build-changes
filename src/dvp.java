import javax.annotation.Nullable;

public class dvp extends dty implements dhc {
   private final dfi a = new dfi() {
      @Override
      public void a(dgh $$0, ji $$1, int $$2) {
         $$0.a($$1, djn.cA, $$2, 0);
      }

      @Override
      public void a(@Nullable dgh $$0, ji $$1, dhb $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dww $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dvp(ji $$0, dww $$1) {
      super(dua.j, $$0, $$1);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dgh $$0, ji $$1, dww $$2, dvp $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dgh $$0, ji $$1, dww $$2, dvp $$3) {
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
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public void a(bur<?> $$0, azh $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public dfi c() {
      return this.a;
   }
}
