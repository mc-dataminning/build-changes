public class ejq extends ejs {
   private final hx b;
   private final ht c;
   private final boolean d;
   private final boolean e;

   public static ejq a(eju $$0, hx $$1, ht $$2) {
      return new ejq(true, $$0, $$1, $$2, false);
   }

   public ejq(eju $$0, hx $$1, ht $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private ejq(boolean $$0, eju $$1, hx $$2, ht $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public ejq a(hx $$0) {
      return new ejq(this.d, this.a, $$0, this.c, this.e);
   }

   public ejq a(ht $$0) {
      return new ejq(this.d, this.a, this.b, $$0, this.e);
   }

   public ht a() {
      return this.c;
   }

   public hx b() {
      return this.b;
   }

   @Override
   public ejs.a c() {
      return this.d ? ejs.a.a : ejs.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
