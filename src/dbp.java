public interface dbp {
   dbp.a a = new dbp.a(false, false);
   dbp.a b = new dbp.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements dbp {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public dbp.a c() {
         return new dbp.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
