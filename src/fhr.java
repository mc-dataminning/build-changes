public interface fhr {
   fht a();

   public static record a(fht a) implements fhr {
      @Override
      public fht a() {
         return this.a.a() == fhs.b ? this.a : fht.b;
      }

      public fht b() {
         return this.a;
      }
   }

   public static class b implements fhr {
      @Override
      public fht a() {
         return fht.b;
      }
   }

   public static record c(boolean a) implements fhr {
      @Override
      public fht a() {
         return this.a ? fht.b : fht.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
