public class ekx extends ekz {
   private final ia b;
   private final hv c;
   private final boolean d;
   private final boolean e;

   public static ekx a(elb $$0, ia $$1, hv $$2) {
      return new ekx(true, $$0, $$1, $$2, false);
   }

   public ekx(elb $$0, ia $$1, hv $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private ekx(boolean $$0, elb $$1, ia $$2, hv $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public ekx a(ia $$0) {
      return new ekx(this.d, this.a, $$0, this.c, this.e);
   }

   public ekx a(hv $$0) {
      return new ekx(this.d, this.a, this.b, $$0, this.e);
   }

   public hv a() {
      return this.c;
   }

   public ia b() {
      return this.b;
   }

   @Override
   public ekz.a c() {
      return this.d ? ekz.a.a : ekz.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
