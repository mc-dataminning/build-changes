public class eby extends ecb {
   eby(eck[] $$0) {
      super($$0, ecm.a($$0));
   }

   @Override
   public ecl b() {
      return ecm.c;
   }

   public static eby.a a(eck.a... $$0) {
      return new eby.a($$0);
   }

   public static class a extends ecb.a {
      public a(eck.a... $$0) {
         super($$0);
      }

      @Override
      public eby.a and(eck.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eck a(eck[] $$0) {
         return new eby($$0);
      }
   }

   public static class b extends ecb.b<eby> {
      protected eby a(eck[] $$0) {
         return new eby($$0);
      }
   }
}
