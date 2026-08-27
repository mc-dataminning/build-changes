import java.util.List;
import javax.annotation.Nullable;

public class cju extends cja {
   private static final int a = 32;

   public cju(cja.a $$0) {
      super($$0);
   }

   @Override
   public cjf ai_() {
      return cle.a(super.ai_(), clf.c);
   }

   @Override
   public cjf a(cjf $$0, cpv $$1, bjg $$2) {
      cbu $$3 = $$2 instanceof cbu ? (cbu)$$2 : null;
      if ($$3 instanceof aks) {
         al.z.a((aks)$$3, $$0);
      }

      if (!$$1.B) {
         for (bid $$5 : cle.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new bid($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(apo.c.b(this));
         if (!$$3.fS().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fS().d) {
         if ($$0.b()) {
            return new cjf(cji.rw);
         }

         if ($$3 != null) {
            $$3.fR().e(new cjf(cji.rw));
         }
      }

      $$2.a(djt.l);
      return $$0;
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      cbu $$3 = $$0.o();
      cjf $$4 = $$0.n();
      dfj $$5 = $$1.a_($$2);
      if ($$0.k() != hc.a && $$5.a(apt.ca) && cle.d($$4) == clf.c) {
         $$1.a(null, $$2, ape.jb, apf.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cjh.a($$4, $$3, new cjf(cji.rw)));
         $$3.b(apo.c.b($$4.d()));
         if (!$$1.B) {
            akr $$6 = (akr)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(ix.ag, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, ape.ch, apf.e, 1.0F, 1.0F);
         $$1.a(null, djt.z, $$2);
         $$1.b($$2, csw.rH.n());
         return bgy.a($$1.B);
      } else {
         return bgy.d;
      }
   }

   @Override
   public int b(cjf $$0) {
      return 32;
   }

   @Override
   public cky c(cjf $$0) {
      return cky.c;
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      return cjh.a($$0, $$1, $$2);
   }

   @Override
   public String j(cjf $$0) {
      return cle.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tm> $$2, ckw $$3) {
      cle.a($$0, $$2, 1.0F);
   }
}
