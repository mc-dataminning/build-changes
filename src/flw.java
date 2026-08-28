public interface flw {
   fly a();

   public static record a(fly a) implements flw {
      @Override
      public fly a() {
         return this.a.a() == flx.b ? this.a : fly.b;
      }

      public fly b() {
         return this.a;
      }
   }

   public static class b implements flw {
      @Override
      public fly a() {
         return fly.b;
      }
   }

   public static record c(boolean a) implements flw {
      @Override
      public fly a() {
         return this.a ? fly.b : fly.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
