public interface cna {
   cna.a a = new cna.a(false, false);
   cna.a b = new cna.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cna {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cna.a c() {
         return new cna.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
