public class aem implements xf<adj> {
   private final hx a;
   private final ic b;
   private final aem.a c;
   private final int d;

   public aem(aem.a $$0, hx $$1, ic $$2, int $$3) {
      this.c = $$0;
      this.a = $$1.i();
      this.b = $$2;
      this.d = $$3;
   }

   public aem(aem.a $$0, hx $$1, ic $$2) {
      this($$0, $$1, $$2, 0);
   }

   public aem(ui $$0) {
      this.c = $$0.b(aem.a.class);
      this.a = $$0.e();
      this.b = ic.a($$0.readUnsignedByte());
      this.d = $$0.n();
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.c);
      $$0.a(this.a);
      $$0.k(this.b.d());
      $$0.c(this.d);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.a;
   }

   public ic d() {
      return this.b;
   }

   public aem.a e() {
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
