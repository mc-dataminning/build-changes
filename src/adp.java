public class adp implements zs<ach> {
   public static final zj<wi, adp> a = zs.a(adp::a, adp::new);
   private final int b;
   private final int c;
   private final int d;

   public adp(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private adp(wi $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readInt();
   }

   private void a(wi $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.q(this.d);
   }

   @Override
   public zu<adp> a() {
      return agw.H;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
