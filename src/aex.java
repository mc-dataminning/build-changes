public class aex implements zj<aby> {
   public static final za<vy, aex> a = zj.a(aex::a, aex::new);
   private final double b;
   private final double c;
   private final long d;

   public aex(ecy $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private aex(vy $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zl<aex> a() {
      return agr.aw;
   }

   public void a(aby $$0) {
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
