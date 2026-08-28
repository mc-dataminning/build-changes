public interface flo {
   flq a();

   public static record a(flq a) implements flo {
      @Override
      public flq a() {
         return this.a.a() == flp.b ? this.a : flq.b;
      }

      public flq b() {
         return this.a;
      }
   }

   public static class b implements flo {
      @Override
      public flq a() {
         return flq.b;
      }
   }

   public static record c(boolean a) implements flo {
      @Override
      public flq a() {
         return this.a ? flq.b : flq.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
