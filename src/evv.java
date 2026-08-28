public class evv extends evx {
   private final jf b;
   private final ja c;
   private final boolean d;
   private final boolean e;

   public static evv a(evz $$0, jf $$1, ja $$2) {
      return new evv(true, $$0, $$1, $$2, false);
   }

   public evv(evz $$0, jf $$1, ja $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private evv(boolean $$0, evz $$1, jf $$2, ja $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public evv a(jf $$0) {
      return new evv(this.d, this.a, $$0, this.c, this.e);
   }

   public evv a(ja $$0) {
      return new evv(this.d, this.a, this.b, $$0, this.e);
   }

   public ja a() {
      return this.c;
   }

   public jf b() {
      return this.b;
   }

   @Override
   public evx.a c() {
      return this.d ? evx.a.a : evx.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
