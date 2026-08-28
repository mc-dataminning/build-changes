public record frm(gmh a, gmh b, gmh c) {
   public static frm a(akv $$0) {
      return new frm(gmh.v($$0), gmh.z($$0), gmh.x($$0));
   }

   public static frm b(akv $$0) {
      return new frm(gmh.u($$0), gmh.y($$0), gmh.w($$0));
   }

   public gmh a(fob.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
