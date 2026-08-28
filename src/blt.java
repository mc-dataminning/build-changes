public class blt extends blp {
   private final blq c;
   private final bls d;

   public blt(int $$0, blq $$1, bls $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public blt(int $$0, blq $$1, bls $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acv((long[])this.b.clone(), this.d));
   }
}
