public class elp extends elr {
   private final ic b;
   private final hx c;
   private final boolean d;
   private final boolean e;

   public static elp a(elt $$0, ic $$1, hx $$2) {
      return new elp(true, $$0, $$1, $$2, false);
   }

   public elp(elt $$0, ic $$1, hx $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private elp(boolean $$0, elt $$1, ic $$2, hx $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public elp a(ic $$0) {
      return new elp(this.d, this.a, $$0, this.c, this.e);
   }

   public elp a(hx $$0) {
      return new elp(this.d, this.a, this.b, $$0, this.e);
   }

   public hx a() {
      return this.c;
   }

   public ic b() {
      return this.b;
   }

   @Override
   public elr.a c() {
      return this.d ? elr.a.a : elr.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
