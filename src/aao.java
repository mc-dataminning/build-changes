public class aao implements yb<aam> {
   public static final xs<uu, aao> a = yb.a(aao::a, aao::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final int f;

   public aao(bpe $$0) {
      this.b = $$0.aj();
      this.c = $$0.dr();
      this.d = $$0.dt();
      this.e = $$0.dx();
      this.f = $$0.p();
   }

   private aao(uu $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readShort();
   }

   private void a(uu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
   }

   @Override
   public yd<aao> a() {
      return aex.d;
   }

   public void a(aam $$0) {
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
