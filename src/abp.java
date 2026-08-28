public class abp implements zb<abn> {
   public static final ys<vr, abp> a = zb.a(abp::a, abp::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final int f;

   public abp(bso $$0) {
      this.b = $$0.al();
      this.c = $$0.du();
      this.d = $$0.dw();
      this.e = $$0.dA();
      this.f = $$0.p();
   }

   private abp(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readShort();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
   }

   @Override
   public zd<abp> a() {
      return afz.d;
   }

   public void a(abn $$0) {
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
