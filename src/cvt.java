public interface cvt {
   cvt.a a = new cvt.a(false, false);
   cvt.a b = new cvt.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cvt {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cvt.a c() {
         return new cvt.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
