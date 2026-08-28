public class evp extends evr {
   private final je b;
   private final iz c;
   private final boolean d;
   private final boolean e;

   public static evp a(evt $$0, je $$1, iz $$2) {
      return new evp(true, $$0, $$1, $$2, false);
   }

   public evp(evt $$0, je $$1, iz $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private evp(boolean $$0, evt $$1, je $$2, iz $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public evp a(je $$0) {
      return new evp(this.d, this.a, $$0, this.c, this.e);
   }

   public evp a(iz $$0) {
      return new evp(this.d, this.a, this.b, $$0, this.e);
   }

   public iz a() {
      return this.c;
   }

   public je b() {
      return this.b;
   }

   @Override
   public evr.a c() {
      return this.d ? evr.a.a : evr.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
