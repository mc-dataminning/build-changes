public class afu implements yb<aez> {
   public static final xs<uu, afu> a = yb.a(afu::a, afu::new);
   private final ib b;
   private final int c;
   private final boolean d;

   public afu(ib $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afu(uu $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(uu $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public yd<afu> a() {
      return aex.bx;
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   public ib b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
