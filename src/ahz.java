public class ahz implements zw<agw> {
   public static final zn<wm, ahz> a = zw.a(ahz::a, ahz::new);
   private static final int b = 2;
   private final boolean c;

   public ahz(cmu $$0) {
      this.c = $$0.b;
   }

   private ahz(wm $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(wm $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public zy<ahz> a() {
      return agu.bJ;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
