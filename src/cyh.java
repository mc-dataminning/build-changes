public class cyh extends csa {
   public static final dfq d = dfp.w;
   private final cyh.a e;

   protected cyh(cyh.a $$0, dey.d $$1, dfo $$2) {
      super($$1, $$2);
      this.k(this.C.b().a(d, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   protected int g(dez $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected dez a(dez $$0, int $$1) {
      return $$0.a(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cpl $$0, gu $$1) {
      Class $$2 = switch (this.e) {
         case a -> bii.class;
         case b -> biy.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(d);
   }

   public static enum a {
      a,
      b;
   }
}
