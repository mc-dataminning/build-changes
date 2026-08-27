public class agc implements zb<afz> {
   public static final ys<vu, agc> a = zb.a(agc::a, agc::new);
   private final int b;
   private final in c;

   public agc(int $$0, in $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agc(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<agc> a() {
      return afx.bf;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public in e() {
      return this.c;
   }
}
