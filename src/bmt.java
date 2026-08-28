public class bmt extends bmp {
   private final bmq c;
   private final bms d;

   public bmt(int $$0, bmq $$1, bms $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bmt(int $$0, bmq $$1, bms $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new adb((long[])this.b.clone(), this.d));
   }
}
