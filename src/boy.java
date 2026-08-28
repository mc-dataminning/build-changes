public class boy extends bou {
   private final bov c;
   private final box d;

   public boy(int $$0, bov $$1, box $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public boy(int $$0, bov $$1, box $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acu((long[])this.b.clone(), this.d));
   }
}
