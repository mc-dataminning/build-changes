public class cyg extends crz {
   public static final dfp d = dfo.w;
   private final cyg.a e;

   protected cyg(cyg.a $$0, dex.d $$1, dfn $$2) {
      super($$1, $$2);
      this.k(this.C.b().a(d, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   protected int g(dey $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected dey a(dey $$0, int $$1) {
      return $$0.a(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cpk $$0, gv $$1) {
      Class $$2 = switch (this.e) {
         case a -> big.class;
         case b -> biw.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(d);
   }

   public static enum a {
      a,
      b;
   }
}
