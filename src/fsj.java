public interface fsj {
   fsl a();

   public static record a(fsl a) implements fsj {
      @Override
      public fsl a() {
         return this.a.a() == fsk.b ? this.a : fsl.b;
      }

      public fsl b() {
         return this.a;
      }
   }

   public static class b implements fsj {
      @Override
      public fsl a() {
         return fsl.b;
      }
   }

   public static record c(boolean a) implements fsj {
      @Override
      public fsl a() {
         return this.a ? fsl.b : fsl.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
