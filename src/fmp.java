public interface fmp {
   fmr a();

   public static record a(fmr a) implements fmp {
      @Override
      public fmr a() {
         return this.a.a() == fmq.b ? this.a : fmr.b;
      }

      public fmr b() {
         return this.a;
      }
   }

   public static class b implements fmp {
      @Override
      public fmr a() {
         return fmr.b;
      }
   }

   public static record c(boolean a) implements fmp {
      @Override
      public fmr a() {
         return this.a ? fmr.b : fmr.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
