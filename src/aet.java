public class aet implements zf<abu> {
   public static final yw<vu, aet> a = zf.a(aet::a, aet::new);
   private final double b;
   private final double c;
   private final long d;

   public aet(ebz $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private aet(vu $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zh<aet> a() {
      return agn.aw;
   }

   public void a(abu $$0) {
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
