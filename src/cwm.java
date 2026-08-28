public interface cwm {
   cwm.a a = new cwm.a(false, false);
   cwm.a b = new cwm.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cwm {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cwm.a c() {
         return new cwm.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
