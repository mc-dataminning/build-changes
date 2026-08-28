public enum fqb {
   a,
   b;

   public fqb a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fqc b() {
      return switch (this) {
         case a -> fqc.d;
         case b -> fqc.b;
      };
   }

   public fqc c() {
      return switch (this) {
         case a -> fqc.c;
         case b -> fqc.a;
      };
   }

   public fqc a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
