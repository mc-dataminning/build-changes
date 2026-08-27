public class dqa extends dqc {
   public static final String a = "amount";
   private static final double b = 10.0;
   private static final int c = 5;
   private static final String d = "delay";
   private int e = 5;
   private int f;

   public dqa(ir $$0, dtc $$1) {
      super(dqe.T, $$0, $$1);
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      this.f = $$0.h("amount");
      this.e = $$0.h("delay");
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      $$0.a("amount", this.f);
      $$0.a("delay", this.e);
   }

   public int b() {
      return this.f;
   }

   public void a(int $$0) {
      this.f = $$0;
   }

   @Override
   public void a(ka.a $$0) {
      super.a($$0);
      $$0.a(ke.ae, new cyb(this.f));
   }

   @Override
   public void a(uk $$0) {
      $$0.r("amount");
   }

   public static void a(dca $$0, ir $$1, dtc $$2, dqa $$3) {
      if (--$$3.e <= 0) {
         $$3.e = 5;
         ewp $$4 = ewp.a(ewu.b($$1), 10.0, 10.0, 10.0);

         for (bse $$5 : $$0.a(dxj.a(bse.class), $$4, $$0x -> true)) {
            $$5.a($$1);
         }
      }
   }
}
