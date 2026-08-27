public interface evz {
   ewb a();

   public static record a(ewb a) implements evz {
      @Override
      public ewb a() {
         return this.a.a() == ewa.b ? this.a : ewb.b;
      }

      public ewb b() {
         return this.a;
      }
   }

   public static class b implements evz {
      @Override
      public ewb a() {
         return ewb.b;
      }
   }

   public static record c(boolean a) implements evz {
      @Override
      public ewb a() {
         return this.a ? ewb.b : ewb.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
