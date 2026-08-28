public class afo implements zp<ace> {
   public static final zg<wf, afo> a = zp.a(afo::a, afo::new);
   private final float b;
   private final int c;
   private final int d;

   public afo(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afo(wf $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zr<afo> a() {
      return agt.aG;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
