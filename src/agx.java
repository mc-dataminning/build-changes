public class agx implements zb<agb> {
   public static final ys<vr, agx> a = zb.a(agx::a, agx::new);
   private final ja b;
   private final int c;
   private final boolean d;

   public agx(ja $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agx(vr $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zd<agx> a() {
      return afz.bz;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public ja b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
