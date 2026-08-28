public interface flg {
   fli a();

   public static record a(fli a) implements flg {
      @Override
      public fli a() {
         return this.a.a() == flh.b ? this.a : fli.b;
      }

      public fli b() {
         return this.a;
      }
   }

   public static class b implements flg {
      @Override
      public fli a() {
         return fli.b;
      }
   }

   public static record c(boolean a) implements flg {
      @Override
      public fli a() {
         return this.a ? fli.b : fli.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
