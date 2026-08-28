public class adg implements zf<abt> {
   public static final yw<vv, adg> a = zf.a(adg::a, adg::new);
   private final int b;
   private final jd c;
   private final int d;
   private final boolean e;

   public adg(int $$0, jd $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.i();
      this.d = $$2;
      this.e = $$3;
   }

   private adg(vv $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(vv $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
   }

   @Override
   public zh<adg> a() {
      return agf.L;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.e;
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }

   public jd g() {
      return this.c;
   }
}
