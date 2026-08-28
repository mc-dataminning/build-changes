public class bnf extends bnb {
   private final bnc c;
   private final bne d;

   public bnf(int $$0, bnc $$1, bne $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bnf(int $$0, bnc $$1, bne $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acm((long[])this.b.clone(), this.d));
   }
}
