public interface csd {
   csd.a a = new csd.a(false, false);
   csd.a b = new csd.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements csd {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public csd.a c() {
         return new csd.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
