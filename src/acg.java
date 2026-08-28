public class acg implements zs<ace> {
   public static final zj<wl, acg> a = zs.a(acg::a, acg::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final int f;

   public acg(bta $$0) {
      this.b = $$0.al();
      this.c = $$0.du();
      this.d = $$0.dw();
      this.e = $$0.dA();
      this.f = $$0.p();
   }

   private acg(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readShort();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
   }

   @Override
   public zu<acg> a() {
      return agq.d;
   }

   public void a(ace $$0) {
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
