public class afx implements xz<aev> {
   public static final xq<us, afx> a = xz.a(afx::a, afx::new);
   private static final int b = 2;
   private final boolean c;

   public afx(chx $$0) {
      this.c = $$0.b;
   }

   private afx(us $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(us $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public yb<afx> a() {
      return aet.bH;
   }

   public void a(aev $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
