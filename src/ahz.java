public class ahz implements zj<agt> {
   public static final za<vy, ahz> a = zj.a(ahz::a, ahz::new);
   private final iw b;
   private final jc c;
   private final ahz.a d;
   private final int e;

   public ahz(ahz.a $$0, iw $$1, jc $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public ahz(ahz.a $$0, iw $$1, jc $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ahz(vy $$0) {
      this.d = $$0.b(ahz.a.class);
      this.b = $$0.e();
      this.c = jc.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(vy $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zl<ahz> a() {
      return agr.bS;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   public iw b() {
      return this.b;
   }

   public jc e() {
      return this.c;
   }

   public ahz.a f() {
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
