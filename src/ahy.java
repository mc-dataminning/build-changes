public class ahy implements zp<agv> {
   public static final zg<wf, ahy> a = zp.a(ahy::a, ahy::new);
   private final int b;
   private final ali c;
   private final boolean d;

   public ahy(int $$0, dar<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private ahy(wf $$0) {
      this.b = $$0.x();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(wf $$0) {
      $$0.f(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zr<ahy> a() {
      return agt.bL;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ali e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
