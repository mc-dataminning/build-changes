public interface cqu {
   cqu.a a = new cqu.a(false, false);
   cqu.a b = new cqu.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cqu {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cqu.a c() {
         return new cqu.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
