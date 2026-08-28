public class adh implements zg<abu> {
   public static final yx<vw, adh> a = zg.a(adh::a, adh::new);
   private final int b;
   private final jd c;
   private final int d;
   private final boolean e;

   public adh(int $$0, jd $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.j();
      this.d = $$2;
      this.e = $$3;
   }

   private adh(vw $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(vw $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
   }

   @Override
   public zi<adh> a() {
      return agg.L;
   }

   public void a(abu $$0) {
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
