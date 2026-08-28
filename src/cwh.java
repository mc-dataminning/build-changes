public interface cwh {
   cwh.a a = new cwh.a(false, false);
   cwh.a b = new cwh.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cwh {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cwh.a c() {
         return new cwh.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
