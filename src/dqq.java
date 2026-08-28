import javax.annotation.Nullable;

public class dqq extends dpc implements dcl {
   private final dav a = new dav() {
      @Override
      public void a(dbt $$0, iz $$1, int $$2) {
         $$0.a($$1, dew.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dbt $$0, iz $$1, dck $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            drx $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dqq(iz $$0, drx $$1) {
      super(dpe.j, $$0, $$1);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dbt $$0, iz $$1, drx $$2, dqq $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dbt $$0, iz $$1, drx $$2, dqq $$3) {
      $$3.a.a((arb)$$0, $$1);
   }

   public acl b() {
      return acl.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      ur $$1 = this.e($$0);
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
   public void a(bsv<?> $$0, azc $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dav c() {
      return this.a;
   }
}
