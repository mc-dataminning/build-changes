public class aia implements zp<agv> {
   public static final zg<wf, aia> a = zp.a(aia::a, aia::new);
   private final jh b;
   private final jm c;
   private final aia.a d;
   private final int e;

   public aia(aia.a $$0, jh $$1, jm $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public aia(aia.a $$0, jh $$1, jm $$2) {
      this($$0, $$1, $$2, 0);
   }

   private aia(wf $$0) {
      this.d = $$0.b(aia.a.class);
      this.b = $$0.e();
      this.c = jm.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(wf $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zr<aia> a() {
      return agt.bN;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public jm e() {
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
