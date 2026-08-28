public class bmq extends bmm {
   private final bmn c;
   private final bmp d;

   public bmq(int $$0, bmn $$1, bmp $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bmq(int $$0, bmn $$1, bmp $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new ada((long[])this.b.clone(), this.d));
   }
}
