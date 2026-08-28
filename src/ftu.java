public enum ftu {
   a,
   b;

   public ftu a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public ftv b() {
      return switch (this) {
         case a -> ftv.d;
         case b -> ftv.b;
      };
   }

   public ftv c() {
      return switch (this) {
         case a -> ftv.c;
         case b -> ftv.a;
      };
   }

   public ftv a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
