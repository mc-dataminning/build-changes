public class bik extends big {
   private final bih c;
   private final bij d;

   public bik(int $$0, bih $$1, bij $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bik(int $$0, bih $$1, bij $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new abj((long[])this.b.clone(), this.d));
   }
}
