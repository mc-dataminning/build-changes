import java.util.List;
import javax.annotation.Nullable;

public class clq extends ckw {
   private static final int a = 32;

   public clq(ckw.a $$0) {
      super($$0);
   }

   @Override
   public clb al_() {
      return cna.a(super.al_(), cnb.c);
   }

   @Override
   public clb a(clb $$0, crs $$1, bky $$2) {
      cdm $$3 = $$2 instanceof cdm ? (cdm)$$2 : null;
      if ($$3 instanceof amb) {
         al.z.a((amb)$$3, $$0);
      }

      if (!$$1.B) {
         for (bjv $$5 : cna.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new bjv($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(aqx.c.b(this));
         if (!$$3.fT().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fT().d) {
         if ($$0.b()) {
            return new clb(cle.rx);
         }

         if ($$3 != null) {
            $$3.fS().e(new clb(cle.rx));
         }
      }

      $$2.a(dlg.l);
      return $$0;
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      cdm $$3 = $$0.o();
      clb $$4 = $$0.n();
      dgw $$5 = $$1.a_($$2);
      if ($$0.k() != hx.a && $$5.a(arc.ca) && cna.d($$4) == cnb.c) {
         $$1.a(null, $$2, aqn.jf, aqo.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cld.a($$4, $$3, new clb(cle.rx)));
         $$3.b(aqx.c.b($$4.d()));
         if (!$$1.B) {
            ama $$6 = (ama)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(js.ah, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, aqn.ch, aqo.e, 1.0F, 1.0F);
         $$1.a(null, dlg.z, $$2);
         $$1.b($$2, cuv.rH.o());
         return biq.a($$1.B);
      } else {
         return biq.d;
      }
   }

   @Override
   public int b(clb $$0) {
      return 32;
   }

   @Override
   public cmu c(clb $$0) {
      return cmu.c;
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      return cld.a($$0, $$1, $$2);
   }

   @Override
   public String j(clb $$0) {
      return cna.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(clb $$0, @Nullable crs $$1, List<ur> $$2, cms $$3) {
      cna.a($$0, $$2, 1.0F);
   }
}
