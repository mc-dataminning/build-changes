public interface fax {
   faz a();

   public static record a(faz a) implements fax {
      @Override
      public faz a() {
         return this.a.a() == fay.b ? this.a : faz.b;
      }

      public faz b() {
         return this.a;
      }
   }

   public static class b implements fax {
      @Override
      public faz a() {
         return faz.b;
      }
   }

   public static record c(boolean a) implements fax {
      @Override
      public faz a() {
         return this.a ? faz.b : faz.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
