public class adz implements wu<acw> {
   private final hv a;
   private final ia b;
   private final adz.a c;
   private final int d;

   public adz(adz.a $$0, hv $$1, ia $$2, int $$3) {
      this.c = $$0;
      this.a = $$1.i();
      this.b = $$2;
      this.d = $$3;
   }

   public adz(adz.a $$0, hv $$1, ia $$2) {
      this($$0, $$1, $$2, 0);
   }

   public adz(ue $$0) {
      this.c = $$0.b(adz.a.class);
      this.a = $$0.e();
      this.b = ia.a($$0.readUnsignedByte());
      this.d = $$0.n();
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.c);
      $$0.a(this.a);
      $$0.k(this.b.d());
      $$0.c(this.d);
   }

   public void a(acw $$0) {
      $$0.a(this);
   }

   public hv a() {
      return this.a;
   }

   public ia d() {
      return this.b;
   }

   public adz.a e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
