public interface fel {
   fen a();

   public static record a(fen a) implements fel {
      @Override
      public fen a() {
         return this.a.a() == fem.b ? this.a : fen.b;
      }

      public fen b() {
         return this.a;
      }
   }

   public static class b implements fel {
      @Override
      public fen a() {
         return fen.b;
      }
   }

   public static record c(boolean a) implements fel {
      @Override
      public fen a() {
         return this.a ? fen.b : fen.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
