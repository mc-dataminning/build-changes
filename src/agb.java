public class agb implements yb<aez> {
   public static final xs<uu, agb> a = yb.a(agb::a, agb::new);
   private static final int b = 2;
   private final boolean c;

   public agb(cip $$0) {
      this.c = $$0.b;
   }

   private agb(uu $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(uu $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public yd<agb> a() {
      return aex.bH;
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
