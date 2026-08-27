public class bko extends bkk {
   private final bkl c;
   private final bkn d;

   public bko(int $$0, bkl $$1, bkn $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bko(int $$0, bkl $$1, bkn $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acn((long[])this.b.clone(), this.d));
   }
}
