public interface ckn {
   ckn.a a = new ckn.a(false, false);
   ckn.a b = new ckn.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements ckn {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public ckn.a c() {
         return new ckn.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
