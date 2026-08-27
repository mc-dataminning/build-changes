public interface cky {
   cky.a a = new cky.a(false, false);
   cky.a b = new cky.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cky {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cky.a c() {
         return new cky.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
