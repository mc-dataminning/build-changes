public interface fsh {
   fsj a();

   public static record a(fsj a) implements fsh {
      @Override
      public fsj a() {
         return this.a.a() == fsi.b ? this.a : fsj.b;
      }

      public fsj b() {
         return this.a;
      }
   }

   public static class b implements fsh {
      @Override
      public fsj a() {
         return fsj.b;
      }
   }

   public static record c(boolean a) implements fsh {
      @Override
      public fsj a() {
         return this.a ? fsj.b : fsj.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
