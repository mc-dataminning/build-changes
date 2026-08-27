public interface cvh {
   cvh.a a = new cvh.a(false, false);
   cvh.a b = new cvh.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cvh {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cvh.a c() {
         return new cvh.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
