public interface fqa {
   fqc a();

   public static record a(fqc a) implements fqa {
      @Override
      public fqc a() {
         return this.a.a() == fqb.b ? this.a : fqc.b;
      }

      public fqc b() {
         return this.a;
      }
   }

   public static class b implements fqa {
      @Override
      public fqc a() {
         return fqc.b;
      }
   }

   public static record c(boolean a) implements fqa {
      @Override
      public fqc a() {
         return this.a ? fqc.b : fqc.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
