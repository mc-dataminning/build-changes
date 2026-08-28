public interface fsw {
   fsy a();

   public static record a(fsy a) implements fsw {
      @Override
      public fsy a() {
         return this.a.a() == fsx.b ? this.a : fsy.b;
      }

      public fsy b() {
         return this.a;
      }
   }

   public static class b implements fsw {
      @Override
      public fsy a() {
         return fsy.b;
      }
   }

   public static record c(boolean a) implements fsw {
      @Override
      public fsy a() {
         return this.a ? fsy.b : fsy.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
