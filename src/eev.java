public class eev extends eey {
   eev(efh[] $$0) {
      super($$0, efj.a($$0));
   }

   @Override
   public efi b() {
      return efj.c;
   }

   public static eev.a a(efh.a... $$0) {
      return new eev.a($$0);
   }

   public static class a extends eey.a {
      public a(efh.a... $$0) {
         super($$0);
      }

      @Override
      public eev.a and(efh.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected efh a(efh[] $$0) {
         return new eev($$0);
      }
   }

   public static class b extends eey.b<eev> {
      protected eev a(efh[] $$0) {
         return new eev($$0);
      }
   }
}
