public interface cqq {
   cqq.a a = new cqq.a(false, false);
   cqq.a b = new cqq.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cqq {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cqq.a c() {
         return new cqq.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
