public class aiv implements zj<agt> {
   public static final za<vy, aiv> a = zj.a(aiv::a, aiv::new);
   private final ffo b;
   private final bus c;
   private final int d;

   public aiv(bus $$0, ffo $$1, int $$2) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
   }

   private aiv(vy $$0) {
      this.c = $$0.b(bus.class);
      this.b = $$0.v();
      this.d = $$0.l();
   }

   private void a(vy $$0) {
      $$0.a(this.c);
      $$0.a(this.b);
      $$0.c(this.d);
   }

   @Override
   public zl<aiv> a() {
      return agr.cn;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   public bus b() {
      return this.c;
   }

   public ffo e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }
}
