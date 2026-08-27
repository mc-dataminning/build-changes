public interface fbe {
   fbg a();

   public static record a(fbg a) implements fbe {
      @Override
      public fbg a() {
         return this.a.a() == fbf.b ? this.a : fbg.b;
      }

      public fbg b() {
         return this.a;
      }
   }

   public static class b implements fbe {
      @Override
      public fbg a() {
         return fbg.b;
      }
   }

   public static record c(boolean a) implements fbe {
      @Override
      public fbg a() {
         return this.a ? fbg.b : fbg.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
