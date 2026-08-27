public class acz implements zb<abm> {
   public static final ys<vu, acz> a = zb.a(acz::a, acz::new);
   private final int b;
   private final in c;
   private final int d;
   private final boolean e;

   public acz(int $$0, in $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.i();
      this.d = $$2;
      this.e = $$3;
   }

   private acz(vu $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
   }

   @Override
   public zd<acz> a() {
      return afx.L;
   }

   public void a(abm $$0) {
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

   public in g() {
      return this.c;
   }
}
