public interface cwd {
   cwd.a a = new cwd.a(false, false);
   cwd.a b = new cwd.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cwd {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cwd.a c() {
         return new cwd.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
