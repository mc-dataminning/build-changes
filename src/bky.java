public class bky extends bku {
   private final bkv c;
   private final bkx d;

   public bky(int $$0, bkv $$1, bkx $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bky(int $$0, bkv $$1, bkx $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acr((long[])this.b.clone(), this.d));
   }
}
