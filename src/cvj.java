public interface cvj {
   cvj.a a = new cvj.a(false, false);
   cvj.a b = new cvj.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cvj {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cvj.a c() {
         return new cvj.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
