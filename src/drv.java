import javax.annotation.Nullable;

public class drv extends dqc implements dcs {
   private final dbc a = new dbc() {
      @Override
      public void a(dca $$0, ir $$1, int $$2) {
         $$0.a($$1, dfe.de, $$2, 0);
      }

      @Override
      public void a(@Nullable dca $$0, ir $$1, dcr $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dtc $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public drv(ir $$0, dtc $$1) {
      super(dqe.k, $$0, $$1);
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dca $$0, ir $$1, dtc $$2, drv $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dca $$0, ir $$1, dtc $$2, drv $$3) {
      $$3.a.a((aqt)$$0, $$1);
   }

   public ace b() {
      return ace.a(this);
   }

   @Override
   public uk a(jc.a $$0) {
      uk $$1 = this.d($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean b_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.b_($$0, $$1);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bsb<?> $$0, ayt $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dbc c() {
      return this.a;
   }
}
