public interface fia {
   fic a();

   public static record a(fic a) implements fia {
      @Override
      public fic a() {
         return this.a.a() == fib.b ? this.a : fic.b;
      }

      public fic b() {
         return this.a;
      }
   }

   public static class b implements fia {
      @Override
      public fic a() {
         return fic.b;
      }
   }

   public static record c(boolean a) implements fia {
      @Override
      public fic a() {
         return this.a ? fic.b : fic.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
