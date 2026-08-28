public class aci implements zr<acg> {
   public static final zi<wh, aci> a = zr.a(aci::a, aci::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final int f;

   public aci(bvn $$0, arv $$1) {
      this.b = $$0.ar();
      fbr $$2 = $$1.b();
      this.c = $$2.a();
      this.d = $$2.b();
      this.e = $$2.c();
      this.f = $$0.l();
   }

   private aci(wh $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readShort();
   }

   private void a(wh $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.m(this.f);
   }

   @Override
   public zt<aci> a() {
      return agz.d;
   }

   public void a(acg $$0) {
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
