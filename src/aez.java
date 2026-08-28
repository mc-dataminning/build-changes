public class aez implements zs<ace> {
   public static final zj<wl, aez> a = zs.a(aez::a, aez::new);
   private final double b;
   private final double c;
   private final long d;

   public aez(dto $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private aez(wl $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zu<aez> a() {
      return agq.as;
   }

   public void a(ace $$0) {
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
