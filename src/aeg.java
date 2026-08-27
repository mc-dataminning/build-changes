public class aeg implements zb<abm> {
   public static final ys<vu, aeg> a = zb.a(aeg::a, aeg::new);
   private final double b;
   private final double c;
   private final long d;

   public aeg(dry $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private aeg(vu $$0) {
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
   public zd<aeg> a() {
      return afx.as;
   }

   public void a(abm $$0) {
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
