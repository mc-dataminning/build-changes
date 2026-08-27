public class abx implements uw<aav> {
   private final gv a;
   private final hb b;
   private final abx.a c;
   private final int d;

   public abx(abx.a $$0, gv $$1, hb $$2, int $$3) {
      this.c = $$0;
      this.a = $$1.i();
      this.b = $$2;
      this.d = $$3;
   }

   public abx(abx.a $$0, gv $$1, hb $$2) {
      this($$0, $$1, $$2, 0);
   }

   public abx(sh $$0) {
      this.c = $$0.b(abx.a.class);
      this.a = $$0.e();
      this.b = hb.a($$0.readUnsignedByte());
      this.d = $$0.m();
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.c);
      $$0.a(this.a);
      $$0.k(this.b.d());
      $$0.c(this.d);
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public gv a() {
      return this.a;
   }

   public hb d() {
      return this.b;
   }

   public abx.a e() {
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
