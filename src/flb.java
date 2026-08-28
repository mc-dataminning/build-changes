public interface flb {
   fld a();

   public static record a(fld a) implements flb {
      @Override
      public fld a() {
         return this.a.a() == flc.b ? this.a : fld.b;
      }

      public fld b() {
         return this.a;
      }
   }

   public static class b implements flb {
      @Override
      public fld a() {
         return fld.b;
      }
   }

   public static record c(boolean a) implements flb {
      @Override
      public fld a() {
         return this.a ? fld.b : fld.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
