public class bmm extends bmi {
   private final bmj c;
   private final bml d;

   public bmm(int $$0, bmj $$1, bml $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bmm(int $$0, bmj $$1, bml $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new ada((long[])this.b.clone(), this.d));
   }
}
