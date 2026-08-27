public class ahb implements zb<afz> {
   public static final ys<vu, ahb> a = zb.a(ahb::a, ahb::new);
   private static final int b = 2;
   private final boolean c;

   public ahb(cle $$0) {
      this.c = $$0.b;
   }

   private ahb(vu $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vu $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public zd<ahb> a() {
      return afx.bH;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
