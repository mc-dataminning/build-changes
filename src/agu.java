public class agu implements zb<afz> {
   public static final ys<vu, agu> a = zb.a(agu::a, agu::new);
   private final in b;
   private final int c;
   private final boolean d;

   public agu(in $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agu(vu $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zd<agu> a() {
      return afx.bx;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   public in b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
