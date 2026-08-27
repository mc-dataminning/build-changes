public interface cuq {
   cuq.a a = new cuq.a(false, false);
   cuq.a b = new cuq.a(true, false);

   boolean a();

   boolean b();

   public static record a(boolean c, boolean d) implements cuq {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public cuq.a c() {
         return new cuq.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
