public class aia implements zw<agw> {
   public static final zn<wm, aia> a = zw.a(aia::a, aia::new);
   private final iz b;
   private final je c;
   private final aia.a d;
   private final int e;

   public aia(aia.a $$0, iz $$1, je $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.e = $$3;
   }

   public aia(aia.a $$0, iz $$1, je $$2) {
      this($$0, $$1, $$2, 0);
   }

   private aia(wm $$0) {
      this.d = $$0.b(aia.a.class);
      this.b = $$0.e();
      this.c = je.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(wm $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.k(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zy<aia> a() {
      return agu.bK;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public je e() {
      return this.c;
   }

   public aia.a f() {
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
