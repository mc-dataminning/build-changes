public interface fst {
   fsv a();

   public static record a(fsv a) implements fst {
      @Override
      public fsv a() {
         return this.a.a() == fsu.b ? this.a : fsv.b;
      }

      public fsv b() {
         return this.a;
      }
   }

   public static class b implements fst {
      @Override
      public fsv a() {
         return fsv.b;
      }
   }

   public static record c(boolean a) implements fst {
      @Override
      public fsv a() {
         return this.a ? fsv.b : fsv.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
