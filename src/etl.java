public class etl extends etn {
   private final is b;
   private final in c;
   private final boolean d;
   private final boolean e;

   public static etl a(etp $$0, is $$1, in $$2) {
      return new etl(true, $$0, $$1, $$2, false);
   }

   public etl(etp $$0, is $$1, in $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private etl(boolean $$0, etp $$1, is $$2, in $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public etl a(is $$0) {
      return new etl(this.d, this.a, $$0, this.c, this.e);
   }

   public etl a(in $$0) {
      return new etl(this.d, this.a, this.b, $$0, this.e);
   }

   public in a() {
      return this.c;
   }

   public is b() {
      return this.b;
   }

   @Override
   public etn.a c() {
      return this.d ? etn.a.a : etn.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
