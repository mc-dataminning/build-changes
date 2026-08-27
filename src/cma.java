public interface cma {
   cma.a a = new cma.a(false, false);
   cma.a b = new cma.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cma {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cma.a c() {
         return new cma.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
