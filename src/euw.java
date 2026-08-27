public record euw(fnt a, fnt b, fnt c) {
   public static euw a(aer $$0) {
      return new euw(fnt.t($$0), fnt.x($$0), fnt.v($$0));
   }

   public static euw b(aer $$0) {
      return new euw(fnt.s($$0), fnt.w($$0), fnt.u($$0));
   }

   public fnt a(eru.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
