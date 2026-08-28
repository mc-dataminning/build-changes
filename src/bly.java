public class bly extends blu {
   private final blv c;
   private final blx d;

   public bly(int $$0, blv $$1, blx $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bly(int $$0, blv $$1, blx $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new adj((long[])this.b.clone(), this.d));
   }
}
