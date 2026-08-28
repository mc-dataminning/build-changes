public class ahe implements zg<agi> {
   public static final yx<vw, ahe> a = zg.a(ahe::a, ahe::new);
   private final jd b;
   private final int c;
   private final boolean d;

   public ahe(jd $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahe(vw $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zi<ahe> a() {
      return agg.bz;
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   public jd b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
