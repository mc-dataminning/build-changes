public record ezx(ftp a, ftp b, ftp c) {
   public static ezx a(ahg $$0) {
      return new ezx(ftp.u($$0), ftp.y($$0), ftp.w($$0));
   }

   public static ezx b(ahg $$0) {
      return new ezx(ftp.t($$0), ftp.x($$0), ftp.v($$0));
   }

   public ftp a(ews.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
