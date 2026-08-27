public interface eyy {
   eza a();

   public static record a(eza a) implements eyy {
      @Override
      public eza a() {
         return this.a.a() == eyz.b ? this.a : eza.b;
      }

      public eza b() {
         return this.a;
      }
   }

   public static class b implements eyy {
      @Override
      public eza a() {
         return eza.b;
      }
   }

   public static record c(boolean a) implements eyy {
      @Override
      public eza a() {
         return this.a ? eza.b : eza.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
