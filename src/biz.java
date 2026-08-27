public class biz extends biv {
   private final biw c;
   private final biy d;

   public biz(int $$0, biw $$1, biy $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public biz(int $$0, biw $$1, biy $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new abn((long[])this.b.clone(), this.d));
   }
}
