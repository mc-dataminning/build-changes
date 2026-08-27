public interface cko {
   cko.a a = new cko.a(false, false);
   cko.a b = new cko.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cko {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cko.a c() {
         return new cko.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
