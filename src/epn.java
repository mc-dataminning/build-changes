public class epn extends epp {
   private final ih b;
   private final ib c;
   private final boolean d;
   private final boolean e;

   public static epn a(epr $$0, ih $$1, ib $$2) {
      return new epn(true, $$0, $$1, $$2, false);
   }

   public epn(epr $$0, ih $$1, ib $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private epn(boolean $$0, epr $$1, ih $$2, ib $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public epn a(ih $$0) {
      return new epn(this.d, this.a, $$0, this.c, this.e);
   }

   public epn a(ib $$0) {
      return new epn(this.d, this.a, this.b, $$0, this.e);
   }

   public ib a() {
      return this.c;
   }

   public ih b() {
      return this.b;
   }

   @Override
   public epp.a c() {
      return this.d ? epp.a.a : epp.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
