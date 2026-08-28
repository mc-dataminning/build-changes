public class bof extends bob {
   private final boc c;
   private final boe d;

   public bof(int $$0, boc $$1, boe $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bof(int $$0, boc $$1, boe $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new ads((long[])this.b.clone(), this.d));
   }
}
