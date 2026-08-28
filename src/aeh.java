public class aeh implements zw<aci> {
   public static final zn<wm, aeh> a = zw.a(aeh::a, aeh::new);
   private final int b;
   private final alf c;

   public aeh(int $$0, cyy<?> $$1) {
      this.b = $$0;
      this.c = $$1.a();
   }

   private aeh(wm $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
   }

   private void a(wm $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<aeh> a() {
      return agu.Y;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public alf b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
