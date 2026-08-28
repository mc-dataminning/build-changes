public class aga implements zp<ace> {
   public static final zg<wf, aga> a = zp.a(aga::a, aga::new);
   private final int b;
   private final int c;
   private final int d;

   public aga(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aga(wf $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = $$0.readInt();
   }

   private void a(wf $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      $$0.q(this.d);
   }

   @Override
   public zr<aga> a() {
      return agt.aR;
   }

   public void a(ace $$0) {
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
