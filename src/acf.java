public class acf implements zo<acd> {
   public static final zf<we, acf> a = zo.a(acf::a, acf::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final int f;

   public acf(bul $$0, arl $$1) {
      this.b = $$0.ar();
      ezh $$2 = $$1.b();
      this.c = $$2.a();
      this.d = $$2.b();
      this.e = $$2.c();
      this.f = $$0.m();
   }

   private acf(we $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readShort();
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.m(this.f);
   }

   @Override
   public zq<acf> a() {
      return ags.d;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public double f() {
      return this.d;
   }

   public double g() {
      return this.e;
   }

   public int h() {
      return this.f;
   }
}
