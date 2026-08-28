public class evm extends evo {
   private final je b;
   private final iz c;
   private final boolean d;
   private final boolean e;

   public static evm a(evq $$0, je $$1, iz $$2) {
      return new evm(true, $$0, $$1, $$2, false);
   }

   public evm(evq $$0, je $$1, iz $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private evm(boolean $$0, evq $$1, je $$2, iz $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public evm a(je $$0) {
      return new evm(this.d, this.a, $$0, this.c, this.e);
   }

   public evm a(iz $$0) {
      return new evm(this.d, this.a, this.b, $$0, this.e);
   }

   public iz a() {
      return this.c;
   }

   public je b() {
      return this.b;
   }

   @Override
   public evo.a c() {
      return this.d ? evo.a.a : evo.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
