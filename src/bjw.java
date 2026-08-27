public class bjw extends bjs {
   private final bjt c;
   private final bjv d;

   public bjw(int $$0, bjt $$1, bjv $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bjw(int $$0, bjt $$1, bjv $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new abz((long[])this.b.clone(), this.d));
   }
}
