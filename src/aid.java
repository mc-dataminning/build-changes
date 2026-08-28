public class aid implements zs<agy> {
   public static final zj<wi, aid> a = zs.a(aid::a, aid::new);
   private final jh b;
   private final jm c;
   private final aid.a d;
   private final int e;

   public aid(aid.a $$0, jh $$1, jm $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public aid(aid.a $$0, jh $$1, jm $$2) {
      this($$0, $$1, $$2, 0);
   }

   private aid(wi $$0) {
      this.d = $$0.b(aid.a.class);
      this.b = $$0.e();
      this.c = jm.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(wi $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zu<aid> a() {
      return agw.bN;
   }

   public void a(agy $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public jm e() {
      return this.c;
   }

   public aid.a f() {
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
