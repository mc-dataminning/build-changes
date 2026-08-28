public class bpa extends bow {
   private final box c;
   private final boz d;

   public bpa(int $$0, box $$1, boz $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bpa(int $$0, box $$1, boz $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acu((long[])this.b.clone(), this.d));
   }
}
