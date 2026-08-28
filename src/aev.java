public class aev implements zk<abz> {
   public static final zb<wa, aev> a = zk.a(aev::a, aev::new);
   private final double b;
   private final double c;
   private final long d;

   public aev(dwf $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private aev(wa $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zm<aev> a() {
      return ago.at;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }
}
