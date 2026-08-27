public class aeq implements yn<aay> {
   public static final ye<vg, aeq> a = yn.a(aeq::a, aeq::new);
   private final int b;
   private final int c;
   private final int d;

   public aeq(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aeq(vg $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = $$0.readInt();
   }

   private void a(vg $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      $$0.p(this.d);
   }

   @Override
   public yp<aeq> a() {
      return afj.aQ;
   }

   public void a(aay $$0) {
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
