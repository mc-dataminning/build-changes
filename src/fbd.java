public interface fbd {
   fbf a();

   public static record a(fbf a) implements fbd {
      @Override
      public fbf a() {
         return this.a.a() == fbe.b ? this.a : fbf.b;
      }

      public fbf b() {
         return this.a;
      }
   }

   public static class b implements fbd {
      @Override
      public fbf a() {
         return fbf.b;
      }
   }

   public static record c(boolean a) implements fbd {
      @Override
      public fbf a() {
         return this.a ? fbf.b : fbf.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
