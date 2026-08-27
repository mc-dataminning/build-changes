public record erp(fkf a, fkf b, fkf c) {
   public static erp a(acq $$0) {
      return new erp(fkf.s($$0), fkf.w($$0), fkf.u($$0));
   }

   public static erp b(acq $$0) {
      return new erp(fkf.r($$0), fkf.v($$0), fkf.t($$0));
   }

   public fkf a(eov.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
