public class act implements zj<aby> {
   public static final za<vy, act> a = zj.a(act::a, act::new);
   private final int b;
   private final int c;
   private final int d;

   public act(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private act(vy $$0) {
      this.b = $$0.x();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
   }

   private void a(vy $$0) {
      $$0.f(this.b);
      $$0.m(this.c);
      $$0.m(this.d);
   }

   @Override
   public zl<act> a() {
      return agr.u;
   }

   public void a(aby $$0) {
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
