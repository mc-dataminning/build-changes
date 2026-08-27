public class abf implements uo<abe> {
   private static final int a = 1048576;
   private final int b;
   private final acq c;
   private final sf d;

   public abf(int $$0, acq $$1, sf $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public abf(sf $$0) {
      this.b = $$0.m();
      this.c = $$0.t();
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         this.d = new sf($$0.readBytes($$1));
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.b);
      $$0.a(this.c);
      $$0.writeBytes(this.d.copy());
   }

   public void a(abe $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public acq c() {
      return this.c;
   }

   public sf d() {
      return this.d;
   }
}
