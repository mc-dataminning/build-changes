public class aig implements zr<ahb> {
   public static final zi<wh, aig> a = zr.a(aig::a, aig::new);
   private static final int b = 2;
   private final boolean c;

   public aig(cpk $$0) {
      this.c = $$0.b;
   }

   private aig(wh $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(wh $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public zt<aig> a() {
      return agz.bR;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
