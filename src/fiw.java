public interface fiw {
   fiy a();

   public static record a(fiy a) implements fiw {
      @Override
      public fiy a() {
         return this.a.a() == fix.b ? this.a : fiy.b;
      }

      public fiy b() {
         return this.a;
      }
   }

   public static class b implements fiw {
      @Override
      public fiy a() {
         return fiy.b;
      }
   }

   public static record c(boolean a) implements fiw {
      @Override
      public fiy a() {
         return this.a ? fiy.b : fiy.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
