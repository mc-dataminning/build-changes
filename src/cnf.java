public interface cnf {
   cnf.a a = new cnf.a(false, false);
   cnf.a b = new cnf.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cnf {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cnf.a c() {
         return new cnf.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
