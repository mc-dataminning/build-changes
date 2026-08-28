public interface fod {
   fof a();

   public static record a(fof a) implements fod {
      @Override
      public fof a() {
         return this.a.a() == foe.b ? this.a : fof.b;
      }

      public fof b() {
         return this.a;
      }
   }

   public static class b implements fod {
      @Override
      public fof a() {
         return fof.b;
      }
   }

   public static record c(boolean a) implements fod {
      @Override
      public fof a() {
         return this.a ? fof.b : fof.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
