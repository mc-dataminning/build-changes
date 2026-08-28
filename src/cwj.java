public interface cwj {
   cwj.a a = new cwj.a(false, false);
   cwj.a b = new cwj.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cwj {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cwj.a c() {
         return new cwj.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
