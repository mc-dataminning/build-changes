public class ewq extends ews {
   private final iw b;
   private final ir c;
   private final boolean d;
   private final boolean e;

   public static ewq a(ewu $$0, iw $$1, ir $$2) {
      return new ewq(true, $$0, $$1, $$2, false);
   }

   public ewq(ewu $$0, iw $$1, ir $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private ewq(boolean $$0, ewu $$1, iw $$2, ir $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public ewq a(iw $$0) {
      return new ewq(this.d, this.a, $$0, this.c, this.e);
   }

   public ewq a(ir $$0) {
      return new ewq(this.d, this.a, this.b, $$0, this.e);
   }

   public ir a() {
      return this.c;
   }

   public iw b() {
      return this.b;
   }

   @Override
   public ews.a c() {
      return this.d ? ews.a.a : ews.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
