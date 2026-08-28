public record fnt(gig a, gig b, gig c) {
   public static fnt a(alh $$0) {
      return new fnt(gig.u($$0), gig.y($$0), gig.w($$0));
   }

   public static fnt b(alh $$0) {
      return new fnt(gig.t($$0), gig.x($$0), gig.v($$0));
   }

   public gig a(fkk.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
