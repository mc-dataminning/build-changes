public class bov extends bor {
   private final bos c;
   private final bou d;

   public bov(int $$0, bos $$1, bou $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bov(int $$0, bos $$1, bou $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acs((long[])this.b.clone(), this.d));
   }
}
