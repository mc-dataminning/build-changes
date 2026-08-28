public class ahk implements yw<agf> {
   public static final yn<vl, ahk> a = yw.a(ahk::a, ahk::new);
   private static final int b = 2;
   private final boolean c;

   public ahk(cpn $$0) {
      this.c = $$0.b;
   }

   private ahk(vl $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vl $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public yy<ahk> a() {
      return agd.bQ;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
