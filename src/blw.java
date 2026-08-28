public class blw extends bls {
   private final blt c;
   private final blv d;

   public blw(int $$0, blt $$1, blv $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public blw(int $$0, blt $$1, blv $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new adj((long[])this.b.clone(), this.d));
   }
}
