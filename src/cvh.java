import java.util.List;

public class cvh extends cul {
   private static final int a = 32;

   public cvh(cul.a $$0) {
      super($$0);
   }

   @Override
   public cuq w() {
      cuq $$0 = super.w();
      $$0.b(km.G, new cwr(cws.a));
      return $$0;
   }

   @Override
   public cuq a(cuq $$0, dbz $$1, btq $$2) {
      cmy $$3 = $$2 instanceof cmy ? (cmy)$$2 : null;
      if ($$3 instanceof arg) {
         am.A.a((arg)$$3, $$0);
      }

      if (!$$1.B) {
         cwr $$4 = $$0.a(km.G, cwr.a);
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
            return new cuq(cut.sl);
         }

         if ($$3 != null) {
            $$3.gc().f(new cuq(cut.sl));
         }
      }

      $$2.a(dww.l);
      return $$0;
   }

   @Override
   public bqv a(cyd $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      cmy $$3 = $$0.o();
      cuq $$4 = $$0.n();
      cwr $$5 = $$4.a(km.G, cwr.a);
      dsd $$6 = $$1.a_($$2);
      if ($$0.k() != je.a && $$6.a(awp.ci) && $$5.a(cws.a)) {
         $$1.a(null, $$2, awa.ki, awb.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cus.a($$4, $$3, new cuq(cut.sl)));
         $$3.b(awk.c.b($$4.g()));
         if (!$$1.B) {
            arf $$7 = (arf)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(li.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awa.cB, awb.e, 1.0F, 1.0F);
         $$1.a(null, dww.z, $$2);
         $$1.b($$2, dfc.sI.o());
         return bqv.a($$1.B);
      } else {
         return bqv.e;
      }
   }

   @Override
   public int b(cuq $$0) {
      return 32;
   }

   @Override
   public cwl c(cuq $$0) {
      return cwl.c;
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      return cus.a($$0, $$1, $$2);
   }

   @Override
   public String i(cuq $$0) {
      return cwp.a($$0.a(km.G, cwr.a).e(), this.a() + ".effect.");
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      cwr $$4 = $$0.a(km.G);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
