public class aga implements yp<afn> {
   public static final yg<vi, aga> a = yp.a(aga::a, aga::new);
   private final int b;
   private final int c;

   public aga(int $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aga(vi $$0) {
      this.b = $$0.readByte();
      this.c = $$0.readByte();
   }

   private void a(vi $$0) {
      $$0.k(this.b);
      $$0.k(this.c);
   }

   @Override
   public yr<aga> a() {
      return afl.bp;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
