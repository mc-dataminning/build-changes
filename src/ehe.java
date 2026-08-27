public class ehe extends ehg {
   private final hc b;
   private final gw c;
   private final boolean d;
   private final boolean e;

   public static ehe a(ehi $$0, hc $$1, gw $$2) {
      return new ehe(true, $$0, $$1, $$2, false);
   }

   public ehe(ehi $$0, hc $$1, gw $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private ehe(boolean $$0, ehi $$1, hc $$2, gw $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public ehe a(hc $$0) {
      return new ehe(this.d, this.a, $$0, this.c, this.e);
   }

   public ehe a(gw $$0) {
      return new ehe(this.d, this.a, this.b, $$0, this.e);
   }

   public gw a() {
      return this.c;
   }

   public hc b() {
      return this.b;
   }

   @Override
   public ehg.a c() {
      return this.d ? ehg.a.a : ehg.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
