public class eha extends ehc {
   private final ha b;
   private final gu c;
   private final boolean d;
   private final boolean e;

   public static eha a(ehe $$0, ha $$1, gu $$2) {
      return new eha(true, $$0, $$1, $$2, false);
   }

   public eha(ehe $$0, ha $$1, gu $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private eha(boolean $$0, ehe $$1, ha $$2, gu $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public eha a(ha $$0) {
      return new eha(this.d, this.a, $$0, this.c, this.e);
   }

   public eha a(gu $$0) {
      return new eha(this.d, this.a, this.b, $$0, this.e);
   }

   public gu a() {
      return this.c;
   }

   public ha b() {
      return this.b;
   }

   @Override
   public ehc.a c() {
      return this.d ? ehc.a.a : ehc.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
