public interface cwk {
   cwk.a a = new cwk.a(false, false);
   cwk.a b = new cwk.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cwk {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cwk.a c() {
         return new cwk.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
