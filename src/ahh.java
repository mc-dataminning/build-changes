public class ahh implements ze<age> {
   public static final yv<vx, ahh> a = ze.a(ahh::a, ahh::new);
   private static final int b = 2;
   private final boolean c;

   public ahh(clv $$0) {
      this.c = $$0.b;
   }

   private ahh(vx $$0) {
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
   public zg<ahh> a() {
      return agc.bJ;
   }

   public void a(age $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
