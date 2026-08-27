public interface ffi {
   ffk a();

   public static record a(ffk a) implements ffi {
      @Override
      public ffk a() {
         return this.a.a() == ffj.b ? this.a : ffk.b;
      }

      public ffk b() {
         return this.a;
      }
   }

   public static class b implements ffi {
      @Override
      public ffk a() {
         return ffk.b;
      }
   }

   public static record c(boolean a) implements ffi {
      @Override
      public ffk a() {
         return this.a ? ffk.b : ffk.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
