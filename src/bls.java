public class bls extends blo {
   private final blp c;
   private final blr d;

   public bls(int $$0, blp $$1, blr $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bls(int $$0, blp $$1, blr $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acu((long[])this.b.clone(), this.d));
   }
}
