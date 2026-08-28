public interface flf {
   flh a();

   public static record a(flh a) implements flf {
      @Override
      public flh a() {
         return this.a.a() == flg.b ? this.a : flh.b;
      }

      public flh b() {
         return this.a;
      }
   }

   public static class b implements flf {
      @Override
      public flh a() {
         return flh.b;
      }
   }

   public static record c(boolean a) implements flf {
      @Override
      public flh a() {
         return this.a ? flh.b : flh.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
