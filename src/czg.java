public interface czg {
   czg.a a = new czg.a(false, false);
   czg.a b = new czg.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements czg {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public czg.a c() {
         return new czg.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
