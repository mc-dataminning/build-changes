public interface cop {
   cop.a a = new cop.a(false, false);
   cop.a b = new cop.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cop {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cop.a c() {
         return new cop.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
