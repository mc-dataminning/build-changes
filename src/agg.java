public class agg implements yn<afl> {
   public static final ye<vg, agg> a = yn.a(agg::a, agg::new);
   private final ib b;
   private final int c;
   private final boolean d;

   public agg(ib $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agg(vg $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(vg $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public yp<agg> a() {
      return afj.bx;
   }

   public void a(afl $$0) {
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
