public interface czc {
   czc.a a = new czc.a(false, false);
   czc.a b = new czc.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements czc {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public czc.a c() {
         return new czc.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
