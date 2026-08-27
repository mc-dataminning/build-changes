public class aho implements zl<agl> {
   public static final zc<we, aho> a = zl.a(aho::a, aho::new);
   private final ir b;
   private final iw c;
   private final aho.a d;
   private final int e;

   public aho(aho.a $$0, ir $$1, iw $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.e = $$3;
   }

   public aho(aho.a $$0, ir $$1, iw $$2) {
      this($$0, $$1, $$2, 0);
   }

   private aho(we $$0) {
      this.d = $$0.b(aho.a.class);
      this.b = $$0.e();
      this.c = iw.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(we $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.k(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zn<aho> a() {
      return agj.bK;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   public ir b() {
      return this.b;
   }

   public iw e() {
      return this.c;
   }

   public aho.a f() {
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
