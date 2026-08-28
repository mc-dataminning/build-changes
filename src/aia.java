public class aia implements zq<agw> {
   public static final zh<wg, aia> a = zq.a(aia::a, aia::new);
   private static final int b = 2;
   private final boolean c;

   public aia(coq $$0) {
      this.c = $$0.b;
   }

   private aia(wg $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(wg $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public zs<aia> a() {
      return agu.bM;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
