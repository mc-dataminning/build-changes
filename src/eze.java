public enum eze {
   a,
   b;

   public eze a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public ezf b() {
      return switch (this) {
         case a -> ezf.d;
         case b -> ezf.b;
      };
   }

   public ezf c() {
      return switch (this) {
         case a -> ezf.c;
         case b -> ezf.a;
      };
   }

   public ezf a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
