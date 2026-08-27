public class cyt extends csm {
   public static final dgc d = dgb.w;
   private final cyt.a e;

   protected cyt(cyt.a $$0, dfk.d $$1, dga $$2) {
      super($$1, $$2);
      this.k(this.C.b().a(d, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   protected int g(dfl $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected dfl a(dfl $$0, int $$1) {
      return $$0.a(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cpx $$0, gw $$1) {
      Class $$2 = switch (this.e) {
         case a -> bis.class;
         case b -> bji.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(d);
   }

   public static enum a {
      a,
      b;
   }
}
