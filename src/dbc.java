public interface dbc {
   dbc.a a = new dbc.a(false, false);
   dbc.a b = new dbc.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements dbc {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public dbc.a c() {
         return new dbc.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
