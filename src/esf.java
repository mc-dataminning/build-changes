public class esf extends esh {
   private final ij b;
   private final id c;
   private final boolean d;
   private final boolean e;

   public static esf a(esj $$0, ij $$1, id $$2) {
      return new esf(true, $$0, $$1, $$2, false);
   }

   public esf(esj $$0, ij $$1, id $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private esf(boolean $$0, esj $$1, ij $$2, id $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public esf a(ij $$0) {
      return new esf(this.d, this.a, $$0, this.c, this.e);
   }

   public esf a(id $$0) {
      return new esf(this.d, this.a, this.b, $$0, this.e);
   }

   public id a() {
      return this.c;
   }

   public ij b() {
      return this.b;
   }

   @Override
   public esh.a c() {
      return this.d ? esh.a.a : esh.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
