public interface fle {
   flg a();

   public static record a(flg a) implements fle {
      @Override
      public flg a() {
         return this.a.a() == flf.b ? this.a : flg.b;
      }

      public flg b() {
         return this.a;
      }
   }

   public static class b implements fle {
      @Override
      public flg a() {
         return flg.b;
      }
   }

   public static record c(boolean a) implements fle {
      @Override
      public flg a() {
         return this.a ? flg.b : flg.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
