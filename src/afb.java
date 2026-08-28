public class afb implements zq<acf> {
   public static final zh<wg, afb> a = zq.a(afb::a, afb::new);
   private final double b;
   private final double c;
   private final long d;

   public afb(dxl $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private afb(wg $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zs<afb> a() {
      return agu.at;
   }

   public void a(acf $$0) {
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
