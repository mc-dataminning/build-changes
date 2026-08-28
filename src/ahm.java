public class ahm implements zg<agi> {
   public static final yx<vw, ahm> a = zg.a(ahm::a, ahm::new);
   private final jd b;
   private final ji c;
   private final ahm.a d;
   private final int e;

   public ahm(ahm.a $$0, jd $$1, ji $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public ahm(ahm.a $$0, jd $$1, ji $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ahm(vw $$0) {
      this.d = $$0.b(ahm.a.class);
      this.b = $$0.e();
      this.c = ji.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(vw $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.k(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zi<ahm> a() {
      return agg.bK;
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   public jd b() {
      return this.b;
   }

   public ji e() {
      return this.c;
   }

   public ahm.a f() {
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
