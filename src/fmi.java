public interface fmi {
   fmk a();

   public static record a(fmk a) implements fmi {
      @Override
      public fmk a() {
         return this.a.a() == fmj.b ? this.a : fmk.b;
      }

      public fmk b() {
         return this.a;
      }
   }

   public static class b implements fmi {
      @Override
      public fmk a() {
         return fmk.b;
      }
   }

   public static record c(boolean a) implements fmi {
      @Override
      public fmk a() {
         return this.a ? fmk.b : fmk.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
