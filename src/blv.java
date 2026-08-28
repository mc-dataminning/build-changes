public class blv extends blr {
   private final bls c;
   private final blu d;

   public blv(int $$0, bls $$1, blu $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public blv(int $$0, bls $$1, blu $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new adi((long[])this.b.clone(), this.d));
   }
}
