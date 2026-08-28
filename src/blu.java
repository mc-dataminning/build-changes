public class blu extends blq {
   private final blr c;
   private final blt d;

   public blu(int $$0, blr $$1, blt $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public blu(int $$0, blr $$1, blt $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new adi((long[])this.b.clone(), this.d));
   }
}
