public interface cvv {
   cvv.a a = new cvv.a(false, false);
   cvv.a b = new cvv.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cvv {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cvv.a c() {
         return new cvv.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
