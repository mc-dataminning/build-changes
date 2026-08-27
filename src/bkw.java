public class bkw extends bks {
   private final bkt c;
   private final bkv d;

   public bkw(int $$0, bkt $$1, bkv $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bkw(int $$0, bkt $$1, bkv $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acr((long[])this.b.clone(), this.d));
   }
}
