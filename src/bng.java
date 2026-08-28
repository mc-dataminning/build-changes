public class bng extends bnc {
   private final bnd c;
   private final bnf d;

   public bng(int $$0, bnd $$1, bnf $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bng(int $$0, bnd $$1, bnf $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acm((long[])this.b.clone(), this.d));
   }
}
