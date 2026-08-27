public interface cwi {
   cwi.a a = new cwi.a(false, false);
   cwi.a b = new cwi.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cwi {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cwi.a c() {
         return new cwi.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
