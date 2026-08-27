public enum bos {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bos a(boolean $$0) {
      return $$0 ? a : b;
   }

   public boq b() {
      return switch (this) {
         case a -> boq.a;
         case b -> boq.b;
         case c -> boq.c;
         case d, e -> boq.d;
         case f -> boq.e;
      };
   }
}
