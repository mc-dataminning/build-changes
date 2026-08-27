import java.util.List;
import javax.annotation.Nullable;

public class cjw extends cjc {
   private static final int a = 32;

   public cjw(cjc.a $$0) {
      super($$0);
   }

   @Override
   public cjh ai_() {
      return clg.a(super.ai_(), clh.c);
   }

   @Override
   public cjh a(cjh $$0, cpx $$1, bji $$2) {
      cbw $$3 = $$2 instanceof cbw ? (cbw)$$2 : null;
      if ($$3 instanceof akt) {
         al.z.a((akt)$$3, $$0);
      }

      if (!$$1.B) {
         for (bif $$5 : clg.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new bif($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(app.c.b(this));
         if (!$$3.fS().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fS().d) {
         if ($$0.b()) {
            return new cjh(cjk.rw);
         }

         if ($$3 != null) {
            $$3.fR().e(new cjh(cjk.rw));
         }
      }

      $$2.a(djv.l);
      return $$0;
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      cbw $$3 = $$0.o();
      cjh $$4 = $$0.n();
      dfl $$5 = $$1.a_($$2);
      if ($$0.k() != hc.a && $$5.a(apu.ca) && clg.d($$4) == clh.c) {
         $$1.a(null, $$2, apf.jb, apg.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cjj.a($$4, $$3, new cjh(cjk.rw)));
         $$3.b(app.c.b($$4.d()));
         if (!$$1.B) {
            aks $$6 = (aks)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(ix.ag, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, apf.ch, apg.e, 1.0F, 1.0F);
         $$1.a(null, djv.z, $$2);
         $$1.b($$2, csy.rH.n());
         return bha.a($$1.B);
      } else {
         return bha.d;
      }
   }

   @Override
   public int b(cjh $$0) {
      return 32;
   }

   @Override
   public cla c(cjh $$0) {
      return cla.c;
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      return cjj.a($$0, $$1, $$2);
   }

   @Override
   public String j(cjh $$0) {
      return clg.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
      clg.a($$0, $$2, 1.0F);
   }
}
