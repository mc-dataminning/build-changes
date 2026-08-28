public class bnd extends bmz {
   private final bna c;
   private final bnc d;

   public bnd(int $$0, bna $$1, bnc $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bnd(int $$0, bna $$1, bnc $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new adi((long[])this.b.clone(), this.d));
   }
}
