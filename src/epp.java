public class epp extends epr {
   private final ih b;
   private final ib c;
   private final boolean d;
   private final boolean e;

   public static epp a(ept $$0, ih $$1, ib $$2) {
      return new epp(true, $$0, $$1, $$2, false);
   }

   public epp(ept $$0, ih $$1, ib $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private epp(boolean $$0, ept $$1, ih $$2, ib $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public epp a(ih $$0) {
      return new epp(this.d, this.a, $$0, this.c, this.e);
   }

   public epp a(ib $$0) {
      return new epp(this.d, this.a, this.b, $$0, this.e);
   }

   public ib a() {
      return this.c;
   }

   public ih b() {
      return this.b;
   }

   @Override
   public epr.a c() {
      return this.d ? epr.a.a : epr.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
