public class abs implements zb<abm> {
   public static final ys<vu, abs> a = zb.a(abs::a, abs::new);
   private final int b;
   private final in c;
   private final int d;

   public abs(int $$0, in $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private abs(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.k(this.d);
   }

   @Override
   public zd<abs> a() {
      return afx.h;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public in e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
