public class agz implements yz<afx> {
   public static final yq<vs, agz> a = yz.a(agz::a, agz::new);
   private static final int b = 2;
   private final boolean c;

   public agz(cki $$0) {
      this.c = $$0.b;
   }

   private agz(vs $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vs $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public zb<agz> a() {
      return afv.bH;
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
