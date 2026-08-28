public class eee extends eef<egq> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final jg ao = jg.c;
   private final boolean ap;

   public static jg a(jg $$0) {
      return ao.a((kk)$$0);
   }

   public eee(boolean $$0) {
      super(egq.a);
      this.ap = $$0;
   }

   @Override
   public boolean a(eeh<egq> $$0) {
      jg $$1 = $$0.e();
      dfs $$2 = $$0.b();

      for (jg $$3 : jg.c(new jg($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new jg($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dia.F.m());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dia.fz.m());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dia.a.m());
            } else if (!$$4) {
               this.a($$2, $$3, dia.F.m());
            } else if (this.ap) {
               this.a($$2, new jg($$3), dia.fx.m());
            } else {
               this.a($$2, new jg($$3), dia.a.m());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dia.F.m());
      }

      jg $$6 = $$1.b(2);

      for (jl $$7 : jl.c.a) {
         this.a($$2, $$6.a($$7), dia.cq.m().b(dra.g, $$7));
      }

      return true;
   }
}
