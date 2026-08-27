public class agi implements yp<afn> {
   public static final yg<vi, agi> a = yp.a(agi::a, agi::new);
   private final id b;
   private final int c;
   private final boolean d;

   public agi(id $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agi(vi $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public yr<agi> a() {
      return afl.bx;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public id b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
