public interface ewj {
   ewl a();

   public static record a(ewl a) implements ewj {
      @Override
      public ewl a() {
         return this.a.a() == ewk.b ? this.a : ewl.b;
      }

      public ewl b() {
         return this.a;
      }
   }

   public static class b implements ewj {
      @Override
      public ewl a() {
         return ewl.b;
      }
   }

   public static record c(boolean a) implements ewj {
      @Override
      public ewl a() {
         return this.a ? ewl.b : ewl.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
