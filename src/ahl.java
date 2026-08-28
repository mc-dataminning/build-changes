public class ahl implements zf<agh> {
   public static final yw<vv, ahl> a = zf.a(ahl::a, ahl::new);
   private final jd b;
   private final ji c;
   private final ahl.a d;
   private final int e;

   public ahl(ahl.a $$0, jd $$1, ji $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.e = $$3;
   }

   public ahl(ahl.a $$0, jd $$1, ji $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ahl(vv $$0) {
      this.d = $$0.b(ahl.a.class);
      this.b = $$0.e();
      this.c = ji.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(vv $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.k(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zh<ahl> a() {
      return agf.bK;
   }

   public void a(agh $$0) {
      $$0.a(this);
   }

   public jd b() {
      return this.b;
   }

   public ji e() {
      return this.c;
   }

   public ahl.a f() {
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
