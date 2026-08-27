public interface cti {
   cti.a a = new cti.a(false, false);
   cti.a b = new cti.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cti {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cti.a c() {
         return new cti.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
