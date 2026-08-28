public class ahu implements zf<agp> {
   public static final yw<vu, ahu> a = zf.a(ahu::a, ahu::new);
   private static final int b = 2;
   private final boolean c;

   public ahu(cri $$0) {
      this.c = $$0.b;
   }

   private ahu(vu $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vu $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public zh<ahu> a() {
      return agn.bR;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
