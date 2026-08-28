public interface cxh {
   cxh.a a = new cxh.a(false, false);
   cxh.a b = new cxh.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cxh {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cxh.a c() {
         return new cxh.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
