public interface fag {
   fai a();

   public static record a(fai a) implements fag {
      @Override
      public fai a() {
         return this.a.a() == fah.b ? this.a : fai.b;
      }

      public fai b() {
         return this.a;
      }
   }

   public static class b implements fag {
      @Override
      public fai a() {
         return fai.b;
      }
   }

   public static record c(boolean a) implements fag {
      @Override
      public fai a() {
         return this.a ? fai.b : fai.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
