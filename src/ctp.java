import java.util.List;
import javax.annotation.Nullable;

public class ctp extends csu {
   private static final int a = 32;

   public ctp(csu.a $$0) {
      super($$0);
   }

   @Override
   public csz v() {
      csz $$0 = super.v();
      $$0.b(ka.E, new cuy(cuz.a));
      return $$0;
   }

   @Override
   public csz a(csz $$0, dad $$1, bsa $$2) {
      clh $$3 = $$2 instanceof clh ? (clh)$$2 : null;
      if ($$3 instanceof aqi) {
         am.A.a((aqi)$$3, $$0);
      }

      if (!$$1.B) {
         cuy $$4 = $$0.a(ka.E, cuy.a);
         $$4.a($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$3, $$3, $$2, $$2x.e(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(avm.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fN()) {
         if ($$0.d()) {
            return new csz(ctc.sl);
         }

         if ($$3 != null) {
            $$3.ga().f(new csz(ctc.sl));
         }
      }

      $$2.a(dva.l);
      return $$0;
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      clh $$3 = $$0.o();
      csz $$4 = $$0.n();
      cuy $$5 = $$4.a(ka.E, cuy.a);
      dqh $$6 = $$1.a_($$2);
      if ($$0.k() != is.a && $$6.a(avr.ci) && $$5.a(cuz.a)) {
         $$1.a(null, $$2, avc.kd, avd.e, 1.0F, 1.0F);
         $$3.a($$0.p(), ctb.a($$4, $$3, new csz(ctc.sl)));
         $$3.b(avm.c.b($$4.f()));
         if (!$$1.B) {
            aqh $$7 = (aqh)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(kx.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, avc.cB, avd.e, 1.0F, 1.0F);
         $$1.a(null, dva.z, $$2);
         $$1.b($$2, ddg.sI.n());
         return bpm.a($$1.B);
      } else {
         return bpm.d;
      }
   }

   @Override
   public int b(csz $$0) {
      return 32;
   }

   @Override
   public cus c(csz $$0) {
      return cus.c;
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      return ctb.a($$0, $$1, $$2);
   }

   @Override
   public String i(csz $$0) {
      return cuw.a($$0.a(ka.E, cuy.a).f(), this.a() + ".effect.");
   }

   @Override
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      cuy $$4 = $$0.a(ka.E);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }
}
