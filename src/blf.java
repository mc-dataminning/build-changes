public class blf extends blb {
   private final blc c;
   private final ble d;

   public blf(int $$0, blc $$1, ble $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public blf(int $$0, blc $$1, ble $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new aco((long[])this.b.clone(), this.d));
   }
}
