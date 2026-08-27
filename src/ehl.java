public class ehl extends ehn {
   private final hc b;
   private final gw c;
   private final boolean d;
   private final boolean e;

   public static ehl a(ehp $$0, hc $$1, gw $$2) {
      return new ehl(true, $$0, $$1, $$2, false);
   }

   public ehl(ehp $$0, hc $$1, gw $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private ehl(boolean $$0, ehp $$1, hc $$2, gw $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public ehl a(hc $$0) {
      return new ehl(this.d, this.a, $$0, this.c, this.e);
   }

   public ehl a(gw $$0) {
      return new ehl(this.d, this.a, this.b, $$0, this.e);
   }

   public gw a() {
      return this.c;
   }

   public hc b() {
      return this.b;
   }

   @Override
   public ehn.a c() {
      return this.d ? ehn.a.a : ehn.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
