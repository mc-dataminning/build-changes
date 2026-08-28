public interface cyy {
   cyy.a a = new cyy.a(false, false);
   cyy.a b = new cyy.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cyy {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cyy.a c() {
         return new cyy.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
