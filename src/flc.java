public enum flc {
   a,
   b;

   public flc a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fld b() {
      return switch (this) {
         case a -> fld.d;
         case b -> fld.b;
      };
   }

   public fld c() {
      return switch (this) {
         case a -> fld.c;
         case b -> fld.a;
      };
   }

   public fld a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
