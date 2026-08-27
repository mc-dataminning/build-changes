public interface crh {
   crh.a a = new crh.a(false, false);
   crh.a b = new crh.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements crh {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public crh.a c() {
         return new crh.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
