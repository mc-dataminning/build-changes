public class ahe implements zb<agb> {
   public static final ys<vr, ahe> a = zb.a(ahe::a, ahe::new);
   private static final int b = 2;
   private final boolean c;

   public ahe(cme $$0) {
      this.c = $$0.b;
   }

   private ahe(vr $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vr $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public zd<ahe> a() {
      return afz.bJ;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
