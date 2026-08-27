public class ace implements vd<abc> {
   private final gw a;
   private final ha b;
   private final ace.a c;
   private final int d;

   public ace(ace.a $$0, gw $$1, ha $$2, int $$3) {
      this.c = $$0;
      this.a = $$1.i();
      this.b = $$2;
      this.d = $$3;
   }

   public ace(ace.a $$0, gw $$1, ha $$2) {
      this($$0, $$1, $$2, 0);
   }

   public ace(so $$0) {
      this.c = $$0.b(ace.a.class);
      this.a = $$0.e();
      this.b = ha.a($$0.readUnsignedByte());
      this.d = $$0.m();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.c);
      $$0.a(this.a);
      $$0.k(this.b.d());
      $$0.c(this.d);
   }

   public void a(abc $$0) {
      $$0.a(this);
   }

   public gw a() {
      return this.a;
   }

   public ha d() {
      return this.b;
   }

   public ace.a e() {
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
