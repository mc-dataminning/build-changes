public class agv implements zb<agb> {
   public static final ys<vr, agv> a = zb.a(agv::a, agv::new);
   private final int b;
   private final int c;

   public agv(int $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agv(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
   }

   @Override
   public zd<agv> a() {
      return afz.bx;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
