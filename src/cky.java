import java.util.List;
import javax.annotation.Nullable;

public class cky extends cke {
   private static final int a = 32;

   public cky(cke.a $$0) {
      super($$0);
   }

   @Override
   public ckj al_() {
      return cmi.a(super.al_(), cmj.c);
   }

   @Override
   public ckj a(ckj $$0, cqz $$1, bkj $$2) {
      ccx $$3 = $$2 instanceof ccx ? (ccx)$$2 : null;
      if ($$3 instanceof alr) {
         al.z.a((alr)$$3, $$0);
      }

      if (!$$1.B) {
         for (bjg $$5 : cmi.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new bjg($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(aqn.c.b(this));
         if (!$$3.fT().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fT().d) {
         if ($$0.b()) {
            return new ckj(ckm.rw);
         }

         if ($$3 != null) {
            $$3.fS().e(new ckj(ckm.rw));
         }
      }

      $$2.a(dkl.l);
      return $$0;
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      ccx $$3 = $$0.o();
      ckj $$4 = $$0.n();
      dgb $$5 = $$1.a_($$2);
      if ($$0.k() != hx.a && $$5.a(aqs.ca) && cmi.d($$4) == cmj.c) {
         $$1.a(null, $$2, aqd.jd, aqe.e, 1.0F, 1.0F);
         $$3.a($$0.p(), ckl.a($$4, $$3, new ckj(ckm.rw)));
         $$3.b(aqn.c.b($$4.d()));
         if (!$$1.B) {
            alq $$6 = (alq)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(js.ag, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, aqd.ch, aqe.e, 1.0F, 1.0F);
         $$1.a(null, dkl.z, $$2);
         $$1.b($$2, cuc.rH.o());
         return bib.a($$1.B);
      } else {
         return bib.d;
      }
   }

   @Override
   public int b(ckj $$0) {
      return 32;
   }

   @Override
   public cmc c(ckj $$0) {
      return cmc.c;
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      return ckl.a($$0, $$1, $$2);
   }

   @Override
   public String j(ckj $$0) {
      return cmi.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      cmi.a($$0, $$2, 1.0F);
   }
}
