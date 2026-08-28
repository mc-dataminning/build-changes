public interface das {
   das.a a = new das.a(false, false);
   das.a b = new das.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements das {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public das.a c() {
         return new das.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
