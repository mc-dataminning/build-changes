public interface fsi {
   fsk a();

   public static record a(fsk a) implements fsi {
      @Override
      public fsk a() {
         return this.a.a() == fsj.b ? this.a : fsk.b;
      }

      public fsk b() {
         return this.a;
      }
   }

   public static class b implements fsi {
      @Override
      public fsk a() {
         return fsk.b;
      }
   }

   public static record c(boolean a) implements fsi {
      @Override
      public fsk a() {
         return this.a ? fsk.b : fsk.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
