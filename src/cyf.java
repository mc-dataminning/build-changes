public interface cyf {
   cyf.a a = new cyf.a(false, false);
   cyf.a b = new cyf.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cyf {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cyf.a c() {
         return new cyf.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
