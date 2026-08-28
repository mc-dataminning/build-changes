public class air implements aac<ahm> {
   public static final zt<ws, air> a = aac.a(air::a, air::new);
   private final jh b;
   private final jm c;
   private final air.a d;
   private final int e;

   public air(air.a $$0, jh $$1, jm $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public air(air.a $$0, jh $$1, jm $$2) {
      this($$0, $$1, $$2, 0);
   }

   private air(ws $$0) {
      this.d = $$0.b(air.a.class);
      this.b = $$0.e();
      this.c = jm.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(ws $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public aae<air> a() {
      return ahk.bR;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public jm e() {
      return this.c;
   }

   public air.a f() {
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
