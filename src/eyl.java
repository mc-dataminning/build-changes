public interface eyl {
   eyn a();

   public static record a(eyn a) implements eyl {
      @Override
      public eyn a() {
         return this.a.a() == eym.b ? this.a : eyn.b;
      }

      public eyn b() {
         return this.a;
      }
   }

   public static class b implements eyl {
      @Override
      public eyn a() {
         return eyn.b;
      }
   }

   public static record c(boolean a) implements eyl {
      @Override
      public eyn a() {
         return this.a ? eyn.b : eyn.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
