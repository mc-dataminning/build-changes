public interface coy {
   coy.a a = new coy.a(false, false);
   coy.a b = new coy.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements coy {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public coy.a c() {
         return new coy.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
