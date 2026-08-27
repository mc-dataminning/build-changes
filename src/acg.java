public class acg implements vf<abe> {
   private final gw a;
   private final hc b;
   private final acg.a c;
   private final int d;

   public acg(acg.a $$0, gw $$1, hc $$2, int $$3) {
      this.c = $$0;
      this.a = $$1.i();
      this.b = $$2;
      this.d = $$3;
   }

   public acg(acg.a $$0, gw $$1, hc $$2) {
      this($$0, $$1, $$2, 0);
   }

   public acg(sq $$0) {
      this.c = $$0.b(acg.a.class);
      this.a = $$0.e();
      this.b = hc.a($$0.readUnsignedByte());
      this.d = $$0.m();
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.c);
      $$0.a(this.a);
      $$0.k(this.b.d());
      $$0.c(this.d);
   }

   public void a(abe $$0) {
      $$0.a(this);
   }

   public gw a() {
      return this.a;
   }

   public hc d() {
      return this.b;
   }

   public acg.a e() {
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
