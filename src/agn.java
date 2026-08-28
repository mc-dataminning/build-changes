public class agn implements zb<agb> {
   public static final ys<vr, agn> a = zb.a(agn::a, agn::new);
   private final int b;
   private final String c;

   public agn(int $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agn(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.d(32500);
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c, 32500);
   }

   @Override
   public zd<agn> a() {
      return afz.bp;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public String e() {
      return this.c;
   }
}
