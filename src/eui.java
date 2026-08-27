public class eui extends euk {
   private final it b;
   private final io c;
   private final boolean d;
   private final boolean e;

   public static eui a(eum $$0, it $$1, io $$2) {
      return new eui(true, $$0, $$1, $$2, false);
   }

   public eui(eum $$0, it $$1, io $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private eui(boolean $$0, eum $$1, it $$2, io $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public eui a(it $$0) {
      return new eui(this.d, this.a, $$0, this.c, this.e);
   }

   public eui a(io $$0) {
      return new eui(this.d, this.a, this.b, $$0, this.e);
   }

   public io a() {
      return this.c;
   }

   public it b() {
      return this.b;
   }

   @Override
   public euk.a c() {
      return this.d ? euk.a.a : euk.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
