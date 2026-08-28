public interface cye {
   cye.a a = new cye.a(false, false);
   cye.a b = new cye.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cye {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cye.a c() {
         return new cye.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
