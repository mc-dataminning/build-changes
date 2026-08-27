public class ahg implements ze<agd> {
   public static final yv<vx, ahg> a = ze.a(ahg::a, ahg::new);
   private static final int b = 2;
   private final boolean c;

   public ahg(clt $$0) {
      this.c = $$0.b;
   }

   private ahg(vx $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vx $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public zg<ahg> a() {
      return agb.bI;
   }

   public void a(agd $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
