public enum ewr {
   a,
   b;

   public ewr a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public ews b() {
      return switch (this) {
         case a -> ews.d;
         case b -> ews.b;
      };
   }

   public ews c() {
      return switch (this) {
         case a -> ews.c;
         case b -> ews.a;
      };
   }

   public ews a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
