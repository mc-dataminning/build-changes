public class ahl implements zg<agi> {
   public static final yx<vw, ahl> a = zg.a(ahl::a, ahl::new);
   private static final int b = 2;
   private final boolean c;

   public ahl(cmu $$0) {
      this.c = $$0.b;
   }

   private ahl(vw $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vw $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public zi<ahl> a() {
      return agg.bJ;
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
