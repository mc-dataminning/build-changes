public class aei implements zb<abn> {
   public static final ys<vr, aei> a = zb.a(aei::a, aei::new);
   private final double b;
   private final double c;
   private final long d;

   public aei(dty $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private aei(vr $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zd<aei> a() {
      return afz.as;
   }

   public void a(abn $$0) {
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
