public class agn implements yn<afl> {
   public static final ye<vg, agn> a = yn.a(agn::a, agn::new);
   private static final int b = 2;
   private final boolean c;

   public agn(cjq $$0) {
      this.c = $$0.b;
   }

   private agn(vg $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vg $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public yp<agn> a() {
      return afj.bH;
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
