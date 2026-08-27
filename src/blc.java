public class blc extends bky {
   private final bkz c;
   private final blb d;

   public blc(int $$0, bkz $$1, blb $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public blc(int $$0, bkz $$1, blb $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acy((long[])this.b.clone(), this.d));
   }
}
