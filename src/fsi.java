public enum fsi {
   a,
   b;

   public fsi a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fsj b() {
      return switch (this) {
         case a -> fsj.d;
         case b -> fsj.b;
      };
   }

   public fsj c() {
      return switch (this) {
         case a -> fsj.c;
         case b -> fsj.a;
      };
   }

   public fsj a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
