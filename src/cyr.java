public class cyr extends csk {
   public static final dga d = dfz.w;
   private final cyr.a e;

   protected cyr(cyr.a $$0, dfi.d $$1, dfy $$2) {
      super($$1, $$2);
      this.k(this.C.b().a(d, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   protected int g(dfj $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected dfj a(dfj $$0, int $$1) {
      return $$0.a(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cpv $$0, gw $$1) {
      Class $$2 = switch (this.e) {
         case a -> biq.class;
         case b -> bjg.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(d);
   }

   public static enum a {
      a,
      b;
   }
}
