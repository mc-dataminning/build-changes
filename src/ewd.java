public interface ewd {
   ewf a();

   public static record a(ewf a) implements ewd {
      @Override
      public ewf a() {
         return this.a.a() == ewe.b ? this.a : ewf.b;
      }

      public ewf b() {
         return this.a;
      }
   }

   public static class b implements ewd {
      @Override
      public ewf a() {
         return ewf.b;
      }
   }

   public static record c(boolean a) implements ewd {
      @Override
      public ewf a() {
         return this.a ? ewf.b : ewf.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
