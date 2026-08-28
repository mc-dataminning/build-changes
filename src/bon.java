public class bon extends boj {
   private final bok c;
   private final bom d;

   public bon(int $$0, bok $$1, bom $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bon(int $$0, bok $$1, bom $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acr((long[])this.b.clone(), this.d));
   }
}
