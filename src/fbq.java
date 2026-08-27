public interface fbq {
   fbs a();

   public static record a(fbs a) implements fbq {
      @Override
      public fbs a() {
         return this.a.a() == fbr.b ? this.a : fbs.b;
      }

      public fbs b() {
         return this.a;
      }
   }

   public static class b implements fbq {
      @Override
      public fbs a() {
         return fbs.b;
      }
   }

   public static record c(boolean a) implements fbq {
      @Override
      public fbs a() {
         return this.a ? fbs.b : fbs.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
