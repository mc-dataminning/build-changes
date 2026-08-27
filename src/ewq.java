public interface ewq {
   ews a();

   public static record a(ews a) implements ewq {
      @Override
      public ews a() {
         return this.a.a() == ewr.b ? this.a : ews.b;
      }

      public ews b() {
         return this.a;
      }
   }

   public static class b implements ewq {
      @Override
      public ews a() {
         return ews.b;
      }
   }

   public static record c(boolean a) implements ewq {
      @Override
      public ews a() {
         return this.a ? ews.b : ews.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
