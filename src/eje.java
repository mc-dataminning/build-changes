public class eje extends ejg {
   private final hx b;
   private final ht c;
   private final boolean d;
   private final boolean e;

   public static eje a(eji $$0, hx $$1, ht $$2) {
      return new eje(true, $$0, $$1, $$2, false);
   }

   public eje(eji $$0, hx $$1, ht $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private eje(boolean $$0, eji $$1, hx $$2, ht $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public eje a(hx $$0) {
      return new eje(this.d, this.a, $$0, this.c, this.e);
   }

   public eje a(ht $$0) {
      return new eje(this.d, this.a, this.b, $$0, this.e);
   }

   public ht a() {
      return this.c;
   }

   public hx b() {
      return this.b;
   }

   @Override
   public ejg.a c() {
      return this.d ? ejg.a.a : ejg.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
