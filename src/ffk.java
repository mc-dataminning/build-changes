public interface ffk {
   ffm a();

   public static record a(ffm a) implements ffk {
      @Override
      public ffm a() {
         return this.a.a() == ffl.b ? this.a : ffm.b;
      }

      public ffm b() {
         return this.a;
      }
   }

   public static class b implements ffk {
      @Override
      public ffm a() {
         return ffm.b;
      }
   }

   public static record c(boolean a) implements ffk {
      @Override
      public ffm a() {
         return this.a ? ffm.b : ffm.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
