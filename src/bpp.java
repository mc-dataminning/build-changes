public class bpp extends bpl {
   private final bpm c;
   private final bpo d;

   public bpp(int $$0, bpm $$1, bpo $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bpp(int $$0, bpm $$1, bpo $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new adf((long[])this.b.clone(), this.d));
   }
}
