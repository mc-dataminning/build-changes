public interface cxt {
   cxt.a a = new cxt.a(false, false);
   cxt.a b = new cxt.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cxt {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cxt.a c() {
         return new cxt.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
