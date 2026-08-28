public interface fos {
   fou a();

   public static record a(fou a) implements fos {
      @Override
      public fou a() {
         return this.a.a() == fot.b ? this.a : fou.b;
      }

      public fou b() {
         return this.a;
      }
   }

   public static class b implements fos {
      @Override
      public fou a() {
         return fou.b;
      }
   }

   public static record c(boolean a) implements fos {
      @Override
      public fou a() {
         return this.a ? fou.b : fou.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
