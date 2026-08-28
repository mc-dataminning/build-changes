public class ahs implements zw<agw> {
   public static final zn<wm, ahs> a = zw.a(ahs::a, ahs::new);
   private final iz b;
   private final int c;
   private final boolean d;

   public ahs(iz $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahs(wm $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zy<ahs> a() {
      return agu.bz;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
