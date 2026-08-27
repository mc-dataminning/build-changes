public enum ewk {
   a,
   b;

   public ewk a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public ewl b() {
      return switch (this) {
         case a -> ewl.d;
         case b -> ewl.b;
      };
   }

   public ewl c() {
      return switch (this) {
         case a -> ewl.c;
         case b -> ewl.a;
      };
   }

   public ewl a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
