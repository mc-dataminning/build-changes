public class ahm implements yw<agg> {
   public static final yn<vl, ahm> a = yw.a(ahm::a, ahm::new);
   private final ji b;
   private final jn c;
   private final ahm.a d;
   private final int e;

   public ahm(ahm.a $$0, ji $$1, jn $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public ahm(ahm.a $$0, ji $$1, jn $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ahm(vl $$0) {
      this.d = $$0.b(ahm.a.class);
      this.b = $$0.e();
      this.c = jn.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(vl $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public yy<ahm> a() {
      return age.bS;
   }

   public void a(agg $$0) {
      $$0.a(this);
   }

   public ji b() {
      return this.b;
   }

   public jn e() {
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
