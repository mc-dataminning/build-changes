public class ahl implements yw<agg> {
   public static final yn<vl, ahl> a = yw.a(ahl::a, ahl::new);
   private static final int b = 2;
   private final boolean c;

   public ahl(cos $$0) {
      this.c = $$0.b;
   }

   private ahl(vl $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vl $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public yy<ahl> a() {
      return age.bR;
   }

   public void a(agg $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
