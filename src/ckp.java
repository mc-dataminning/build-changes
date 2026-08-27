public interface ckp {
   ckp.a a = new ckp.a(false, false);
   ckp.a b = new ckp.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements ckp {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public ckp.a c() {
         return new ckp.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
