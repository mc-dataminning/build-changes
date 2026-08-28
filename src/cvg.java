import java.util.List;

public class cvg extends cuk {
   private static final int a = 32;

   public cvg(cuk.a $$0) {
      super($$0);
   }

   @Override
   public cup w() {
      cup $$0 = super.w();
      $$0.b(km.G, new cwq(cwr.a));
      return $$0;
   }

   @Override
   public cup a(cup $$0, dby $$1, btp $$2) {
      cmx $$3 = $$2 instanceof cmx ? (cmx)$$2 : null;
      if ($$3 instanceof arg) {
         am.A.a((arg)$$3, $$0);
      }

      if (!$$1.B) {
         cwq $$4 = $$0.a(km.G, cwq.a);
         $$4.a($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$3, $$3, $$2, $$2x.e(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(awk.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fP()) {
         if ($$0.e()) {
            return new cup(cus.sl);
         }

         if ($$3 != null) {
            $$3.gc().f(new cup(cus.sl));
         }
      }

      $$2.a(dwv.l);
      return $$0;
   }

   @Override
   public bqu a(cyc $$0) {
      dby $$1 = $$0.q();
      iz $$2 = $$0.a();
      cmx $$3 = $$0.o();
      cup $$4 = $$0.n();
      cwq $$5 = $$4.a(km.G, cwq.a);
      dsc $$6 = $$1.a_($$2);
      if ($$0.k() != je.a && $$6.a(awp.ci) && $$5.a(cwr.a)) {
         $$1.a(null, $$2, awa.ki, awb.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cur.a($$4, $$3, new cup(cus.sl)));
         $$3.b(awk.c.b($$4.g()));
         if (!$$1.B) {
            arf $$7 = (arf)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(li.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awa.cB, awb.e, 1.0F, 1.0F);
         $$1.a(null, dwv.z, $$2);
         $$1.b($$2, dfb.sI.o());
         return bqu.a($$1.B);
      } else {
         return bqu.e;
      }
   }

   @Override
   public int b(cup $$0) {
      return 32;
   }

   @Override
   public cwk c(cup $$0) {
      return cwk.c;
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      return cur.a($$0, $$1, $$2);
   }

   @Override
   public String i(cup $$0) {
      return cwo.a($$0.a(km.G, cwq.a).e(), this.a() + ".effect.");
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      cwq $$4 = $$0.a(km.G);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
