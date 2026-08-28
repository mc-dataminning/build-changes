public interface fsx {
   fsz a();

   public static record a(fsz a) implements fsx {
      @Override
      public fsz a() {
         return this.a.a() == fsy.b ? this.a : fsz.b;
      }

      public fsz b() {
         return this.a;
      }
   }

   public static class b implements fsx {
      @Override
      public fsz a() {
         return fsz.b;
      }
   }

   public static record c(boolean a) implements fsx {
      @Override
      public fsz a() {
         return this.a ? fsz.b : fsz.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
