public enum esw {
   a,
   b;

   public esw a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public esx b() {
      return switch (this) {
         case a -> esx.d;
         case b -> esx.b;
      };
   }

   public esx c() {
      return switch (this) {
         case a -> esx.c;
         case b -> esx.a;
      };
   }

   public esx a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
