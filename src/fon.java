public interface fon {
   fop a();

   public static record a(fop a) implements fon {
      @Override
      public fop a() {
         return this.a.a() == foo.b ? this.a : fop.b;
      }

      public fop b() {
         return this.a;
      }
   }

   public static class b implements fon {
      @Override
      public fop a() {
         return fop.b;
      }
   }

   public static record c(boolean a) implements fon {
      @Override
      public fop a() {
         return this.a ? fop.b : fop.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
