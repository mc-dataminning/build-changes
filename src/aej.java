public class aej implements xd<adg> {
   private final hx a;
   private final ic b;
   private final aej.a c;
   private final int d;

   public aej(aej.a $$0, hx $$1, ic $$2, int $$3) {
      this.c = $$0;
      this.a = $$1.i();
      this.b = $$2;
      this.d = $$3;
   }

   public aej(aej.a $$0, hx $$1, ic $$2) {
      this($$0, $$1, $$2, 0);
   }

   public aej(ug $$0) {
      this.c = $$0.b(aej.a.class);
      this.a = $$0.e();
      this.b = ic.a($$0.readUnsignedByte());
      this.d = $$0.n();
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.c);
      $$0.a(this.a);
      $$0.k(this.b.d());
      $$0.c(this.d);
   }

   public void a(adg $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.a;
   }

   public ic d() {
      return this.b;
   }

   public aej.a e() {
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
