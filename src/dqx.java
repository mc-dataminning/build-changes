import javax.annotation.Nullable;

public class dqx extends dpj implements dcs {
   private final dbc a = new dbc() {
      @Override
      public void a(dca $$0, iz $$1, int $$2) {
         $$0.a($$1, dfd.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dca $$0, iz $$1, dcr $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dse $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dqx(iz $$0, dse $$1) {
      super(dpl.j, $$0, $$1);
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

   public static void a(dca $$0, iz $$1, dse $$2, dqx $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dca $$0, iz $$1, dse $$2, dqx $$3) {
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
   public void a(btc<?> $$0, azh $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dbc c() {
      return this.a;
   }
}
