public interface fsc {
   fse a();

   public static record a(fse a) implements fsc {
      @Override
      public fse a() {
         return this.a.a() == fsd.b ? this.a : fse.b;
      }

      public fse b() {
         return this.a;
      }
   }

   public static class b implements fsc {
      @Override
      public fse a() {
         return fse.b;
      }
   }

   public static record c(boolean a) implements fsc {
      @Override
      public fse a() {
         return this.a ? fse.b : fse.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
