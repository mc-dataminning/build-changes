import java.util.List;

public class cuh extends ctl {
   private static final int a = 32;

   public cuh(ctl.a $$0) {
      super($$0);
   }

   @Override
   public ctq w() {
      ctq $$0 = super.w();
      $$0.b(kb.F, new cvr(cvs.a));
      return $$0;
   }

   @Override
   public ctq a(ctq $$0, daz $$1, bsq $$2) {
      cly $$3 = $$2 instanceof cly ? (cly)$$2 : null;
      if ($$3 instanceof aqo) {
         am.A.a((aqo)$$3, $$0);
      }

      if (!$$1.B) {
         cvr $$4 = $$0.a(kb.F, cvr.a);
         $$4.a($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$3, $$3, $$2, $$2x.e(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(avs.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fP()) {
         if ($$0.e()) {
            return new ctq(ctt.sl);
         }

         if ($$3 != null) {
            $$3.gc().f(new ctq(ctt.sl));
         }
      }

      $$2.a(dvw.l);
      return $$0;
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      cly $$3 = $$0.o();
      ctq $$4 = $$0.n();
      cvr $$5 = $$4.a(kb.F, cvr.a);
      drd $$6 = $$1.a_($$2);
      if ($$0.k() != it.a && $$6.a(avx.ci) && $$5.a(cvs.a)) {
         $$1.a(null, $$2, avi.ki, avj.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cts.a($$4, $$3, new ctq(ctt.sl)));
         $$3.b(avs.c.b($$4.g()));
         if (!$$1.B) {
            aqn $$7 = (aqn)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(ky.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, avi.cB, avj.e, 1.0F, 1.0F);
         $$1.a(null, dvw.z, $$2);
         $$1.b($$2, dec.sI.n());
         return bpw.a($$1.B);
      } else {
         return bpw.d;
      }
   }

   @Override
   public int b(ctq $$0) {
      return 32;
   }

   @Override
   public cvl c(ctq $$0) {
      return cvl.c;
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      return cts.a($$0, $$1, $$2);
   }

   @Override
   public String i(ctq $$0) {
      return cvp.a($$0.a(kb.F, cvr.a).f(), this.a() + ".effect.");
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      cvr $$4 = $$0.a(kb.F);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
