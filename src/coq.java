public interface coq {
   coq.a a = new coq.a(false, false);
   coq.a b = new coq.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements coq {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public coq.a c() {
         return new coq.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
