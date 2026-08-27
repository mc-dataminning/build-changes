public class eib extends eid {
   private final hx b;
   private final ht c;
   private final boolean d;
   private final boolean e;

   public static eib a(eif $$0, hx $$1, ht $$2) {
      return new eib(true, $$0, $$1, $$2, false);
   }

   public eib(eif $$0, hx $$1, ht $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private eib(boolean $$0, eif $$1, hx $$2, ht $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public eib a(hx $$0) {
      return new eib(this.d, this.a, $$0, this.c, this.e);
   }

   public eib a(ht $$0) {
      return new eib(this.d, this.a, this.b, $$0, this.e);
   }

   public ht a() {
      return this.c;
   }

   public hx b() {
      return this.b;
   }

   @Override
   public eid.a c() {
      return this.d ? eid.a.a : eid.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
