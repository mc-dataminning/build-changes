public class aco implements zw<aci> {
   public static final zn<wm, aco> a = zw.a(aco::a, aco::new);
   private final int b;
   private final iz c;
   private final int d;

   public aco(int $$0, iz $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aco(wm $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(wm $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.k(this.d);
   }

   @Override
   public zy<aco> a() {
      return agu.h;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public iz e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
