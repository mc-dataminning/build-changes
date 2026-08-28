public class bmx extends bmt {
   private final bmu c;
   private final bmw d;

   public bmx(int $$0, bmu $$1, bmw $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bmx(int $$0, bmu $$1, bmw $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new ade((long[])this.b.clone(), this.d));
   }
}
