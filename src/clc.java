public interface clc {
   clc.a a = new clc.a(false, false);
   clc.a b = new clc.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements clc {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public clc.a c() {
         return new clc.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
