public interface fmm {
   fmo a();

   public static record a(fmo a) implements fmm {
      @Override
      public fmo a() {
         return this.a.a() == fmn.b ? this.a : fmo.b;
      }

      public fmo b() {
         return this.a;
      }
   }

   public static class b implements fmm {
      @Override
      public fmo a() {
         return fmo.b;
      }
   }

   public static record c(boolean a) implements fmm {
      @Override
      public fmo a() {
         return this.a ? fmo.b : fmo.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
