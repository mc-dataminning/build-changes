public class agp implements yp<afn> {
   public static final yg<vi, agp> a = yp.a(agp::a, agp::new);
   private static final int b = 2;
   private final boolean c;

   public agp(cjx $$0) {
      this.c = $$0.b;
   }

   private agp(vi $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vi $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public yr<agp> a() {
      return afl.bH;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
