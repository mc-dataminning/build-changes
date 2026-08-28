import javax.annotation.Nullable;

public class dqv extends dph implements dcq {
   private final dba a = new dba() {
      @Override
      public void a(dby $$0, iz $$1, int $$2) {
         $$0.a($$1, dfb.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dby $$0, iz $$1, dcp $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dsc $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dqv(iz $$0, dsc $$1) {
      super(dpj.j, $$0, $$1);
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dby $$0, iz $$1, dsc $$2, dqv $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dby $$0, iz $$1, dsc $$2, dqv $$3) {
      $$3.a.a((arf)$$0, $$1);
   }

   public acp b() {
      return acp.a(this);
   }

   @Override
   public us a(jk.a $$0) {
      us $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bta<?> $$0, azh $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dba c() {
      return this.a;
   }
}
