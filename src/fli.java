public interface fli {
   flk a();

   public static record a(flk a) implements fli {
      @Override
      public flk a() {
         return this.a.a() == flj.b ? this.a : flk.b;
      }

      public flk b() {
         return this.a;
      }
   }

   public static class b implements fli {
      @Override
      public flk a() {
         return flk.b;
      }
   }

   public static record c(boolean a) implements fli {
      @Override
      public flk a() {
         return this.a ? flk.b : flk.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
