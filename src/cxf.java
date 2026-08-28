public interface cxf {
   cxf.a a = new cxf.a(false, false);
   cxf.a b = new cxf.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cxf {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cxf.a c() {
         return new cxf.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
