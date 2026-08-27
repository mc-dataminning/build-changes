public interface fdp {
   fdr a();

   public static record a(fdr a) implements fdp {
      @Override
      public fdr a() {
         return this.a.a() == fdq.b ? this.a : fdr.b;
      }

      public fdr b() {
         return this.a;
      }
   }

   public static class b implements fdp {
      @Override
      public fdr a() {
         return fdr.b;
      }
   }

   public static record c(boolean a) implements fdp {
      @Override
      public fdr a() {
         return this.a ? fdr.b : fdr.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
