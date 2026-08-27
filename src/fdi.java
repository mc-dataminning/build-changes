public interface fdi {
   fdk a();

   public static record a(fdk a) implements fdi {
      @Override
      public fdk a() {
         return this.a.a() == fdj.b ? this.a : fdk.b;
      }

      public fdk b() {
         return this.a;
      }
   }

   public static class b implements fdi {
      @Override
      public fdk a() {
         return fdk.b;
      }
   }

   public static record c(boolean a) implements fdi {
      @Override
      public fdk a() {
         return this.a ? fdk.b : fdk.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
