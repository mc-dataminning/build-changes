import java.util.List;
import javax.annotation.Nullable;

public class cjp extends civ {
   private static final int a = 32;

   public cjp(civ.a $$0) {
      super($$0);
   }

   @Override
   public cja ad_() {
      return ckz.a(super.ad_(), cla.c);
   }

   @Override
   public cja a(cja $$0, cpq $$1, bjb $$2) {
      cbp $$3 = $$2 instanceof cbp ? (cbp)$$2 : null;
      if ($$3 instanceof ako) {
         al.z.a((ako)$$3, $$0);
      }

      if (!$$1.B) {
         for (bhy $$5 : ckz.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new bhy($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(apj.c.b(this));
         if (!$$3.fR().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fR().d) {
         if ($$0.b()) {
            return new cja(cjd.rw);
         }

         if ($$3 != null) {
            $$3.fQ().e(new cja(cjd.rw));
         }
      }

      $$2.a(djo.l);
      return $$0;
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      cbp $$3 = $$0.o();
      cja $$4 = $$0.n();
      dfe $$5 = $$1.a_($$2);
      if ($$0.k() != hc.a && $$5.a(apo.ca) && ckz.d($$4) == cla.c) {
         $$1.a(null, $$2, aoz.jb, apa.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cjc.a($$4, $$3, new cja(cjd.rw)));
         $$3.b(apj.c.b($$4.d()));
         if (!$$1.B) {
            akn $$6 = (akn)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(ix.ag, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, aoz.ch, apa.e, 1.0F, 1.0F);
         $$1.a(null, djo.z, $$2);
         $$1.b($$2, csr.rH.n());
         return bgt.a($$1.B);
      } else {
         return bgt.d;
      }
   }

   @Override
   public int b(cja $$0) {
      return 32;
   }

   @Override
   public ckt c(cja $$0) {
      return ckt.c;
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      return cjc.a($$0, $$1, $$2);
   }

   @Override
   public String j(cja $$0) {
      return ckz.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
      ckz.a($$0, $$2, 1.0F);
   }
}
