public interface ftt {
   ftv a();

   public static record a(ftv a) implements ftt {
      @Override
      public ftv a() {
         return this.a.a() == ftu.b ? this.a : ftv.b;
      }

      public ftv b() {
         return this.a;
      }
   }

   public static class b implements ftt {
      @Override
      public ftv a() {
         return ftv.b;
      }
   }

   public static record c(boolean a) implements ftt {
      @Override
      public ftv a() {
         return this.a ? ftv.b : ftv.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
