public class bne extends bna {
   private final bnb c;
   private final bnd d;

   public bne(int $$0, bnb $$1, bnd $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bne(int $$0, bnb $$1, bnd $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acl((long[])this.b.clone(), this.d));
   }
}
