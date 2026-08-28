import java.util.List;

public class cvi extends cum {
   private static final int a = 32;

   public cvi(cum.a $$0) {
      super($$0);
   }

   @Override
   public cur w() {
      cur $$0 = super.w();
      $$0.b(km.G, new cws(cwt.a));
      return $$0;
   }

   @Override
   public cur a(cur $$0, dca $$1, btr $$2) {
      cmz $$3 = $$2 instanceof cmz ? (cmz)$$2 : null;
      if ($$3 instanceof arg) {
         am.A.a((arg)$$3, $$0);
      }

      if (!$$1.B) {
         cws $$4 = $$0.a(km.G, cws.a);
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
            return new cur(cuu.sl);
         }

         if ($$3 != null) {
            $$3.gc().f(new cur(cuu.sl));
         }
      }

      $$2.a(dwx.l);
      return $$0;
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      cmz $$3 = $$0.o();
      cur $$4 = $$0.n();
      cws $$5 = $$4.a(km.G, cws.a);
      dse $$6 = $$1.a_($$2);
      if ($$0.k() != je.a && $$6.a(awp.ci) && $$5.a(cwt.a)) {
         $$1.a(null, $$2, awa.ki, awb.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cut.a($$4, $$3, new cur(cuu.sl)));
         $$3.b(awk.c.b($$4.g()));
         if (!$$1.B) {
            arf $$7 = (arf)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(li.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awa.cB, awb.e, 1.0F, 1.0F);
         $$1.a(null, dwx.z, $$2);
         $$1.b($$2, dfd.sI.o());
         return bqw.a($$1.B);
      } else {
         return bqw.e;
      }
   }

   @Override
   public int b(cur $$0) {
      return 32;
   }

   @Override
   public cwm c(cur $$0) {
      return cwm.c;
   }

   @Override
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      return cut.a($$0, $$1, $$2);
   }

   @Override
   public String i(cur $$0) {
      return cwq.a($$0.a(km.G, cws.a).e(), this.a() + ".effect.");
   }

   @Override
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      cws $$4 = $$0.a(km.G);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
