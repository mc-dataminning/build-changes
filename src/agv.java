public class agv implements zs<ags> {
   public static final zj<wl, agv> a = zs.a(agv::a, agv::new);
   private final int b;
   private final iz c;

   public agv(int $$0, iz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agv(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<agv> a() {
      return agq.bg;
   }

   public void a(ags $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public iz e() {
      return this.c;
   }
}
