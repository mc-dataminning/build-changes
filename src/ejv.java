public class ejv extends ejx {
   private final ib b;
   private final hx c;
   private final boolean d;
   private final boolean e;

   public static ejv a(ejz $$0, ib $$1, hx $$2) {
      return new ejv(true, $$0, $$1, $$2, false);
   }

   public ejv(ejz $$0, ib $$1, hx $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private ejv(boolean $$0, ejz $$1, ib $$2, hx $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public ejv a(ib $$0) {
      return new ejv(this.d, this.a, $$0, this.c, this.e);
   }

   public ejv a(hx $$0) {
      return new ejv(this.d, this.a, this.b, $$0, this.e);
   }

   public hx a() {
      return this.c;
   }

   public ib b() {
      return this.b;
   }

   @Override
   public ejx.a c() {
      return this.d ? ejx.a.a : ejx.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
