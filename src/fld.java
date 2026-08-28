public record fld(gff a, gff b, gff c) {
   public static fld a(akr $$0) {
      return new fld(gff.u($$0), gff.y($$0), gff.w($$0));
   }

   public static fld b(akr $$0) {
      return new fld(gff.t($$0), gff.x($$0), gff.v($$0));
   }

   public gff a(fhv.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
