public record fsk(gnh a, gnh b, gnh c) {
   public static fsk a(aku $$0) {
      return new fsk(gnh.v($$0), gnh.z($$0), gnh.x($$0));
   }

   public static fsk b(aku $$0) {
      return new fsk(gnh.u($$0), gnh.y($$0), gnh.w($$0));
   }

   public gnh a(fpa.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
