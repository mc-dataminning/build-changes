public interface dbz {
   dbz.a a = new dbz.a(false, false);
   dbz.a b = new dbz.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements dbz {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public dbz.a c() {
         return new dbz.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
