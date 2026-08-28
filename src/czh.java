public interface czh {
   czh.a a = new czh.a(false, false);
   czh.a b = new czh.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements czh {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public czh.a c() {
         return new czh.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
