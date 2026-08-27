public interface cms {
   cms.a a = new cms.a(false, false);
   cms.a b = new cms.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cms {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cms.a c() {
         return new cms.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
