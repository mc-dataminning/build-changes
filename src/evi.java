public class evi extends evk {
   private final je b;
   private final iz c;
   private final boolean d;
   private final boolean e;

   public static evi a(evm $$0, je $$1, iz $$2) {
      return new evi(true, $$0, $$1, $$2, false);
   }

   public evi(evm $$0, je $$1, iz $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private evi(boolean $$0, evm $$1, je $$2, iz $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public evi a(je $$0) {
      return new evi(this.d, this.a, $$0, this.c, this.e);
   }

   public evi a(iz $$0) {
      return new evi(this.d, this.a, this.b, $$0, this.e);
   }

   public iz a() {
      return this.c;
   }

   public je b() {
      return this.b;
   }

   @Override
   public evk.a c() {
      return this.d ? evk.a.a : evk.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
