public interface ckr {
   ckr.a a = new ckr.a(false, false);
   ckr.a b = new ckr.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements ckr {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public ckr.a c() {
         return new ckr.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
