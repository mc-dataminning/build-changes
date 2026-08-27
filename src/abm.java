public class abm implements yz<abk> {
   public static final yq<vs, abm> a = yz.a(abm::a, abm::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final int f;

   public abm(bqu $$0) {
      this.b = $$0.aj();
      this.c = $$0.ds();
      this.d = $$0.du();
      this.e = $$0.dy();
      this.f = $$0.p();
   }

   private abm(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readShort();
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
   }

   @Override
   public zb<abm> a() {
      return afv.d;
   }

   public void a(abk $$0) {
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
