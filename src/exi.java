public interface exi {
   exk a();

   public static record a(exk a) implements exi {
      @Override
      public exk a() {
         return this.a.a() == exj.b ? this.a : exk.b;
      }

      public exk b() {
         return this.a;
      }
   }

   public static class b implements exi {
      @Override
      public exk a() {
         return exk.b;
      }
   }

   public static record c(boolean a) implements exi {
      @Override
      public exk a() {
         return this.a ? exk.b : exk.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
