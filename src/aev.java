public class aev implements zb<abm> {
   public static final ys<vu, aev> a = zb.a(aev::a, aev::new);
   private final float b;
   private final int c;
   private final float d;

   public aev(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aev(vu $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zd<aev> a() {
      return afx.aH;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }
}
