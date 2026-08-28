public class blr extends bln {
   private final blo c;
   private final blq d;

   public blr(int $$0, blo $$1, blq $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public blr(int $$0, blo $$1, blq $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new adf((long[])this.b.clone(), this.d));
   }
}
