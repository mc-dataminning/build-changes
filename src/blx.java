public class blx extends blt {
   private final blu c;
   private final blw d;

   public blx(int $$0, blu $$1, blw $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public blx(int $$0, blu $$1, blw $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new adj((long[])this.b.clone(), this.d));
   }
}
