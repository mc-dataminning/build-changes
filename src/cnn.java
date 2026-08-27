import java.util.List;
import javax.annotation.Nullable;

public class cnn extends cmt {
   private static final int a = 32;

   public cnn(cmt.a $$0) {
      super($$0);
   }

   @Override
   public cmy am_() {
      return coy.a(super.am_(), coz.c);
   }

   @Override
   public cmy a(cmy $$0, ctp $$1, bml $$2) {
      cfi $$3 = $$2 instanceof cfi ? (cfi)$$2 : null;
      if ($$3 instanceof ane) {
         am.A.a((ane)$$3, $$0);
      }

      if (!$$1.B) {
         for (bli $$5 : coy.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new bli($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(asc.c.b(this));
         if (!$$3.fT().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fT().d) {
         if ($$0.b()) {
            return new cmy(cnb.si);
         }

         if ($$3 != null) {
            $$3.fS().e(new cmy(cnb.si));
         }
      }

      $$2.a(dnr.l);
      return $$0;
   }

   @Override
   public bkb a(cpj $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      cfi $$3 = $$0.o();
      cmy $$4 = $$0.n();
      djh $$5 = $$1.a_($$2);
      if ($$0.k() != ic.a && $$5.a(ash.ca) && coy.d($$4) == coz.c) {
         $$1.a(null, $$2, ars.jE, art.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cna.a($$4, $$3, new cmy(cnb.si)));
         $$3.b(asc.c.b($$4.d()));
         if (!$$1.B) {
            and $$6 = (and)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(jx.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, ars.ch, art.e, 1.0F, 1.0F);
         $$1.a(null, dnr.z, $$2);
         $$1.b($$2, cws.sI.o());
         return bkb.a($$1.B);
      } else {
         return bkb.d;
      }
   }

   @Override
   public int b(cmy $$0) {
      return 32;
   }

   @Override
   public cos c(cmy $$0) {
      return cos.c;
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      return cna.a($$0, $$1, $$2);
   }

   @Override
   public String j(cmy $$0) {
      return coy.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
      coy.a($$0, $$2, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
   }
}
