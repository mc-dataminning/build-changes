public interface czn {
   czn.a a = new czn.a(false, false);
   czn.a b = new czn.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements czn {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public czn.a c() {
         return new czn.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
