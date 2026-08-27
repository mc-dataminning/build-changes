public interface esv {
   esx a();

   public static record a(esx a) implements esv {
      @Override
      public esx a() {
         return this.a.a() == esw.b ? this.a : esx.b;
      }

      public esx b() {
         return this.a;
      }
   }

   public static class b implements esv {
      @Override
      public esx a() {
         return esx.b;
      }
   }

   public static record c(boolean a) implements esv {
      @Override
      public esx a() {
         return this.a ? esx.b : esx.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
