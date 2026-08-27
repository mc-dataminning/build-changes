public interface fjg {
   fji a();

   public static record a(fji a) implements fjg {
      @Override
      public fji a() {
         return this.a.a() == fjh.b ? this.a : fji.b;
      }

      public fji b() {
         return this.a;
      }
   }

   public static class b implements fjg {
      @Override
      public fji a() {
         return fji.b;
      }
   }

   public static record c(boolean a) implements fjg {
      @Override
      public fji a() {
         return this.a ? fji.b : fji.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
