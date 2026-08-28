public enum fsy {
   a,
   b;

   public fsy a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fsz b() {
      return switch (this) {
         case a -> fsz.d;
         case b -> fsz.b;
      };
   }

   public fsz c() {
      return switch (this) {
         case a -> fsz.c;
         case b -> fsz.a;
      };
   }

   public fsz a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
