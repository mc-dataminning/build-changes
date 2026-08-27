public class eew extends eey {
   eew(efh[] $$0) {
      super($$0, efj.b($$0));
   }

   @Override
   public efi b() {
      return efj.b;
   }

   public static eew.a a(efh.a... $$0) {
      return new eew.a($$0);
   }

   public static class a extends eey.a {
      public a(efh.a... $$0) {
         super($$0);
      }

      @Override
      public eew.a or(efh.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected efh a(efh[] $$0) {
         return new eew($$0);
      }
   }

   public static class b extends eey.b<eew> {
      protected eew a(efh[] $$0) {
         return new eew($$0);
      }
   }
}
