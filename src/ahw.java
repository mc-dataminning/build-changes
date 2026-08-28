public class ahw implements zh<agr> {
   public static final yy<vw, ahw> a = zh.a(ahw::a, ahw::new);
   private static final int b = 2;
   private final boolean c;

   public ahw(crt $$0) {
      this.c = $$0.b;
   }

   private ahw(vw $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vw $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public zj<ahw> a() {
      return agp.bR;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
