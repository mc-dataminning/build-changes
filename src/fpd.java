public interface fpd {
   fpf a();

   public static record a(fpf a) implements fpd {
      @Override
      public fpf a() {
         return this.a.a() == fpe.b ? this.a : fpf.b;
      }

      public fpf b() {
         return this.a;
      }
   }

   public static class b implements fpd {
      @Override
      public fpf a() {
         return fpf.b;
      }
   }

   public static record c(boolean a) implements fpd {
      @Override
      public fpf a() {
         return this.a ? fpf.b : fpf.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
