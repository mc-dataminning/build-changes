public class crc extends cqs {
   public crc(cqs.a $$0, blk... $$1) {
      super($$0, cqt.j, $$1);
   }

   @Override
   public int a(int $$0) {
      return $$0 * 25;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 50;
   }

   @Override
   public boolean b() {
      return true;
   }
}
