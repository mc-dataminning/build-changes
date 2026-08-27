public interface ckw {
   ckw.a a = new ckw.a(false, false);
   ckw.a b = new ckw.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements ckw {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public ckw.a c() {
         return new ckw.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
