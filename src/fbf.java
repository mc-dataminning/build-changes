public interface fbf {
   fbh a();

   public static record a(fbh a) implements fbf {
      @Override
      public fbh a() {
         return this.a.a() == fbg.b ? this.a : fbh.b;
      }

      public fbh b() {
         return this.a;
      }
   }

   public static class b implements fbf {
      @Override
      public fbh a() {
         return fbh.b;
      }
   }

   public static record c(boolean a) implements fbf {
      @Override
      public fbh a() {
         return this.a ? fbh.b : fbh.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
