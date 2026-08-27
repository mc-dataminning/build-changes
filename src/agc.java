public class agc implements yp<afn> {
   public static final yg<vi, agc> a = yp.a(agc::a, agc::new);
   private final int b;

   public agc(int $$0) {
      this.b = $$0;
   }

   private agc(vi $$0) {
      this.b = $$0.readByte();
   }

   private void a(vi $$0) {
      $$0.k(this.b);
   }

   @Override
   public yr<agc> a() {
      return afl.br;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }
}
