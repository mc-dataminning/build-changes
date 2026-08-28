public class evn extends evp {
   private final je b;
   private final iz c;
   private final boolean d;
   private final boolean e;

   public static evn a(evr $$0, je $$1, iz $$2) {
      return new evn(true, $$0, $$1, $$2, false);
   }

   public evn(evr $$0, je $$1, iz $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private evn(boolean $$0, evr $$1, je $$2, iz $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public evn a(je $$0) {
      return new evn(this.d, this.a, $$0, this.c, this.e);
   }

   public evn a(iz $$0) {
      return new evn(this.d, this.a, this.b, $$0, this.e);
   }

   public iz a() {
      return this.c;
   }

   public je b() {
      return this.b;
   }

   @Override
   public evp.a c() {
      return this.d ? evp.a.a : evp.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
