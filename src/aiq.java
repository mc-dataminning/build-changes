public class aiq implements aac<ahm> {
   public static final zt<ws, aiq> a = aac.a(aiq::a, aiq::new);
   private static final int b = 2;
   private final boolean c;

   public aiq(cps $$0) {
      this.c = $$0.b;
   }

   private aiq(ws $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(ws $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public aae<aiq> a() {
      return ahk.bQ;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
