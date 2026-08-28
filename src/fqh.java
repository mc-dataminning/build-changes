public interface fqh {
   fqj a();

   public static record a(fqj a) implements fqh {
      @Override
      public fqj a() {
         return this.a.a() == fqi.b ? this.a : fqj.b;
      }

      public fqj b() {
         return this.a;
      }
   }

   public static class b implements fqh {
      @Override
      public fqj a() {
         return fqj.b;
      }
   }

   public static record c(boolean a) implements fqh {
      @Override
      public fqj a() {
         return this.a ? fqj.b : fqj.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
