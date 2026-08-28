public class ahy implements zr<ahb> {
   public static final zi<wh, ahy> a = zr.a(ahy::a, ahy::new);
   private final jh b;
   private final int c;
   private final boolean d;

   public ahy(jh $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahy(wh $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zt<ahy> a() {
      return agz.bG;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
