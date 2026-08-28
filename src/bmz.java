public class bmz extends bmv {
   private final bmw c;
   private final bmy d;

   public bmz(int $$0, bmw $$1, bmy $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bmz(int $$0, bmw $$1, bmy $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new adf((long[])this.b.clone(), this.d));
   }
}
