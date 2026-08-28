public class acm implements zr<acg> {
   public static final zi<wh, acm> a = zr.a(acm::a, acm::new);
   private final int b;
   private final jh c;
   private final int d;

   public acm(int $$0, jh $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acm(wh $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(wh $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
   }

   @Override
   public zt<acm> a() {
      return agz.h;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public jh e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
