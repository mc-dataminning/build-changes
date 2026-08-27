import java.util.List;

public class ctw extends csu {
   public ctw(csu.a $$0) {
      super($$0);
   }

   public static cwc h() {
      return new cwc(List.of(cwc.a.a(List.of(ddg.bs), 15.0F), cwc.a.b(avr.O, 15.0F), cwc.a.b(avr.a, 5.0F), cwc.a.b(List.of(ddg.ff, ddg.fg), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(csz $$0, dad $$1, dqh $$2, in $$3, bsa $$4) {
      if (!$$1.B && !$$2.a(avr.aK)) {
         $$0.a(1, $$4, bro.a);
      }

      return $$2.a(avr.O)
         || $$2.a(ddg.bs)
         || $$2.a(ddg.bt)
         || $$2.a(ddg.bu)
         || $$2.a(ddg.bv)
         || $$2.a(ddg.sG)
         || $$2.a(ddg.ff)
         || $$2.a(ddg.fI)
         || $$2.a(avr.a);
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      dqh $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dgt $$5 && !$$5.o($$3)) {
         clh $$6 = $$0.o();
         csz $$7 = $$0.n();
         if ($$6 instanceof aqi) {
            am.N.a((aqi)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, avc.lk, avd.e, 1.0F, 1.0F);
         dqh $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dva.c, $$2, dva.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bsa.d($$0.p()));
         }

         return bpm.a($$1.B);
      }

      return super.a($$0);
   }
}
