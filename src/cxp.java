public interface cxp {
   cxp.a a = new cxp.a(false, false);
   cxp.a b = new cxp.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cxp {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cxp.a c() {
         return new cxp.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
