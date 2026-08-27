public class acz implements yp<aba> {
   public static final yg<vi, acz> a = yp.a(acz::a, acz::new);
   private final int b;
   private final ajv c;

   public acz(int $$0, cvu<?> $$1) {
      this.b = $$0;
      this.c = $$1.a();
   }

   private acz(vi $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
   }

   private void a(vi $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
   }

   @Override
   public yr<acz> a() {
      return afl.Y;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public ajv b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
