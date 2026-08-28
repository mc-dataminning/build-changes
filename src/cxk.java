public interface cxk {
   cxk.a a = new cxk.a(false, false);
   cxk.a b = new cxk.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cxk {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cxk.a c() {
         return new cxk.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
