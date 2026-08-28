public interface fpl {
   fpn a();

   public static record a(fpn a) implements fpl {
      @Override
      public fpn a() {
         return this.a.a() == fpm.b ? this.a : fpn.b;
      }

      public fpn b() {
         return this.a;
      }
   }

   public static class b implements fpl {
      @Override
      public fpn a() {
         return fpn.b;
      }
   }

   public static record c(boolean a) implements fpl {
      @Override
      public fpn a() {
         return this.a ? fpn.b : fpn.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
