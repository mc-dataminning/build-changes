public interface ezd {
   ezf a();

   public static record a(ezf a) implements ezd {
      @Override
      public ezf a() {
         return this.a.a() == eze.b ? this.a : ezf.b;
      }

      public ezf b() {
         return this.a;
      }
   }

   public static class b implements ezd {
      @Override
      public ezf a() {
         return ezf.b;
      }
   }

   public static record c(boolean a) implements ezd {
      @Override
      public ezf a() {
         return this.a ? ezf.b : ezf.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
