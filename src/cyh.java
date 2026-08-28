public interface cyh {
   cyh.a a = new cyh.a(false, false);
   cyh.a b = new cyh.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cyh {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cyh.a c() {
         return new cyh.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
