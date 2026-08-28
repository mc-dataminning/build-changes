public interface cyi {
   cyi.a a = new cyi.a(false, false);
   cyi.a b = new cyi.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cyi {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cyi.a c() {
         return new cyi.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
