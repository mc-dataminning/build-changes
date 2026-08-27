public interface coi {
   coi.a a = new coi.a(false, false);
   coi.a b = new coi.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements coi {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public coi.a c() {
         return new coi.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
