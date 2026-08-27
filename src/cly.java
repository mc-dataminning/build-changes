import java.util.List;
import javax.annotation.Nullable;

public class cly extends cle {
   private static final int a = 32;

   public cly(cle.a $$0) {
      super($$0);
   }

   @Override
   public clj al_() {
      return cni.a(super.al_(), cnj.c);
   }

   @Override
   public clj a(clj $$0, csa $$1, blg $$2) {
      cdu $$3 = $$2 instanceof cdu ? (cdu)$$2 : null;
      if ($$3 instanceof amf) {
         al.z.a((amf)$$3, $$0);
      }

      if (!$$1.B) {
         for (bkd $$5 : cni.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new bkd($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(arb.c.b(this));
         if (!$$3.fU().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fU().d) {
         if ($$0.b()) {
            return new clj(clm.si);
         }

         if ($$3 != null) {
            $$3.fT().e(new clj(clm.si));
         }
      }

      $$2.a(dls.l);
      return $$0;
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      cdu $$3 = $$0.o();
      clj $$4 = $$0.n();
      dhi $$5 = $$1.a_($$2);
      if ($$0.k() != hx.a && $$5.a(arg.ca) && cni.d($$4) == cnj.c) {
         $$1.a(null, $$2, aqr.jv, aqs.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cll.a($$4, $$3, new clj(clm.si)));
         $$3.b(arb.c.b($$4.d()));
         if (!$$1.B) {
            ame $$6 = (ame)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(js.ah, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, aqr.ch, aqs.e, 1.0F, 1.0F);
         $$1.a(null, dls.z, $$2);
         $$1.b($$2, cvc.sI.o());
         return bix.a($$1.B);
      } else {
         return bix.d;
      }
   }

   @Override
   public int b(clj $$0) {
      return 32;
   }

   @Override
   public cnc c(clj $$0) {
      return cnc.c;
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      return cll.a($$0, $$1, $$2);
   }

   @Override
   public String j(clj $$0) {
      return cni.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
      cni.a($$0, $$2, 1.0F);
   }
}
