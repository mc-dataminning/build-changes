public class ahk implements zf<agh> {
   public static final yw<vv, ahk> a = zf.a(ahk::a, ahk::new);
   private static final int b = 2;
   private final boolean c;

   public ahk(cms $$0) {
      this.c = $$0.b;
   }

   private ahk(vv $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vv $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public zh<ahk> a() {
      return agf.bJ;
   }

   public void a(agh $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
