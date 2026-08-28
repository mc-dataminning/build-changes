public interface cvw {
   cvw.a a = new cvw.a(false, false);
   cvw.a b = new cvw.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cvw {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cvw.a c() {
         return new cvw.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
