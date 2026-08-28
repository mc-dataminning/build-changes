public class ahv implements zs<ags> {
   public static final zj<wl, ahv> a = zs.a(ahv::a, ahv::new);
   private static final int b = 2;
   private final boolean c;

   public ahv(cmp $$0) {
      this.c = $$0.b;
   }

   private ahv(wl $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(wl $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public zu<ahv> a() {
      return agq.bJ;
   }

   public void a(ags $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
