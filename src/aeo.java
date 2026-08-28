public class aeo implements zp<ace> {
   public static final zg<wf, aeo> a = zp.a(aeo::a, aeo::new);
   private final int b;
   private final double c;

   public aeo(int $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aeo(wf $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zr<aeo> a() {
      return agt.bf;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }
}
