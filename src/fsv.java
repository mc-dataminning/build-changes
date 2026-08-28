public interface fsv {
   fsx a();

   public static record a(fsx a) implements fsv {
      @Override
      public fsx a() {
         return this.a.a() == fsw.b ? this.a : fsx.b;
      }

      public fsx b() {
         return this.a;
      }
   }

   public static class b implements fsv {
      @Override
      public fsx a() {
         return fsx.b;
      }
   }

   public static record c(boolean a) implements fsv {
      @Override
      public fsx a() {
         return this.a ? fsx.b : fsx.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
