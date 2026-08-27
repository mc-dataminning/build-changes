public enum ewe {
   a,
   b;

   public ewe a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public ewf b() {
      return switch (this) {
         case a -> ewf.d;
         case b -> ewf.b;
      };
   }

   public ewf c() {
      return switch (this) {
         case a -> ewf.c;
         case b -> ewf.a;
      };
   }

   public ewf a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
