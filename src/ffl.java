public enum ffl {
   a,
   b;

   public ffl a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public ffm b() {
      return switch (this) {
         case a -> ffm.d;
         case b -> ffm.b;
      };
   }

   public ffm c() {
      return switch (this) {
         case a -> ffm.c;
         case b -> ffm.a;
      };
   }

   public ffm a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
