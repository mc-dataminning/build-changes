public class aci implements yw<abl> {
   public static final yn<wa, aci> a = yw.a(aci::a, aci::new);
   private final int b;
   private final int c;
   private final int d;
   private final cwp e;

   public aci(int $$0, int $$1, int $$2, cwp $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.v();
   }

   private aci(wa $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = cwp.g.decode($$0);
   }

   private void a(wa $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      cwp.g.encode($$0, this.e);
   }

   @Override
   public yy<aci> a() {
      return age.w;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public cwp f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
