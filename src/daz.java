public interface daz {
   daz.a a = new daz.a(false, false);
   daz.a b = new daz.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements daz {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public daz.a c() {
         return new daz.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
