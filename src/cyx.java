public interface cyx {
   cyx.a a = new cyx.a(false, false);
   cyx.a b = new cyx.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cyx {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cyx.a c() {
         return new cyx.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
