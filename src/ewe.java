public interface ewe {
   ewg a();

   public static record a(ewg a) implements ewe {
      @Override
      public ewg a() {
         return this.a.a() == ewf.b ? this.a : ewg.b;
      }

      public ewg b() {
         return this.a;
      }
   }

   public static class b implements ewe {
      @Override
      public ewg a() {
         return ewg.b;
      }
   }

   public static record c(boolean a) implements ewe {
      @Override
      public ewg a() {
         return this.a ? ewg.b : ewg.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
