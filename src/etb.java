public class etb extends etd {
   private final ir b;
   private final im c;
   private final boolean d;
   private final boolean e;

   public static etb a(etf $$0, ir $$1, im $$2) {
      return new etb(true, $$0, $$1, $$2, false);
   }

   public etb(etf $$0, ir $$1, im $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private etb(boolean $$0, etf $$1, ir $$2, im $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public etb a(ir $$0) {
      return new etb(this.d, this.a, $$0, this.c, this.e);
   }

   public etb a(im $$0) {
      return new etb(this.d, this.a, this.b, $$0, this.e);
   }

   public im a() {
      return this.c;
   }

   public ir b() {
      return this.b;
   }

   @Override
   public etd.a c() {
      return this.d ? etd.a.a : etd.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
