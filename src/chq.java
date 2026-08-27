public interface chq {
   chq.a a = new chq.a(false, false);
   chq.a b = new chq.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements chq {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public chq.a c() {
         return new chq.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
