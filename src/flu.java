public interface flu {
   flw a();

   public static record a(flw a) implements flu {
      @Override
      public flw a() {
         return this.a.a() == flv.b ? this.a : flw.b;
      }

      public flw b() {
         return this.a;
      }
   }

   public static class b implements flu {
      @Override
      public flw a() {
         return flw.b;
      }
   }

   public static record c(boolean a) implements flu {
      @Override
      public flw a() {
         return this.a ? flw.b : flw.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
