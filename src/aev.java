public class aev implements zq<acf> {
   public static final zh<wg, aev> a = zq.a(aev::a, aev::new);
   private final int b;
   private final byte c;

   public aev(bul $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private aev(wg $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
   }

   @Override
   public zs<aev> a() {
      return agu.an;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public bul a(dfm $$0) {
      return $$0.a(this.b);
   }

   public float b() {
      return azm.a(this.c);
   }
}
