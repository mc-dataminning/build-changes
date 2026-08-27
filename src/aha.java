public class aha implements yz<afx> {
   public static final yq<vs, aha> a = yz.a(aha::a, aha::new);
   private final im b;
   private final ir c;
   private final aha.a d;
   private final int e;

   public aha(aha.a $$0, im $$1, ir $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.e = $$3;
   }

   public aha(aha.a $$0, im $$1, ir $$2) {
      this($$0, $$1, $$2, 0);
   }

   private aha(vs $$0) {
      this.d = $$0.b(aha.a.class);
      this.b = $$0.e();
      this.c = ir.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(vs $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.k(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zb<aha> a() {
      return afv.bI;
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   public im b() {
      return this.b;
   }

   public ir e() {
      return this.c;
   }

   public aha.a f() {
      return this.d;
   }

   public int g() {
      return this.e;
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
