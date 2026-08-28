public class boe extends boa {
   private final bob c;
   private final bod d;

   public boe(int $$0, bob $$1, bod $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public boe(int $$0, bob $$1, bod $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new ads((long[])this.b.clone(), this.d));
   }
}
