public class eor extends eot {
   private final ih b;
   private final ib c;
   private final boolean d;
   private final boolean e;

   public static eor a(eov $$0, ih $$1, ib $$2) {
      return new eor(true, $$0, $$1, $$2, false);
   }

   public eor(eov $$0, ih $$1, ib $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private eor(boolean $$0, eov $$1, ih $$2, ib $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public eor a(ih $$0) {
      return new eor(this.d, this.a, $$0, this.c, this.e);
   }

   public eor a(ib $$0) {
      return new eor(this.d, this.a, this.b, $$0, this.e);
   }

   public ib a() {
      return this.c;
   }

   public ih b() {
      return this.b;
   }

   @Override
   public eot.a c() {
      return this.d ? eot.a.a : eot.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
