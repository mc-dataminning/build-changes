public class cyx extends csm {
   public static final dfy<ha.a> g = dfq.I;

   public cyx(dez.d $$0) {
      super($$0);
      this.k(this.n().a(g, ha.a.b));
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return b($$0, $$1);
   }

   public static dfa b(dfa $$0, cyy $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ha.a)$$0.c(g)) {
               case a:
                  return $$0.a(g, ha.a.c);
               case c:
                  return $$0.a(g, ha.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(g);
   }

   @Override
   public dfa a(clg $$0) {
      return this.n().a(g, $$0.k().o());
   }
}
