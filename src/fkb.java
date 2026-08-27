public interface fkb {
   fkd a();

   public static record a(fkd a) implements fkb {
      @Override
      public fkd a() {
         return this.a.a() == fkc.b ? this.a : fkd.b;
      }

      public fkd b() {
         return this.a;
      }
   }

   public static class b implements fkb {
      @Override
      public fkd a() {
         return fkd.b;
      }
   }

   public static record c(boolean a) implements fkb {
      @Override
      public fkd a() {
         return this.a ? fkd.b : fkd.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
