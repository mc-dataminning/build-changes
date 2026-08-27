public class abz implements ux<aaw> {
   private final gu a;
   private final ha b;
   private final abz.a c;
   private final int d;

   public abz(abz.a $$0, gu $$1, ha $$2, int $$3) {
      this.c = $$0;
      this.a = $$1.i();
      this.b = $$2;
      this.d = $$3;
   }

   public abz(abz.a $$0, gu $$1, ha $$2) {
      this($$0, $$1, $$2, 0);
   }

   public abz(si $$0) {
      this.c = $$0.b(abz.a.class);
      this.a = $$0.e();
      this.b = ha.a($$0.readUnsignedByte());
      this.d = $$0.m();
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.c);
      $$0.a(this.a);
      $$0.k(this.b.d());
      $$0.c(this.d);
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public gu a() {
      return this.a;
   }

   public ha d() {
      return this.b;
   }

   public abz.a e() {
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
