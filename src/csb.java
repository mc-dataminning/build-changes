public interface csb {
   csb.a a = new csb.a(false, false);
   csb.a b = new csb.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements csb {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public csb.a c() {
         return new csb.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
