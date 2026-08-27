public class cyi extends csb {
   public static final dfr d = dfq.w;
   private final cyi.a e;

   protected cyi(cyi.a $$0, dez.d $$1, dfp $$2) {
      super($$1, $$2);
      this.k(this.C.b().a(d, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   protected int g(dfa $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected dfa a(dfa $$0, int $$1) {
      return $$0.a(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cpm $$0, gu $$1) {
      Class $$2 = switch (this.e) {
         case a -> bii.class;
         case b -> biy.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(d);
   }

   public static enum a {
      a,
      b;
   }
}
