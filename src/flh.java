public interface flh {
   flj a();

   public static record a(flj a) implements flh {
      @Override
      public flj a() {
         return this.a.a() == fli.b ? this.a : flj.b;
      }

      public flj b() {
         return this.a;
      }
   }

   public static class b implements flh {
      @Override
      public flj a() {
         return flj.b;
      }
   }

   public static record c(boolean a) implements flh {
      @Override
      public flj a() {
         return this.a ? flj.b : flj.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
