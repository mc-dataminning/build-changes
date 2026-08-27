public interface ctu {
   ctu.a a = new ctu.a(false, false);
   ctu.a b = new ctu.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements ctu {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public ctu.a c() {
         return new ctu.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
