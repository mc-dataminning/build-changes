public interface cwg {
   cwg.a a = new cwg.a(false, false);
   cwg.a b = new cwg.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cwg {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cwg.a c() {
         return new cwg.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
