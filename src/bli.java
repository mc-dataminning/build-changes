public class bli extends ble {
   private final blf c;
   private final blh d;

   public bli(int $$0, blf $$1, blh $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bli(int $$0, blf $$1, blh $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new aco((long[])this.b.clone(), this.d));
   }
}
