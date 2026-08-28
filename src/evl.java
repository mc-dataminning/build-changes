public class evl extends evn {
   private final je b;
   private final iz c;
   private final boolean d;
   private final boolean e;

   public static evl a(evp $$0, je $$1, iz $$2) {
      return new evl(true, $$0, $$1, $$2, false);
   }

   public evl(evp $$0, je $$1, iz $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private evl(boolean $$0, evp $$1, je $$2, iz $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public evl a(je $$0) {
      return new evl(this.d, this.a, $$0, this.c, this.e);
   }

   public evl a(iz $$0) {
      return new evl(this.d, this.a, this.b, $$0, this.e);
   }

   public iz a() {
      return this.c;
   }

   public je b() {
      return this.b;
   }

   @Override
   public evn.a c() {
      return this.d ? evn.a.a : evn.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
