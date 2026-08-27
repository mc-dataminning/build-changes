public class crc extends cri {
   public crc(cri.a $$0, blz... $$1) {
      super($$0, crj.k, $$1);
   }

   @Override
   public int a(int $$0) {
      return 12 + ($$0 - 1) * 20;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 25;
   }

   @Override
   public int a() {
      return 2;
   }
}
