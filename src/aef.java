public class aef implements zf<abu> {
   public static final yw<vu, aef> a = zf.a(aef::a, aef::new);
   private final int b;
   private final double c;

   public aef(int $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aef(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<aef> a() {
      return agn.bj;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }
}
