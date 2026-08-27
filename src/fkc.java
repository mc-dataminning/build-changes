public interface fkc {
   fke a();

   public static record a(fke a) implements fkc {
      @Override
      public fke a() {
         return this.a.a() == fkd.b ? this.a : fke.b;
      }

      public fke b() {
         return this.a;
      }
   }

   public static class b implements fkc {
      @Override
      public fke a() {
         return fke.b;
      }
   }

   public static record c(boolean a) implements fkc {
      @Override
      public fke a() {
         return this.a ? fke.b : fke.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
