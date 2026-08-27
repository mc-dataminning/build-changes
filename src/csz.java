public interface csz {
   csz.a a = new csz.a(false, false);
   csz.a b = new csz.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements csz {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public csz.a c() {
         return new csz.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
