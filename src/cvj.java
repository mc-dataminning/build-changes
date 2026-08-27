public class cvj extends cpc {
   public static final dcs d = dcr.w;
   private final cvj.a e;

   protected cvj(cvj.a $$0, dca.d $$1, dcq $$2) {
      super($$1, $$2);
      this.k(this.C.b().a(d, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   protected int g(dcb $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected dcb a(dcb $$0, int $$1) {
      return $$0.a(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cmm $$0, gu $$1) {
      Class $$2 = switch (this.e) {
         case a -> bfj.class;
         case b -> bfz.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(d);
   }

   public static enum a {
      a,
      b;
   }
}
