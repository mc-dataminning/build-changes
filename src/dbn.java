public interface dbn {
   dbn.a a = new dbn.a(false, false);
   dbn.a b = new dbn.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements dbn {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public dbn.a c() {
         return new dbn.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
