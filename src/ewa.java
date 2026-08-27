public enum ewa {
   a,
   b;

   public ewa a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public ewb b() {
      return switch (this) {
         case a -> ewb.d;
         case b -> ewb.b;
      };
   }

   public ewb c() {
      return switch (this) {
         case a -> ewb.c;
         case b -> ewb.a;
      };
   }

   public ewb a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
