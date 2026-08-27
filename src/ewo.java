public interface ewo {
   ewq a();

   public static record a(ewq a) implements ewo {
      @Override
      public ewq a() {
         return this.a.a() == ewp.b ? this.a : ewq.b;
      }

      public ewq b() {
         return this.a;
      }
   }

   public static class b implements ewo {
      @Override
      public ewq a() {
         return ewq.b;
      }
   }

   public static record c(boolean a) implements ewo {
      @Override
      public ewq a() {
         return this.a ? ewq.b : ewq.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
