public class aih implements zr<ahb> {
   public static final zi<wh, aih> a = zr.a(aih::a, aih::new);
   private final jh b;
   private final jm c;
   private final aih.a d;
   private final int e;

   public aih(aih.a $$0, jh $$1, jm $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public aih(aih.a $$0, jh $$1, jm $$2) {
      this($$0, $$1, $$2, 0);
   }

   private aih(wh $$0) {
      this.d = $$0.b(aih.a.class);
      this.b = $$0.e();
      this.c = jm.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(wh $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zt<aih> a() {
      return agz.bS;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public jm e() {
      return this.c;
   }

   public aih.a f() {
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
